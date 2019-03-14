FROM openjdk

COPY sender/target/sender-jar-with-dependencies.jar home/
COPY client/target/client-jar-with-dependencies.jar home/
COPY run.sh home/

CMD ./home/run.sh

