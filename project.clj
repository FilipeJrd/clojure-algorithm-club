(defproject clojure-algorithm-club "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [prismatic/schema "1.1.12"]
                 [nubank/matcher-combinators "1.2.1"]
                 [nubank/selvage "1.0.0-BETA"]
                 [prismatic/schema-generators "0.1.3"]]
  :repl-options {:init-ns clojure-algorithm-club.core})
