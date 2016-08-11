(ns awesome.handlers
  (:require
    [re-frame.core :refer [register-handler after]]
    [schema.core :as s :include-macros true]
    [awesome.db :as db :refer [app-db DBSchema]]))

;; -- Middleware ------------------------------------------------------------

(def validate-mw
  (if goog.DEBUG
    (after (partial s/validate DBSchema))
    []))

;; -- Handlers --------------------------------------------------------------

(register-handler
  :initialize-db
  validate-mw
  (fn [_ _]
    app-db))

(register-handler
  :set-greeting
  validate-mw
  (fn [db [_ value]]
    (assoc db :greeting value)))
