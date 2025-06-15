# REST API

[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.3.2-brightgreen)](https://spring.io/projects/spring-boot)
[![Java](https://img.shields.io/badge/Java-17-orange)](https://www.java.com/)
[![MySQL](https://img.shields.io/badge/MySQL-8.0-blue)](https://www.mysql.com/)
[![Maven](https://img.shields.io/badge/Maven-3.8.6-red)](https://maven.apache.org/)
[![Docker](https://img.shields.io/badge/Docker-Ready-blue)](https://www.docker.com/)
[![License](https://img.shields.io/badge/License-MIT-yellow)](LICENSE)

## Description

This REST API is a robust application designed to provide a RESTful interface following industry best practices. Built with Spring Boot, it offers a comprehensive solution for performing CRUD (Create, Read, Update, Delete) operations on data resources. The API is designed with scalability, security, and ease of use in mind.

## Features

- **Complete CRUD Operations**: Create, read, update, and delete data with well-defined endpoints
- **RESTful Architecture**: Follows REST principles for predictable and standardized API behavior
- **JSON Response Format**: All API responses are formatted in JSON for easy integration
- **Error Handling**: Comprehensive error handling with appropriate HTTP status codes
- **Data Validation**: Input validation to ensure data integrity
- **User Authentication**: Secure endpoints with authentication mechanisms
- **API Documentation**: Detailed documentation for all endpoints
- **Docker Support**: Easy deployment with Docker containers

## Technologies Used

- **Programming Language**: [Java 17](https://www.java.com/)
- **Framework**: [Spring Boot 3.3.2](https://spring.io/projects/spring-boot)
- **Database**: [MySQL 8.0](https://www.mysql.com/)
- **ORM**: [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- **Build Tool**: [Maven](https://maven.apache.org/)
- **Containerization**: [Docker](https://www.docker.com/)

## Prerequisites

Before running the application, ensure you have:

- Java JDK 17 or newer
- MySQL Server 8.0 or newer
- Maven 3.6+ (or use the included Maven wrapper)
- Docker and Docker Compose (for containerized deployment)

## Installation

### Option 1: Standard Installation

1. **Clone the Repository**
   ```bash
   git clone https://github.com/yourbee03/REST_API.git
   cd REST_API
   ```

2. **Configure Database**
   
   Update the database configuration in `src/main/resources/application.properties` with your MySQL credentials.

3. **Build the Application**
   ```bash
   ./mvnw clean install
   ```

4. **Run the Application**
   ```bash
   ./mvnw spring-boot:run
   ```

### Option 2: Docker Installation

1. **Clone the Repository**
   ```bash
   git clone https://github.com/yourbee03/REST_API.git
   cd REST_API
   ```

2. **Build and Run with Docker Compose**
   ```bash
   docker compose up -d
   ```

   This will start both the Spring Boot application and a MySQL database in containers.

## API Endpoints

The API provides the following endpoints:

- `GET /api/resource` - Retrieve all resources
- `GET /api/resource/{id}` - Retrieve a specific resource
- `POST /api/resource` - Create a new resource
- `PUT /api/resource/{id}` - Update an existing resource
- `DELETE /api/resource/{id}` - Delete a resource

## Environment Variables

When using Docker, you can configure the application using the following environment variables:

- `MYSQL_HOST` - MySQL database host
- `MYSQL_PORT` - MySQL database port
- `MYSQL_DATABASE` - MySQL database name
- `MYSQL_USER` - MySQL username
- `MYSQL_PASSWORD` - MySQL password
- `SERVER_PORT` - Application server port

## Testing

Run the automated tests with:

```bash
./mvnw test
```

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details.
