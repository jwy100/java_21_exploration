#!/bin/bash

export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-21.jdk/

javac --release 21 --enable-preview HelloWorld.java 

java --enable-preview HelloWorld
