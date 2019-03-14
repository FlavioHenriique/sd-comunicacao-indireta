#!/usr/bin/env bash
cd home/
java -jar receiver-jar-with-dependencies.jar &
sleep 2
java -jar server-jar-with-dependencies.jar


