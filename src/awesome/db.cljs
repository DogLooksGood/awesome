(ns awesome.db
  (:require [schema.core :as s :include-macros true]))

(def DBSchema
  {:greeting s/Str})

;; initial state of app-db
(def app-db {:greeting "Hello Clojure in iOS and Android!"})

