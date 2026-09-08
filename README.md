# Spring Boot E-Commerce Backend Engine (with JWT Security)

A secure, high-performance RESTful Backend Engine built using **Spring Boot 3.x**, **Spring Security 6**, and **JWT (JSON Web Token)**. This project implements a stateless authentication mechanism and role-based access control (RBAC) to secure e-commerce resources like carts, orders, and product management.

---

## 🚀 Key Features
* **Stateless JWT Authentication:** Users authenticate via credentials and receive a secure token for subsequent requests.
* **Role-Based Access Control (RBAC):** 
  * `ROLE_USER` can browse products and manage their shopping cart.
  * `ROLE_ADMIN` has exclusive access to create, update, or delete products.
* **Password Hashing:** Secure password storage using BCrypt encryption.
* **Data Persistence:** Integrated with Spring Data JPA and H2 In-Memory Database for fast, zero-configuration development.
* **Global Exception Handling:** Clean, unified error responses for `InvalidCredentialsException`, `ResourceNotFoundException`, etc.

---

## 🛠️ Tech Stack
* **Framework:** Spring Boot (v3.x)
* **Security:** Spring Security 6 & JSON Web Tokens (JWT)
* **Language:** Java (v17+)
* **Database:** H2 In-Memory Database
* **ORM:** Spring Data JPA (Hibernate)
* **Build Tool:** Maven

---

## 🔐 Security Workflow
1. **Login:** User sends credentials to `/api/auth/login`.
2. **Token Generation:** Server validates credentials and generates a signed JWT token containing user roles.
3. **Authorization:** For protected endpoints (e.g., `/api/cart`), the client sends the token in the `Authorization: Bearer <TOKEN>` header.
4. **Validation:** Custom JWT Filter intercepts the request, validates the token signature, and sets the security context.

---

## 🛣️ API Endpoints

### 🔑 Authentication (Public)
| HTTP Method | Endpoint | Description |
| :--- | :--- | :--- |
| `POST` | `/api/auth/register` | Register a new user/customer |
| `POST` | `/api/auth/login` | Authenticate user and return JWT Token |

### 🛍️ E-Commerce Resources (Protected)
| HTTP Method | Endpoint | Allowed Roles | Description |
| :--- | :--- | :--- | :--- |
| `GET` | `/api/products` | `ANYONE` | View available product catalog |
| `POST` | `/api/products` | `ROLE_ADMIN` | Add a new product to inventory |
| `POST` | `/api/cart` | `ROLE_USER` | Add items to the shopping cart |
| `GET` | `/api/orders` | `ROLE_USER`, `ROLE_ADMIN` | View order history |

---

## ⚙️ Local Setup & Testing

1. **Clone and Navigate:**
   ```bash
   git clone [https://github.com/Abhishek16758/spring-boot-ecommerce.git](https://github.com/Abhishek16758/spring-boot-ecommerce.git)
   cd spring-boot-ecommerce
