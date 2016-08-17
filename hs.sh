clear

javac -d . CardDatabase/CardsDB.java

javac -d . Classes/Classes.java
javac -d . Classes/Druid.java
javac -d . Classes/Hunter.java
javac -d . Classes/Mage.java
javac -d . Classes/Paladin.java
javac -d . Classes/Priest.java
javac -d . Classes/Rogue.java
javac -d . Classes/Shaman.java
javac -d . Classes/Warlock.java
javac -d . Classes/Warrior.java

javac -d . Board/PlayerBoardInterface.java
javac -d . Board/Board.java

javac -d . Cards/Card.java
javac -d . Cards/MinionCard.java
javac -d . Cards/WeaponCard.java
javac -d . Cards/SpellCard.java

javac -d . Players/Player.java

javac playHS.java
java playHS -filepath /CardDatabase/cardsDB.txt -p1 Mesuri -p2 Monoris -c1 Shaman -c2 Priest