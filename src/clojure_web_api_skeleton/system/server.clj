(ns clojure-web-api-skeleton.system.server
  (:require [ring.adapter.jetty :as jetty]
            [com.stuartsierra.component :as component]))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body "Hello Clojure, Hello Ring!"})

(defn start-server 
  "Helper function to start the server when the component's start function is called"
  [port]
  (let [server (jetty/run-jetty handler {:port (Integer. port)})]
    server))

(defn stop-server 
  "Helper function to stop the server when the component's stop function is called"
  [server]
  (when server
    (dissoc server :server)))

(defrecord WebServer [port]
  component/Lifecycle
  (start [this]
    (assoc this :server (start-server port)))
  (stop [this]
    (stop-server (:server this))
    (dissoc this :server)))

(defn web-server 
  "Map web server to component"
  [port]
  (map->WebServer {:port port}))