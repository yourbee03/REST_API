#!/bin/bash

# Stop and remove Docker containers
echo "Stopping Docker containers..."
docker-compose down

echo ""
echo "Docker containers have been stopped."
echo "To start the containers again, run: ./docker-start.sh"