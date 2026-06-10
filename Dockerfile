FROM eclipse-temurin:8-jdk

EXPOSE 8080

ADD target/backend_form-demo26-0.0.1-SNAPSHOT.jar backend_form-demo26-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/backend_form-demo26-0.0.1-SNAPSHOT.jar"]
