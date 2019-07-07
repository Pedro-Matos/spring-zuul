#!/usr/bin/env bash

eureka_pid=`cat eureka_pid.txt`
echo "Killing eureka service"
kill -9 $eureka_pid
rm -f eureka_pid.txt

zuul_pid=`cat zuul_pid.txt`
echo "Killing zuul service"
kill -9 $zuul_pid
rm -f zuul_pid.txt

series_pid=`cat series_pid.txt`
echo "Killing series service"
kill -9 $series_pid
rm -f series_pid.txt

books_pid=`cat books_pid.txt`
echo "Killing books service"
kill -9 $books_pid
rm -f books_pid.txt