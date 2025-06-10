# Noemi Delgadillo's Portfolio – Backend (Spring Boot)

This is the backend API for my personal portfolio website. It handles the contact form submissions and dynamically provides the list of featured projects. Messages are saved to a PostgreSQL database, and email notifications may be added in the future.

## 🛠️ Technologies Used

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- Maven

## 📂 Project Structure

src/
├── main/
│ ├── java/com/noemi.portfolio.backend/
│ │ ├── controller/
| | ├── dto/
| | ├── exception/
│ │ ├── model/
│ │ ├── repository/
│ │ ├── service/
│ │ └── PortfolioBackendApplication.java
│ └── resources/
│ ├── application.properties


## 🌐 API Endpoints

| Method | Endpoint         | Description                     |
|--------|------------------|---------------------------------|
| POST   | `/api/messages`  | Save contact message            |
| GET    | `/api/projects`  | Return list of featured projects|

### Example Contact Payload

```json
{
  "name": "Jane Doe",
  "email": "jane@example.com",
  "message": "Loved your projects!"
}
🧪 Running Locally
Make sure you have PostgreSQL running and update application.properties accordingly.


git clone https://github.com/NoemiDR24/Noemi-Portfolio-Backend.git
cd Noemi-Portfolio-Backend
./mvnw spring-boot:run

## 📦 Deployment
 Render

## 📨 Future Improvements
Send contact form messages via email (e.g., using Mailgun or SendGrid).

Admin dashboard for managing messages and projects.

Authentication for editing project list (optional).

## 🤝 Contact
You can reach me via the contact form on my portfolio site or on [![LinkedIn](https://img.shields.io/badge/LinkedIn-Connect-blue?logo=linkedin)](https://www.linkedin.com/in/noemidelgadilloroldan/).
