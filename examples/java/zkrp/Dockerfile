FROM ubuntu:latest

RUN apt-get -y update
RUN apt-get -y install software-properties-common python-software-properties openjdk-9-jdk-headless

RUN apt-get -y install gradle

RUN java -version
RUN javac -version

RUN mkdir -p /app

WORKDIR /app

COPY gradlew* ./

RUN gradle build

COPY . ./

RUN javac src/main/java/com/ing/blockchain/zk/RangeProof.java


# COPY ./target/http_client-0.0.1-SNAPSHOT.jar /usr/src/myapp/http_client-0.0.1-SNAPSHOT.jar
# CMD ["java", "-jar", "--add-modules=jdk.incubator.httpclient", "/usr/src/myapp/http_client-0.0.1-SNAPSHOT.jar"]
