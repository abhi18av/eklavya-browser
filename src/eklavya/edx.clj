(require '[sparkledriver.browser :refer [with-browser make-browser fetch!]])
(require '[sparkledriver.element :refer [find-by-xpath* text]])

(with-browser [browser (make-browser :headless false)]
  (-> (fetch! browser "http://clojure.org")
      (find-by-xpath* "//div[@class='clj-intro-message']/p")
      (nth 2)
      text))
