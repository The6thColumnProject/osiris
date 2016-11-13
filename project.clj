(defproject org.clojars.6thcolum/osiris "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://6thcolumn.org/osiris"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot osiris.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
