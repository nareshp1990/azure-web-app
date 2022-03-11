FROM adoptopenjdk/openjdk11:alpine-jre
MAINTAINER patchipulusu.naresh@gmail.com
WORKDIR /opt/app
ARG JAR_FILE=build/lib/azure-web-app.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:8000","-jar","app.jar"]