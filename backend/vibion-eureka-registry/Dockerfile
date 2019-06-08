FROM gradle:jdk12 as builder

RUN mkdir /home/vibion-app
WORKDIR /home/vibion-app

COPY gradle gradle
COPY src src
COPY build.gradle ./

RUN gradle build

FROM gradle:jdk12 as runtime
EXPOSE 8761
WORKDIR /opt/app
COPY --from=builder /home/vibion-app/build/libs/*.jar vibion-app.jar
CMD java -jar vibion-app.jar