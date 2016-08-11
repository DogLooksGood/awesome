(ns awesome.shared.navigation
  (:require [reagent.core :as r :refer [atom]]
            [awesome.utils :as u]
            [schema.core :as s :include-macros true]))

(def Navigation (aget (js/require "react-native-navigation") "Navigation"))

(s/defschema NavScreenConfig
  {:screen s/Keyword
   (s/optional-key :title) s/Str
   (s/optional-key :label) s/Str
   :icon s/Any
   :selected-icon s/Any})

(s/defschema NavScreen
  {:component s/Any
   :config    NavScreenConfig})

(s/defn register-component! [screen :- NavScreen]
  (let [component (r/reactify-component (:component screen))]
    (.registerComponent Navigation
                        (-> screen :config :screen name)
                        (fn [] component))))

(s/defn start-tab-based-app! [screens :- [NavScreen]]
  ;; register all screens
  (doseq [screen screens]
    (register-component! screen))
  ;; start tab based app
  (let [tabs-config (map :config screens)]
    (.startTabBasedApp Navigation
                       (u/clj->camel-js
                        {:tabs tabs-config}))))
