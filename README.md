# 🚀 Spring Boot Microservices Project

A complete **Spring Boot Microservices** project developed using Java, Spring Boot, Spring Data JPA, H2 Database, OpenFeign, and REST APIs.

This project demonstrates communication between multiple microservices using **Feign Client**.

---

## 📌 Microservices

### 1️⃣ Employee Service
**Port:** `8081`

#### Responsibilities
- Manage employee information
- Retrieve employee details
- Fetch Address details from Address Service
- Fetch Course details from Course Service
- Combine responses into a single API response

---

### 2️⃣ Address Service
**Port:** `8080`

#### Responsibilities
- Store Address information
- Return Address details based on Employee ID
- REST API for Address retrieval

---

### 3️⃣ Course Service
**Port:** `8083`

#### Responsibilities
- Store Course information
- Return Course details
- REST API for Course retrieval

---

# 🛠 Tech Stack

- Java 21
- Spring Boot
- Spring Data JPA
- Spring MVC
- Spring Cloud OpenFeign
- H2 Database
- Maven
- REST API
- ModelMapper
- Git
- GitHub

---

# 📂 Project Structure

```
First-Microservice-Project
│
├── employee
│
├── addressservice
│
├── courseservice
│
└── README.md
```

---

# 📡 Microservice Communication

```
                +----------------------+
                |   Employee Service   |
                |      Port 8081       |
                +----------+-----------+
                           |
            -----------------------------
            |                           |
            |                           |
      Feign Client                Feign Client
            |                           |
            |                           |
+---------------------+      +----------------------+
|  Address Service    |      |   Course Service     |
|     Port 8080       |      |      Port 8083       |
+---------------------+      +----------------------+
```

---

# ⚙ Features

## Employee Service

- Add Employee
- Update Employee
- Delete Employee
- Get Employee
- Get All Employees
- Fetch Address using Feign Client
- Fetch Course using Feign Client

---

## Address Service

- Add Address
- Get Address by ID
- Get All Addresses

---

## Course Service

- Add Course
- Get Course by ID
- Get All Courses

---

# 📦 Technologies Used

| Technology | Purpose |
|------------|----------|
| Spring Boot | Backend Framework |
| Spring MVC | REST APIs |
| Spring Data JPA | Database Operations |
| H2 Database | In-memory Database |
| OpenFeign | Inter-Service Communication |
| ModelMapper | DTO Mapping |
| Maven | Dependency Management |

---

# 🔗 REST APIs

## Employee Service

| Method | Endpoint |
|---------|----------|
| GET | /employee |
| GET | /employee/{id} |
| POST | /employee |
| PUT | /employee/{id} |
| DELETE | /employee/{id} |

---

## Address Service

| Method | Endpoint |
|---------|----------|
| GET | /address |
| GET | /address/{id} |
| POST | /address |

---

## Course Service

| Method | Endpoint |
|---------|----------|
| GET | /course |
| GET | /course/{id} |
| POST | /course |

---

# 🗄 Database

Each microservice uses its own **H2 In-Memory Database**.

```
Employee Service
↓

jdbc:h2:mem:employee
```

```
Address Service
↓

jdbc:h2:mem:address
```

```
Course Service
↓

jdbc:h2:mem:course
```

---

# ▶ Running the Project

### Clone Repository

```bash
git clone https://github.com/GTK18062005/First-Microservice-Project.git
```

---

### Start Services

Run the services in the following order:

1. Address Service
2. Course Service
3. Employee Service

---

# 🧪 Testing

You can test the APIs using:

- Postman
- Swagger (if added later)
- Browser (GET requests)

---

# 📈 Future Enhancements

- Spring Cloud Gateway
- Eureka Service Registry
- Config Server
- Circuit Breaker (Resilience4j)
- Docker
- Docker Compose
- Kubernetes
- JWT Authentication
- MySQL/PostgreSQL
- Spring Security
- Logging & Monitoring
- CI/CD with GitHub Actions

---

# 👨‍💻 Author

**Tharun Kumar Gangavarapu**

- GitHub: https://github.com/GTK18062005

---

## ⭐ If you found this project useful, don't forget to star the repository!
