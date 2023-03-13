FROM amazoncorretto:11-alpine-jdk
MAINTAINER lmc95
COPY target/lucas-0.0.1-SNAPSHOT.jar lmc95-app.jar
ENTRYPOINT ["java","-jar","/lmc95-app.jar"]
