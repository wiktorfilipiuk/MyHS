clear

javac -d . CardDatabase/CardsDB.java

javac -d . Board/PlayerBoardInterface.java
javac -d . Board/Board.java

javac -d . Cards/Card.java
javac -d . Cards/MinionCard.java
javac -d . Cards/WeaponCard.java
javac -d . Cards/SpellCard.java

javac -d . Players/Player.java

javac playHS.java
java playHS -filepath /CardDatabase/cardsDB.txt -p1 Mesuri -p2 Monoris