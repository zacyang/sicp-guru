(ns guru.route
  (:require [compojure.route :as route]
            [compojure.core :refer :all]))

(defroutes app-routes
  (context  "/status" []
           (defroutes status-routes
             (GET "/" [] ())
             ))

  (context "/config" [] 
           (defroutes configuration-routes
             (GET "/" [] ())
             (POST "/" {body :body} ())
             ))

  (context "/questions" []
           (defroutes question-routes
             (GET "/:id" [id] (println id))))

  (route/not-found "NOT FOUND")
)
