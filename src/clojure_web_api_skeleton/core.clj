(ns clojure-web-api-skeleton.core
  (:require [clojure-web-api-skeleton.system.server :as server]
            [com.stuartsierra.component :as component]))

(defn api 
  "Set up API system map"
  [port]
  (component/system-map :web-server (server/web-server port)))

(defn -main [port]
  (-> (component/start (api port))))
