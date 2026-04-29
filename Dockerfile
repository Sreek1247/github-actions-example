FROM openjdk:17.0.1
EXPOSE 8080
ADD target/springboot-image-gitactions.jar springboot-image-gitactions.jar
ENTRYPOINT [ "java","-jar","/springboot-image-gitactions.jar" ]