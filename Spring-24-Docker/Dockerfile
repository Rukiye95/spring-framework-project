##Baseimage /it has to be in any dockerfile
#FROM openjdk:11
##for writing maintainer of dockerfile
#LABEL maintainer="cydeo.com"
##to  direct any folder
#WORKDIR /usr/app
##will get jar file and copy to image
#COPY ./target/Spring-24-docker-0.0.1-SNAPSHOT.jar  ./app.jar
#
##willprovideexacutableapplicationwhencontainerstartstherun
#ENTRYPOINT ["java","-jar", "app.jar"]

#FROM  openjdk:11
#COPY ./target/Spring-24-Docker-0.0.1-SNAPSHOT.jar   /usr/app/
#WORKDIR /usr/app
#EXPOSE 8080
#ENTRYPOINT ["java","-jar","Spring-21-Docker-0.0.1-SNAPSHOT.jar"]

#Baseimage /it has to be in any dockerfile
FROM openjdk:17-jdk
#will get jar file and copy to image
COPY ./target/Spring-24-Docker-0.0.1-SNAPSHOT.jar  /usr/app/
#to  direct any folder
WORKDIR /usr/app
#will provide exacutable application when container starts the run
ENTRYPOINT ["java","-jar","Spring-24-docker-0.0.1-SNAPSHOT.jar"]