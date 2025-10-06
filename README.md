Learning Management System (LMS) - LmsApplication
This repository contains the source code for a foundational Learning Management System (LMS) built using Spring Boot. This project is structured to follow modern, layered architectural patterns (Controller, Service, Repository) and uses Git for version control.

🚀 Project Overview
The current phase establishes the core foundation:

Framework: Spring Boot 3.x

Build Tool: Maven

Database: H2 In-Memory Database (for development)

Data Persistence: Spring Data JPA

Initial Entity: User entity for foundation authentication and management.

🛠️ Setup and Running Locally
Prerequisites
Java Development Kit (JDK) 17+ (The logs show you are using JDK 24, which is fine.)

Apache Maven 3.6+

A preferred IDE (IntelliJ IDEA, VS Code, Eclipse)

Steps
Clone the Repository:

git clone <YOUR_REMOTE_URL>
cd lms

Build the Project:
Compile the project and run tests (if any):

mvn clean install

Run the Application:
You can run the application directly from your IDE or via the command line:

mvn spring-boot:run

Access Points
API Endpoint: Access the initial "Hello, World!" endpoint:
http://localhost:8081/hello

H2 Console: Access the in-memory database console (if enabled in application.properties):
http://localhost:8081/h2-console (Credentials will be configured in a later step)

📦 Project Structure
The source code follows a standard package structure:

Package

Description

com.example.lms.controller

Handles incoming HTTP requests and responses.

com.example.lms.service

Contains the core business logic.

com.example.lms.repository

Abstracts data access and database operations.

com.example.lms.model

Defines the JPA entities (data structures).

# aigerimLMSProject
