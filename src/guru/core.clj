(ns  guru.core
    (:require [guru.route :refer :all]
              [ring.middleware.json :as json]
              [compojure.handler :as handler]
            ))


(def app
  (-> (handler/site app-routes)
      (json/wrap-json-body)
      (json/wrap-json-response)))


