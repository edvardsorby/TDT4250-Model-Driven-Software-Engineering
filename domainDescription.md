The domain I was modelling was board game applications.

I tried to capture aspects such as generating capabilities, multiplayer modes, saving of sheets and rankings. 

However I did not manage to model it as well as I wanted, mainly because I did not manage to specify the types of boards sheetconfig. I could not model the relations between the different sheets(which are specific setups of boards such as in chess puzzles) directly in the metamodel, since then there would have been specific players, sheets etc in the application model, which is wrong. Then I tried to capture the abstract structure of these relations, but I did not a good job of that since i couldn not figure out how to define the classes of attributes as specifically as I wanted. I would have for example used that to check whether the app has online if it has rankings to validate the model with regards to the metamodel.

I also left out things like custom themes and localization, since I deemed it not as relevant anymore.
