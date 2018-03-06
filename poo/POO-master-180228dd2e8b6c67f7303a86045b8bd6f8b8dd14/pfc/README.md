Lecluse Alexis - Evrard William

Rock Paper Scissors : package, import, CLASSPATH, javadoc, tests, jar.

# Générer la doc #
cd src; javadoc game game.util game.util.strategies -d ../docs; cd ../

# Compiler les classes #
cd src; javac * -d ../classes; cd ../;

# Compiler les tests #
javac -classpath .:test-1.7.jar test/*


# Exécuter les tests #
java -jar test-1.7.jar TestGame
java -jar test-1.7.jar TestPlayer
java -jar test-1.7.jar TestStrategy

# Générer le fichier .jar #
jar cvf ../game.jar classes/*;   ( sans manifest )

jar cvfm game.jar manifest-ex game classes/* ;  ( avec manifest )
# Exécuter le jar #
java -classpath game.jar game.Main PlayerName nbStrategy nbTurns ( sans manifest )

java -jar game.jar PlayerName nbStrategy nbTurns  ( avec manifest )

# récupérer le projet par git pull, placez vous dans le dossier game/ et exécutez les commandes #
