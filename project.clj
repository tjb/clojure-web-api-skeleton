(defproject clojure-web-api-skeleton "1.0.0"
  :description "This is a skeleton project for an API server using Clojure, Compojure, Ring, Component, and PostgreSQL"
  :url "http://github.com/tjb/clojure-web-api-skeleton"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [ring/ring "1.8.0"]
                 [ring/ring-json "0.5.0"]
                 [ring-cors "0.1.13"]
                 [compojure "1.6.1"]
                 [honeysql "0.9.8"]
                 [seancorfield/next.jdbc "1.1.569"]
                 [org.postgresql/postgresql "42.2.10.jre7"]
                 [com.stuartsierra/component "0.4.0"]
                 [migratus "1.2.8"]]
  :main ^:skip-aot clojure-web-api-skeleton.core
  :repl-options {:init-ns clojure-web-api-skeleton.core})
