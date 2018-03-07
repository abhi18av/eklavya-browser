(defproject eklavya "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [sparkledriver "0.2.2"]
                 [zcaudate/hara "2.8.2"]

;; This inclusion causes many errors in the code
;                 [zcaudate/lucid "1.4.4"]
;                 [zcaudate/lucid "1.4.4" :exclusions [org.slf4j/slf4j-log4j] ]
                 [commons-codec "1.9"]


 [com.datomic/client-pro "0.8.14"]

;; https://github.com/bhauman/rebel-readline

                            ;; This is for traversing the nested clojure data structure
                 [com.rpl/specter "1.0.3"]

                            ;; Utility for traversing CLJ(S) data structures
                 [medley "1.0.0"]

                            ; Quickcheck
                 [org.clojure/test.check "0.10.0-alpha2"]

                 [org.clojure/core.async "0.4.474"]

                                        ;[co.paralleluniverse/pulsar "0.7.7-SNAPSHOT"]
                                        ; https://github.com/tonsky/datascript
                 [org.clojure/core.logic "0.8.11"]
                 [hiccup "1.0.5"]

                 [tick "0.3.5"]
                 [org.clojure/core.match "0.3.0-alpha5"]

;; Documentation using marginalia
                 [lein-marginalia "0.9.0"]

;; Boot documenataion tool Codox
                 [lein-codox "0.10.3"]

;; Shell library
                 [me.raynes/conch "0.8.0"]

                 [org.clojars.turbopape/milestones "1.0.1"]

;;Logging 
                 [com.taoensso/timbre "4.10.0"]
                 [com.fzakaria/slf4j-timbre "0.3.8"]

                 [enlive "1.1.6"]
                 [spyscope "0.1.6"]

;; JSON
                 [cheshire "5.8.0"]

;; PostgreSQL
                 [honeysql "0.9.1"]
                 [nilenso/honeysql-postgres "0.2.3"]

; [org.clojure/core.typed "0.4.3"]
]
  :main ^:skip-aot eklavya.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
