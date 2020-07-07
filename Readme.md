0- Prérequis

    * jdk-13.0.2
    * apache maven 3.6.3
    * apache tomcat 9.0.30
    * mysql 8.0.19

1- Récupérer le projet sur GitHub adresse : https://github.com/Nyhn/Projet7.git

    *https://github.com/Nyhn/Projet7.git
    
2- Installer la base de donnée:(Fichier dans MySQL)

    *Ouvrir MySQL Workbench
    *Creer une Database : db_library
    *Aller dans le dossier projet7/sql
    *importer dans la base créée : Library_dump_1.0.sql 

3- Ouvrir terminal, lancer les microservice

    *Allez dans le répertoire Projet7/microservice
    *Tapez :
        mvn clean install
    *Tapez :
        mvn package
    *Allez dans le répertoire target
    *Tapez :
        java -jar microservice-0.0.1-SNAPSHOT.jar

4- Dans un autre terminal, lancer le client

    *Allez dans le répertoire Projet7/clientUi
    *Tapez :
        mvn clean install
    *Tapez :
        mvn package
    *Allez dans le répertoire target
    *Tapez :
        java -jar clientUI-0.0.1-SNAPSHOT.jar    

5- Dans votre navigateur, aller à l'adresse

    *http://localhost:8080/
    