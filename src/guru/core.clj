(ns  guru.core
  ^{:author yangyang}
  (:require [guru.route :as route]
            [ring.middleware.json :as json]
            [compojure.handler :as handler]
            ))


(def ^:private app
  (-> (handler/site route/app-routes)))
