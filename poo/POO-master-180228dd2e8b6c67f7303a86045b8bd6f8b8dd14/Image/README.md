Lecluse Alexis - Evrard William

Image : package, import, CLASSPATH, javadoc, tests, jar.

# Générer la doc #
cd src; javadoc image image.color -d ../docs; cd ../;

# Compiler les classes #
cd src; javac image/*.java -d ../classes; cd ../;


# Compiler les tests #
javac -classpath .:test-1.7.jar test/*.java;


# Exécuter les tests #
java -jar test-1.7.jar GrayColorTest;
java -jar test-1.7.jar ImageTest;
java -jar test-1.7.jar PixelTest;

# Générer le fichier .jar #
cd classes; jar cvf ../image.jar image; cd ../   ( sans manifest )

cd classes; jar cvfm ../image.jar ../manifest-ex image * ; cd ../  ( avec manifest )
# Exécuter le jar #
java -classpath image.jar image.ImageMain urlImage threshold nbGrayLevels ( sans manifest )

java -jar image.jar urlImage threshold nbGrayLevels ( avec manifest )

# récupérer le projet par git pull, placez vous dans le dossier TP_Hanoi/ et exécutez les commandes #
