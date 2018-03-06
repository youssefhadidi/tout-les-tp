Lecluse Alexis - Evrard William

Hanoi : package, import, CLASSPATH, javadoc, tests, jar.

# Générer la doc #
cd src; javadoc hanoi hanoi.util -d ../docs; cd ../

# Compiler les classes #
cd src; javac hanoi/Hanoi.java hanoi/HanoiMain.java hanoi/util/Tower.java hanoi/util/Disc.java -d ../classes; cd ../


# Compiler les tests #
javac -classpath .:test-1.7.jar test/DiscTest.java test/HanoiTest.java test/TowerTest.java


# Exécuter les tests #
java -jar test-1.7.jar HanoiTest
java -jar test-1.7.jar TowerTest
java -jar test-1.7.jar DiscTest

# Générer le fichier .jar #
cd classes; jar cvf ../hanoi.jar hanoi; cd ../   ( sans manifest )

cd classes; jar cvfm ../hanoi.jar ../manifest-ex hanoi * ; cd ../  ( avec manifest )
# Exécuter le jar #
java -classpath hanoi.jar hanoi.HanoiMain nomDuJoueur nombreDeDisques ( sans manifest )

java -jar hanoi.jar nomDuJoueur nombreDeDisques ( avec manifest )

# récupérer le projet par git pull, placez vous dans le dossier TP_Hanoi/ et exécutez les commandes #

