#!/bin/bash

if ! mvn clean package -P build-docker-image; then
    echo "Build/Push failed . Exiting."
else
  echo "[Success] Build process completed for all directories."
fi


