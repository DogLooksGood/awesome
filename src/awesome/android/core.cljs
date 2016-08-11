(ns awesome.android.core
  (:require [reagent.core :as r :refer [atom]]
            [re-frame.core :refer [subscribe dispatch dispatch-sync]]
            [awesome.shared.navigation :as nav]
            [awesome.screens.home :refer [home]]
            [awesome.screens.about :refer [about]]
            [awesome.handlers]
            [awesome.subs]))

(defn init-nav []
  (nav/start-tab-based-app!
   [home about]))

(defn init []
  (dispatch-sync [:initialize-db])
  (init-nav))
