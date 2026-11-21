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

# фільтр за жанром

```bash
curl "http://localhost:8080/api/books?genre=Поезія"
```

# Створити книгу -> 201

```bash
curl -i -X POST http://localhost:8080/api/books \
  -H "Content-Type: application/json" \
  --data-binary @requests/new-book.json
```

# Оновити книгу -> 200 (404 - no id)

```bash
curl -i -X PUT http://localhost:8080/api/books/1 \
  -H "Content-Type: application/json" \
  --data-binary @requests/update-book.json
```

# Видалити книгу -> 204 (404 - no id)

```bash
curl -i -X DELETE http://localhost:8080/api/books/2
```