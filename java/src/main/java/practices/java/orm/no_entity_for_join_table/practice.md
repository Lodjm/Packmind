# Do not create entities and repositories for join tables

Instead, model the relationship between the 2 main entities.

The resulting code will be more straight forward and easier to understand.
Performances are to take into consideration as well, and should improve if the actual database model
is well designed according to the queries you need to perform.

Using entities for join tables can be a smell that the database model and/or the object model
it maps to are not designed to support the queries you are implementing.