(ns lab2.core-test
  (:require [clojure.test :refer :all]
            [lab2.core :refer :all]))



(deftest a-test
  (testing "check results"
    (are [result  arg1] (= result                     (get-numbers arg1 ) )
                          '([1 2 3 4] [5 6] [7 8 9])  [:start 1 2 3 4 :end 4 :start 5 6 :end 5 6 4 :start  7 8 9 :end]
                          '([] [])                    [:start  :end 4 :start :end ]
                          '()                         []
                          '([] [9])                   [:start  :end 4 :start 9 :end ]
                          '([1] [])                   [:start 1 :end 4 :start :end 5 ]
                          '([1 2] [8 9])              [:start 1 2 :end 4 :start 8 9 :end ]
                          '([])                       [:start  :end ]
                          '([6 6 6])                  [:start 6 6 6 :end 4 ]
    )))
