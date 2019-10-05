(ns clojure-algorithm-club.fibonacci.accumulative-space-optimized)

(defn- drop-first
  [coll]
  (drop 1 coll))

(defn- next-fib
  [p1 p2 ammount]
  (if (= ammount 0)
    p2
    (recur p2 (+ p1 p2) (dec ammount))))

(defn fib
  [elem]
  (cond
    (= elem 0) 0
    (= elem 1) 1
    :else (next-fib 0 1 (dec elem))))
