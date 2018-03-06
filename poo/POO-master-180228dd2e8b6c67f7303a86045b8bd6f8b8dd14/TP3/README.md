Lecluse Alexis

TP Word terminé

# Générer la doc #
javadoc Word.java
javadoc Stock.java

# Compiler les classes #
javac Stock.java
javac Word.java
javac WordMain.java (facultatif)

# Compiler les tests #
javac -classpath .:test-1.7.jar WordTest.java
javac -classpath .:test-1.7.jar WordTest1.java

# Exécuter les tests #
java -jar test-1.7.jar WordTest
java -jar test-1.7.jar WordTest1

# Exécuter le main #
java WordMain arg


# récupérer le projet par git pull, placez vous dans le dossier TP3/ et exécutez les commandes #
