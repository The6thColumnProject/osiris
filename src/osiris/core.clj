(ns osiris.core
  (:require [clojure.pprint :refer [pprint]])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (when (= 1 1)
    (pprint "hello"))
  (pprint args)
  (println "Hello, World!"))
