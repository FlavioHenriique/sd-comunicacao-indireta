#!/usr/bin/env bash
cd home/

java -jar sender-jar-with-dependencies.jar &
sleep 2
java -jar client-jar-with-dependencies.jar


