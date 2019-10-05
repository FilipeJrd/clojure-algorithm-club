(ns clojure-algorithm-club.fibonacci.accumulative-test
  (:require [clojure-algorithm-club.fibonacci.accumulative :as sut]
            [clojure.test :refer :all]))

(deftest fibonacci
  (doseq [[input result] (map list
                              (range 0 7)
                              [0 1 1 2 3 5 8])]
    (is (= (sut/fib input) result))))
