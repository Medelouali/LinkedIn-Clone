#!/bin/bash

#Hello ("api-gateway" "eureka-server" "jobs" "linkediners", "")

directories=("api-gateway" "posts" "search")

for dir in "${directories[@]}"; do
  cd "$dir" || exit
  echo "Building $dir..."
  if ! mvn clean package -P build-docker-images; then
    echo "Build/Push failed for $dir. Exiting."
    exit 1
  fi
  cd ..
done

echo "Build process completed for all directories."
