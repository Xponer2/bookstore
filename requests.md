# Запуск:
./mvnw spring-boot:run

# Список книг
```bash
curl http://localhost:8080/api/books
```

```json
[
  { "id": 1, "title": "Кобзар", "author": "Тарас Шевченко", "price": 250.00, "coverUrl": "/covers/kobzar.jpg" },
  { "id": 2, "title": "Лісова пісня", "author": "Леся Українка", "price": 180.00, "coverUrl": "/covers/lisova-pisnia.jpg" }
]
```

# Одна книга

```bash
curl http://localhost:8080/api/books/1
```

```json
{
  "id": 1,
  "title": "Кобзар",
  "author": "Тарас Шевченко",
  "price": 250.00,
  "year": 1840,
  "coverUrl": "/covers/kobzar.jpg",
  "description": "Перша збірка поетичних творів Шевченка.",
  "genre": "Поезія"
}
```

# 404

```bash
curl -i http://localhost:8080/api/books/999
```

```
HTTP/1.1 404 
Content-Type: application/json
Transfer-Encoding: chunked
Date: Sat, 21 Nov 2026 07:02:43 GMT

{"timestamp":"2026-11-21T07:02:43.602+00:00","status":404,"error":"Not Found","path":"/api/books/999"}
```