#! /usr/local/bin/zsh

javac -cp .:junit.jar test/*.java
cp test/*.class .

java -cp .:junit.jar:hamcrest-core.jar org.junit.runner.JUnitCore PawnTest

rm *.class test/*.class
