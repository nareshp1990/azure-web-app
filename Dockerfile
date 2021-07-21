FROM adoptopenjdk/openjdk11:alpine-jre

COPY target/azure-web-app-*.jar /app.jar

CMD ["java", "-jar", "app.jar"]