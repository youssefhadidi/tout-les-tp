Lecluse Alexis - Evrard William

Compilation (suite) : package, import, CLASSPATH, javadoc, tests, jar.

# Générer la doc #
cd src; javadoc example example.util -d ../docs; cd ../

# Compiler les classes #
cd src; javac example/Robot.java example/util/Box.java example/util/ConveyerBelt.java -d ../classes; cd ../


# Compiler les tests #
javac -classpath .:test-1.7.jar test/BoxTest.java test/RobotTest.java


# Exécuter les tests #
java -jar test-1.7.jar RobotTest
java -jar test-1.7.jar BoxTest

# Générer le fichier .jar #
cd classes; jar cvf ../appli.jar example; cd ../   ( sans manifest )

cd classes; jar cvfm ../appli.jar ../manifest-ex example; cd ../  ( avec manifest )
# Exécuter le jar #
java -classpath appli.jar example.Robot ( sans manifest )

java -jar appli.jar ( avec manifest )

# récupérer le projet par git pull, placez vous dans le dossier TP4/ et exécutez les commandes #
