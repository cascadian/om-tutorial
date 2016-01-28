(ns om-tutorial.app-database.exercises)

(def cars-table
  {
   ; TODO (exercise 1): Add a :cars/by-id table
   :cars/by-id {1 { :id 1 :make "Nissan" :model "Leaf" }
                2 { :id 2 :make "Dodge" :model "Dart" }
                3 { :id 3 :make "Ford" :model "Mustang" }}
   })

(def favorites
  ; TODO (exercise 2): merge your cars table from above here
  {
   ; TODO (exercise 2): Add a :favorite-car key that points to the Nissan Leaf via an ident
   })

(def ex3-uidb
  {
   ; TODO (exercise 3): Add tables. See exercise text.
   })
