# javaattempt

UPDATE: server runs


Report:
1. Entering Items:
Method: POST
Resource address: http://localhost:8080/api/subjects
Headers: Content type: application/json
The content of the task:
[
    {
        "id": 1,
        "ects": 2,
        "name": "Object-oriented methodologies",
        "roomNumber": "216",
        "hasExam": true
    },
    {
        "id": 2,
        "ects": 1,
        "name": "Software testing",
        "roomNumber": "216",
        "hasExam": false
    },
    {
        "id": 3,
        "ects": 3,
        "name": "Web technologies",
        "roomNumber": "208",
        "hasExam": false
    },
    {
        "id": 4,
        "ects": 2,
        "name": "IT project management",
        "roomNumber": "216",
        "hasExam": false
    },
    {
        "id": 5,
        "ects": 3,
        "name": "Advanced database technologies",
        "roomNumber": "208",
        "hasExam": false
    },
    {
        "id": 6,
        "ects": 2,
        "name": "Component and Network Technologies",
        "roomNumber": "208",
        "hasExam": true
    }
]
Answer:
Subject created successfully
2. Download All Items:
Method: GET
Resource address: http://localhost:8080/api/subjects?
Answer:
[
    {
        "id": 1,
        "ects": 0,
        "name": null,
        "roomNumber": null,
        "hasExam": false
    },
    {
        "id": 2,
        "ects": 2,
        "name": "Object-oriented methodologies",
        "roomNumber": "216",
        "hasExam": true
    }
]
3. Download Items with Exam:
Method: GET
Resource address: http://localhost:8080/api/subjects?exam=true
4. Download Classes that take place in Room 216:
Method: GET
URL: /api/subjects?room=216
5. Download subjects that do not have an exam and are held in room 208:
Method: GET
URL: http://localhost:8080/api/subjects?exam=false&room=208
6. Download the subject with ID 3:
Method: GET
URL: http://localhost:8080/api/subjects/3
7. Download the subject with ID 15:
Method: GET
URL: http://localhost:8080/api/subjects/15
8. Delete of subject with ID 2:
Method: DELETE
URL: http://localhost:8080/api/subjects/2
9. Download all subjects:
Method: GET
URL: http://localhost:8080/api/subjects
10. Delete of all subjects:
Method: DELETE
URL: http://localhost:8080/api/subjects
11. Download all items:
Method: GET
URL: http://localhost:8080/api/subjects
