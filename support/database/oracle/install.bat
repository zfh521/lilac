@echo off
SET JAVA_HOME=D:\Tools\Java\jdk1.7.0_25
SET MAVEN_HOME=D:\Tools\maven
%MAVEN_HOME%\bin\mvn install:install-file -Dfile=classes12.jar -DgroupId=com.oracle -DartifactId=classes12 -Dversion=10.2.0.2.0 -Dpackaging=jar -DgeneratePom=true