FROM java:8-jdk-alpine

COPY ./target/travel-stories-0.0.1-SNAPSHOT.jar /usr/app/

ENTRYPOINT ["java","-jar","usr/app/travel-stories-0.0.1-SNAPSHOT.jar"]
