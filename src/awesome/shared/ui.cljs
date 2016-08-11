(ns awesome.shared.ui
  (:require [reagent.core :as r :refer [atom]]))

(def ReactNative (js/require "react-native"))
(def text (r/adapt-react-class (.-Text ReactNative)))
(def view (r/adapt-react-class (.-View ReactNative)))
(def image (r/adapt-react-class (.-Image ReactNative)))
(def touchable-highlight (r/adapt-react-class (.-TouchableHighlight ReactNative)))

