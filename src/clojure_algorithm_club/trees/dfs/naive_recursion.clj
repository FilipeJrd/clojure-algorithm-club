(ns clojure-algorithm-club.trees.dfs.naive-recursion)

(defn walk
  [[value & subtrees]]
  (when value
    (concat [value]
            (mapcat walk subtrees))))
