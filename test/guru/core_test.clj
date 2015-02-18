(ns guru.core-test
  (:require [clojure.test :refer :all]
            [guru.core :refer :all :as functionsUnderTest]))

(deftest route-function-tests
  (def expected-json {:key "123"})
  (testing "should give a json in 200 OK"
    (is (= expected-json (functionsUnderTest/handle request))))
  (testing "should give 404 when no associated item is found")
)
(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 0))))
