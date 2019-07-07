#!/usr/bin/env bash

cd eureka
echo "running eureka service... please wait"
mvn spring-boot:run &
sleep 10  # Waits 5 seconds.


cd ..
echo "running zuul service... please wait"
cd zuul-server
mvn spring-boot:run &
sleep 10  # Waits 5 seconds.

cd ..
echo "running books service... please wait"
cd books-service
mvn spring-boot:run &
sleep 10  # Waits 5 seconds.

cd ..
echo "running series service... please wait"
cd series-service
mvn spring-boot:run &
sleep 15  # Waits 5 seconds.

echo "Services up"