(defn blank? [str]
  (every? #(Character/isWhitespace %) str))

(defrecord Person [first-name last-name])
(def foo (->Person "Aaron" "Bedra"))

(defn hello-world [username]
  (println (format "Hello, %s" username)))

