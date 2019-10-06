(ns clojure-algorithm-club.trees.dfs.naive-recursion-test
  (:require [clojure-algorithm-club.trees.dfs.naive-recursion :as sut]
            [clojure.test :refer :all]))

(deftest dfs
  (are [tree result]
      (is (= (sut/walk tree) result))
    [10 [5 [2 [3] [4]] [1]] [9 [] [10]]] [10 5 2 3 4 1 9 10]))
