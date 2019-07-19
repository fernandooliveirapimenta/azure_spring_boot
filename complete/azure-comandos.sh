#!/bin/bash
mvn clean install -U
mvn azure-webapp:deploy
