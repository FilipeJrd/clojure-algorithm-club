(ns clojure-algorithm-club.sort.quicksort-test
  (:require [clojure-algorithm-club.sort.quicksort :as sut]
            [schema.core :as s]
            [schema-generators.generators :as g]
            [clojure.test.check.properties :as p]
            [clojure.test.check.clojure-test :refer :all]))

(defspec quicksort
  (p/for-all [number-list (g/generator [s/Int])]
    (-> (sut/quicksort number-list)
        (#(or (empty? %) (apply <= %))))))
