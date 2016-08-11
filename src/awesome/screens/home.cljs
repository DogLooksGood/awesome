(ns awesome.screens.home
  (:require [reagent.core :as r :refer [atom]]
            [awesome.shared.ui :as ui]
            [awesome.components.greeting :refer [greetings]]
            [awesome.images :as img]))

(def home
  {:component
   (r/create-class
    {:reagent-render
     (fn []
       [ui/view
        [greetings]])})
   :config
   {:icon img/logo-img
    :selected-icon img/logo-img
    :title "Home Title"
    :screen :home
    :label "Home Label"}})


