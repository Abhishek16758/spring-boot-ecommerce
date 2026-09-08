# Spring Boot E-Commerce Backend Engine (with JWT Security)

A secure, high-performance RESTful Backend Engine built using **Spring Boot 3**, **Spring Security 6**, and **JWT (JSON Web Token)**. This project implements stateless authentication and role-based access control (RBAC) to secure e-commerce resources like carts, orders, and product management.

---

## 🚀 Key Features
* **Stateless JWT Authentication:** Secure login via `/api/auth/login` returning signed bearer tokens.
* **Role-Based Access Control (RBAC):**
  * `ROLE_USER`: Browse products, manage personal cart, and view personal order history.
  * `ROLE_ADMIN`: Add new products and view all customer orders.
* **Password Hashing:** Passwords encrypted using standard BCrypt encoding.
* **Data Persistence:** Integrated with Spring Data JPA and H2 In-Memory Database for zero-setup execution.
* **Global Exception Handling:** Unified error JSON responses via `@RestControllerAdvice`.

---

## 🛠️ Tech Stack
* **Framework:** Spring Boot 
* **Security:** Spring Security 6, JWT (io.jsonwebtoken 0.12.x)
* **Language:** Java 17
* **Database:** H2 In-Memory Database
* **ORM:** Spring Data JPA (Hibernate)
* **Build Tool:** Maven

---

## 🔐 Security Workflow
1. **Registration:** `POST /api/auth/register` creates a user with encrypted password.
2. **Login:** `POST /api/auth/login` verifies credentials and returns a Bearer JWT.
3. **Authorized Requests:** Send token in the header:
Authorization: Bearer

4. **Validation:** `JwtAuthenticationFilter` intercepts requests, verifies signature, extracts claims, and populates the `SecurityContextHolder`.

---

## 🛣️ API Endpoints

### 🔑 Authentication (Public)
| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `POST` | `/api/auth/register` | Register a new customer or admin |
| `POST` | `/api/auth/login` | Authenticate user and return JWT |

### 🛍️ E-Commerce Resources (Protected)
| Method | Endpoint | Allowed Roles | Description |
| :--- | :--- | :--- | :--- |
| `GET` | `/api/products` | Public | View available product catalog |
| `POST` | `/api/products` | `ROLE_ADMIN` | Add new product to catalog |
| `GET` | `/api/cart` | `ROLE_USER` | View items in personal cart |
| `POST` | `/api/cart` | `ROLE_USER` | Add product to shopping cart |
| `GET` | `/api/orders` | `ROLE_USER`, `ROLE_ADMIN` | View order history |

---

## ⚙️ Local Setup & Execution

1. **Clone the repository:**
```bash
git clone [https://github.com/Abhishek16758/spring-boot-ecommerce.git](https://github.com/Abhishek16758/spring-boot-ecommerce.git)
cd spring-boot-ecommerce

    Run the application:
    Bash

mvn clean spring-boot:run

Database Console:

    URL: http://localhost:8080/h2-console

    JDBC URL: jdbc:h2:mem:ecommercedb

    Username: sa

    Password: (leave blank)
