FROM openjdk

COPY receiver/target/receiver-jar-with-dependencies.jar home/
COPY server/target/server-jar-with-dependencies.jar home/
COPY server.sh home/

CMD ./home/server.sh


