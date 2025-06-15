#!/bin/bash

# Build and start the Docker containers
echo "Building and starting Docker containers..."
docker-compose up -d --build

# Check if containers are running
echo "Checking container status..."
docker-compose ps

echo ""
echo "REST API is now running!"
echo "Access the API at: http://localhost:8080/api"
echo ""
echo "To stop the containers, run: docker-compose down"