#eventmanagement
#📌 Description
This is a Spring Boot-based Event Management application that allows users to create, update, delete, and view events. It follows a layered architecture and exposes REST APIs.

#🚀 Tech Stack
Java
Spring Boot
Spring Data JPA
Hibernate
MySQL
Postman

#⚙️ Features
Create Event
Get All Events
Get Event by ID
Update Event
Delete Event

#🏗️ Project Structure
Controller → Handles HTTP requests
Service → Business logic
Repository → Database interaction
Entity → Database models

#🔗 API Endpoints
Method	Endpoint	Description
GET	/events	Get all events
GET	/events/{id}	Get event by ID
POST	/events	Create new event
PUT	/events/{id}	Update event
DELETE	/events/{id}	Delete event

#💾 Database Configuration
Configure in application. properties:
spring.datasource.url=jdbc:mysql://localhost:3306/eventdb
spring.datasource.username=your_username
spring.datasource.password=password

#▶️ How to Run
Clone the repository
Open in IDE (IntelliJ/Eclipse)
Configure MySQL
Run SpringBootApplication
Test APIs using Postman

#🧪 Testing
APIs tested using Postman

#📈 Future Enhancements
Add Spring Security (JWT Authentication)
Convert to Microservices Architecture
Deploy on cloud (AWS)

#👨‍💻 Author
Mahalakshmi k s


Manju
