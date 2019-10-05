(ns clojure-algorithm-club.sort.quicksort)

(defn quicksort
  [[pivot & remaining]]
  (when pivot
    (let [splitted (group-by (partial < pivot) remaining)
          {smaller false bigger true} splitted]
      (concat (quicksort smaller)
              [pivot]
              (quicksort bigger)))))
