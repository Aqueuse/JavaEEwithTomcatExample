**Description**

Ceci est le *simple example* de Java EE que j'aurai voulu trouver sur le web.

Pour le faire fonctionner, vous aurez besoin de télécharger et de dézipper tomcat 10
si vous utilisez Intelij, pensez à lui dire où il se trouve (vérifiez aussi les variables d'environnement, cf le site de tomcat).

Dans le dossier de tomcat 10, vous trouverez deux dossiers d'importance :

* le dossier /bin, qui vous permettra de lancer le serveur (./startup.bat sous windows, sh sous linux)
* le dossier /webapps, qui vous servira pour déployer vos applications ou pour les tester tout simplement

Mettez-y le dossier de cette application Java EE. Vous pouvez en faire une archive .war au préalable (see compile.md) afin
de faciliter le futur déploiement sur un serveur distant, et tomcat la dézippera lui-même au démarrage du serveur.

L'application contient trois Servlets fonctionnelles bien que rudimentaires : 

+ *WelcomeServlet (mappé sur **/**)*   => very simple example
+ *RequestExampleServlet (mappé sur **/hello**)* => simple GET example
+ *AdminServlet (mappé sur **/admin**)* => simple JSP example

Chaque servlet décrit un aspect différent mais indispensable pour faire une application dynamique.

**Project Structure**

```
images
JSP
|__ *.jsp (sauf index.jsp)
lib
|__ *.jar (tomcat classes)
src
|_ AdminServlet.java
|_ WelcomeServlet.java
|_ RequestExampleServlet.java
WEB-INF
|_ classes
|__ WelcomeServlet.class
|_ lib
|__ jakarta.servlet.jsp.jstl-2.0.0.jar
|__ jakarta.servlet.jsp.jstl-api-2.0.0.jar
index.jsp
compile.md
readme.md
```
