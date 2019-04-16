#!/bin/sh
set -xe
docker build --tag vibion_backend_image .
docker run -it --rm --publish 8080:8080 --name vibion_backend vibion_backend_image
