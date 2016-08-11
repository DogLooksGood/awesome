(ns awesome.components.greeting
  (:require [re-frame.core :refer [subscribe dispatch dispatch-sync]]
            [awesome.shared.ui :refer [text]]))

(def styles
  {:greeting {:font-size 30}})

(defn greetings []
  (let [greeting (subscribe [:get-greeting])]
    (fn []
      [text {:style (styles :greeting)} "Hello World"])))

