(ns awesome.utils
  (:require [camel-snake-kebab.core :as cs]
            [camel-snake-kebab.extras :refer [transform-keys]]))


(defn clj->camel-js [m]
  (clj->js (transform-keys cs/->camelCaseString m)))





