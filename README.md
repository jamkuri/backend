# User Registration

Simple Spring Boot + MySQL application to register, save, and view users. It includes a REST API and a browser-based form.

## Run

Requires Java 17+, Maven, and MySQL 8.

### Option 1: Start MySQL with Docker

```bash
docker compose up -d
```

### Option 2: Use your installed MySQL

Run `database.sql`, then set your database credentials if they differ from the defaults:

```bash
export MYSQL_USER=root
export MYSQL_PASSWORD=your_password
```

The default JDBC connection is:

```text
jdbc:mysql://localhost:3306/user_registration
```

### Start the application

```bash
mvn spring-boot:run
```

Open `http://localhost:8080`.

## REST endpoints

- `POST /api/users` — save a user
- `GET /api/users` — view all users

Example request:

```json
{
  "firstName": "Ali",
  "lastName": "Khan",
  "fatherName": "Ahmed Khan",
  "address": "Berlin, Germany"
}
```

The HTML page uses the same REST API and automatically refreshes the user table after saving.
