(ns clojure-algorithm-club.fibonacci.naive)

(defn fib
  [elem]
  (cond
    (= elem 0) 0
    (= elem 1) 1
    :else (+ (fib (- elem 1))
             (fib (- elem 2)))))
