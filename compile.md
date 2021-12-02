*to compile*

cd src ; javac -classpath ..\lib\* -d ..\WEB-INF\classes\ .\WelcomeServlet.java .\DynamicJSPServlet.java .\RequestExampleServlet.java .\RedirectServlet.java .\LogToCmd.java ; cd .. ; jar -cf simpleExample.war * ; rm E:\Tomcat\webapps\simpleExample.war ; rm -r E:\Tomcat\webapps\simpleExample ; mv .\simpleExample.war E:\Tomcat\webapps\

*to run*

cd E:\Tomcat\bin\
.\startup.bat

*to reload*

.\shutdown.bat ; .\startup.bat
