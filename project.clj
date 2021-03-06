(defproject sicp-guru "0.1.0-SNAPSHOT"
  :description "service for handling client clojure code"
  :url "https://github.com/zacyang/sicp-guru"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.3.1"]
                 [ring/ring-core "1.3.2"]
                 [ring/ring-jetty-adapter "1.3.2"]
                 [ring/ring-json "0.3.1"]]
  :plugins [[lein-ring "0.9.1"]
            [cider/cider-nrepl "0.8.2"]]
  :ring {:handler guru.core/app}
  :profiles {:dev 
             {:dependencies [[ring-mock "0.1.5"]]}}
  )
