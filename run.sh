#!/bin/bash

mvn clean compile install
cp /c/SpringRepo/University/target/University.war /c/Apps/tomcat6/webapps/

