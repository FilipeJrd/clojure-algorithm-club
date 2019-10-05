(ns clojure-algorithm-club.fibonacci.accumulative-space-optimized-test
  (:require [clojure-algorithm-club.fibonacci.accumulative-space-optimized :as sut]
            [clojure.test :refer :all]))

(deftest fibonacci
  (doseq [[input result] (map list
                              (range 0 7)
                              [0 1 1 2 3 5 8])]
    (is (= (sut/fib input) result))))
