(ns awesome.screens.about
  (:require [reagent.core :as r :refer [atom]]
            [awesome.shared.ui :as ui]
            [awesome.images :as img]))

(def about
  {:component
   (r/create-class
    {:reagent-render
     (fn []
       [ui/view
        [ui/text "about ME!!"]])})
   :config
   {:icon img/logo-img
    :selected-icon img/logo-img
    :title "About Title"
    :screen :about
    :label "About Label"}})

