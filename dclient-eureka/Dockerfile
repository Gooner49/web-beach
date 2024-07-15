FROM eclipse-temurin:17-jdk-focal
EXPOSE 8087

COPY target/spring-boot-web.jar spring-boot-web.jar
ENTRYPOINT ["java","-jar","spring-boot-web.jar"]