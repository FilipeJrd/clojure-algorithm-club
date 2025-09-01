# Introduction

This project gathers small, focused implementations of classic algorithms written in [Clojure](https://clojure.org/). The intent is to offer approachable references that show idiomatic functional solutions and accompanying tests. Each algorithm lives in its own namespace under `src/clojure_algorithm_club` with matching tests under `test/`.

## Included algorithms

### Fibonacci

The Fibonacci sequence is implemented in three different styles to highlight their trade-offs:

* **Naïve recursion** – straightforward but recomputes values and quickly becomes slow.
* **Accumulative** – builds up a collection of intermediate results, illustrating dynamic programming.
* **Space-optimised accumulative** – carries only the two most recent values for an iterative, constant-space solution.

### Sorting

* **Quicksort** – a functional implementation that partitions the input with `group-by` and recursively sorts the sublists.

### Trees

* **Depth-first search (DFS)** – a simple pre-order traversal using recursive descent through a tree structure.

## Running the code

1. Start a REPL with `lein repl` and load the desired namespace, e.g. `(require 'clojure-algorithm-club.sort.quicksort)`.
2. Evaluate the function you wish to explore. All functions are pure and operate on basic Clojure data structures.

Example session:

```clj
;; Fibonacci
(require '[clojure-algorithm-club.fibonacci.accumulative-space-optimized :as fib])
(fib/fib 8)
;;=> 21

;; Quicksort
(require '[clojure-algorithm-club.sort.quicksort :as qs])
(qs/quicksort [3 1 4 1 5 9])
;;=> (1 1 3 4 5 9)

;; Depth-first search
(require '[clojure-algorithm-club.trees.dfs.naive-recursion :as dfs])
(dfs/walk [:a [:b [:d] [:e]] [:c]])
;;=> (:a :b :d :e :c)
```

## Tests

Property and example based tests ensure that the algorithms behave as expected. Execute them with:

```
lein test
```

The tests also serve as usage examples for each function.
