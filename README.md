# clojure-algorithm-club

A small collection of classic algorithms implemented in [Clojure](https://clojure.org/). The project is organised as a library of examples, each with a matching test suite demonstrating expected behaviour.

## Algorithms

- **Fibonacci**: naive recursion, accumulative, and space-optimised iterative variants.
- **Quicksort**: a functional implementation using `group-by` to partition the input.
- **Depth-first search**: naive recursive traversal of a tree structure.

See [doc/intro.md](doc/intro.md) for a fuller introduction to the codebase.

## Usage

Clone the repository and explore the functions from a REPL:

```bash
lein repl
```

Once inside the REPL, require the namespace you are interested in and call the desired function. Example session:

```clj
;; Fibonacci
(require '[clojure-algorithm-club.fibonacci.naive :as fib])
(fib/fib 10)
;;=> 55

;; Quicksort
(require '[clojure-algorithm-club.sort.quicksort :as qs])
(qs/quicksort [3 1 4 1 5])
;;=> (1 1 3 4 5)

;; Depth-first search
(require '[clojure-algorithm-club.trees.dfs.naive-recursion :as dfs])
(dfs/walk [:a [:b [:d] [:e]] [:c]])
;;=> (:a :b :d :e :c)
```

All functions work with plain Clojure data structures.

## Running tests

Execute the complete test suite with:

```bash
lein test
```

## Contributing

Contributions are welcome! If you have an idea for another classic algorithm,
open an issue or pull request with a description and implementation. Examples
include breadth-first search, merge sort, Dijkstra's algorithm and more.

## License

Copyright © 2019 Clojure Algorithm Club contributors

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
