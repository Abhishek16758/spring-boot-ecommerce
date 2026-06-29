# Spring Boot E-Commerce Backend Engine

A production-ready, enterprise-grade e-commerce backend built using **Spring Boot**, **Spring Data JPA**, and an **H2 In-Memory Database**. This project demonstrates standard 3-tier industry architecture patterns, making it highly scalable and easily maintainable.

---

## 🚀 Key Features
* **Product Management Core:** Full CRUD operations to add, view, update, and remove products.
* **Enterprise Directory Structure:** Clean separation of concerns with distinct layers for Web/REST, Business Logic, and Database communication.
* **Auto-configured Database:** Built-in H2 database integration for seamless local testing without complex setups.
* **Boilerplate Reduction:** Integrated with Project Lombok to maintain clean, human-readable data models.

---

## 📂 Architecture & Package Structure

The project strictly follows the standard enterprise layout that modern software engineering teams look for:

* `com.abhishek.ecommerce.controller` ➡️ Exposes secure REST API Endpoints (HTTP mappings).
* `com.abhishek.ecommerce.service` ➡️ Houses core business logic, validation rules, and processing calculations.
* `com.abhishek.ecommerce.repository` ➡️ Manages direct data persistence queries (extends JpaRepository).
* `com.abhishek.ecommerce.model` ➡️ Data entities that map Java classes directly to relational database tables.

---

## 🛠️ Tech Stack & Dependencies
* **Java 17** (or above)
* **Spring Boot 3.x** (Web & Data JPA)
* **H2 Database Engine** (In-Memory Data Store)
* **Lombok**
* **Maven** (Dependency Management)

---

## 💻 How to Run This Project Locally

### 1. Prerequisites
Make sure you have **Java 17** and **Eclipse IDE** (with STS plugin) installed on your system.

### 2. Clone and Setup
Import this repository directly into your workspace as an existing Maven project.

### 3. Running the Application
Right-click on `EcommerceApplication.java` inside Eclipse and select **Run As** ➡️ **Spring Boot App**.

The application will start running on port `8080` by default:
* **API Endpoint:** `http://localhost:8080/api/products`
* **H2 Database Console:** `http://localhost:8080/h2-console`
