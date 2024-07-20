**Bus Ticket Reservation System**
**Overview**
This project is a backend API implementation for a bus ticket reservation system. It handles ticket reservations for various bus routes, user authentication, bus searching, seat availability, and reservation management. The project focuses on backend functionality using Spring Boot.

**Technology Stack**
Java 17
Spring Boot 2.7.x
Spring Security
Spring Data JPA
MY SQL Database 
Maven (for build and dependency management)

**User Authentication**
Register User: POST /api/users/register

Request body
{
  "username": "your_username",
  "password": "your_password"
}


**Searching for Buses**
Search Buses: GET /api/buses/search
Query Parameters:
departureLocation
arrivalLocation
departureDate

**Viewing Seat Availability**
Get Available Seats: GET /api/seats/available
Query Parameter:
busId


**Seat Reservation**
Reserve Seat: POST /api/reservations/reserve
Query Parameters:
userId
seatId

