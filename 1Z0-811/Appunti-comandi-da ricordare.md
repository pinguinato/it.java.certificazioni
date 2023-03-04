# Appunti dei comandi da memorizzare

## Compilazione per package (foundations)

        javac -d . Student.java

        javac -d . MainWithArgumentsCounter.java

## Esecuzione di file .class compilati con package

        java -classpath . foundations.Student

        java -classpath . foundations.MainWithArgumentsCounter

## Compilare tanti sorgenti .java insieme

        javac -d . A.java B.java

        javac -d . *.java

## Impacchettare classi con JAR

        jar -cvf foundations.jar foundations // senza manifest

        jar -cvfm foudantions.jar manifest.txt foundations // con manifest

**Importante**: un jar file si può aprire anche con **winzip** o **7zip**.