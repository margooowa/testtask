Prerequisites
Before you begin, ensure you have the following installed on your system:

Java Development Kit (JDK) 17
Maven
Build
To build the application, run the following command in the project root directory:

bash
Copy code
mvn clean package
This will compile the source code, run tests, and package the application into a JAR file.

Run
To run the application, use the following command:

bash
Copy code
java -jar target/word-relation-<version>.jar
Replace <version> with the actual version of your application.

API Documentation
The API documentation can be found at http://localhost:8080/swagger-ui.html after running the application.

Usage
Create a word relation:

bash
Copy code
curl -X POST http://localhost:8080/v1/api/words -H 'Content-Type: application/json' -d '{
    "firstWord": "Hello",
    "secondWord": "World",
    "relation": "SYNONYM"
}'

check in documentation validation rules
Get all word relations:

bash
Copy code
curl http://localhost:8080/v1/api/words/filter?relation=SYNONYM
Find word by first and second word:

Get all word relations inversion:

bash
Copy code
curl http://localhost:8080/v1/api/words/filter?relation=SYNONYM&inverse=true
Find inversed and not inversed

bash
Copy code
curl http://localhost:8080/v1/words?firstWord=Hello&secondWord=World
Swagger UI provides an interactive API documentation. Visit http://localhost:8080/swagger-ui.html for details.