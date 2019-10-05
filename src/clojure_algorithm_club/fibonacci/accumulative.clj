(ns clojure-algorithm-club.fibonacci.accumulative)

(defn- previous-tuple-sum
  [previous elem]
  (+ (get previous (- elem 2))
     (get previous (- elem 1))))

(defn- fib-from-previous
  [previous elem]
  (-> previous
      (conj (previous-tuple-sum previous elem))))

(defn fib
  [elem]
  (let [base-values   [0 1]
        missing-elems (range 2 (inc elem))]
    (->> missing-elems
         (reduce fib-from-previous base-values)
         (#(get % elem)))))
