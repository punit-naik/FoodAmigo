(ns foodamigo.web.combinedroutes
  (:use [ring.util.response])
  (:require [compojure.core :refer :all]
                 [compojure.route :as routes]
                 [taoensso.timbre :as timbre]
                 [noir.session :as session]))


(def approutes
	(routes
		
		(routes/not-found "Not Found")
		)
	)
