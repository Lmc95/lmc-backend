#FROM amazoncorretto:8-alpine-jdk
#COPY target/lucas-0.0.1-SNAPSHOT.jar lmc95-app.jar
#ENTRYPOINT ["java","-jar","/lmc95-app.jar"]

FROM amazoncorretto:11-alpine-jdk
COPY target/SpringBoot-0.0.1-SNAPSHOT.jar SpringBoot-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/SpringBoot-0.0.1-SNAPSHOT.jar"]