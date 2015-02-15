(ns guru.core
  (:require [compojure.core :refer :all]
            [compojure.route :as route]))


(defroutes app-routes
  (GET "/" [] "hello")
  (route/not-found "not found")
)
