## Spring Boot Fake CRUD

Contoh aplikasi backend CRUD Java dengan framework Spring. Disini untuk datanya masih disimpan di memori (fake data), jadi ketika aplikasi tidak berjalan maka data akan terhapus.

## REST API
Untuk base urlnya __http://localhost:8080/api/v1/fakecrud/person/__

### GET - All
Request:    
__http://localhost:8080/api/v1/fakecrud/person/all__  
Response:   
```Json
{
  "message": "Success",
  "code": 200,
  "personArrayList": [
    {
      "id": 1,
      "name": "Joni",
      "age": 70,
      "email": "joni@gmail.com",
      "empty": false
    },
    {
      "id": 2,
      "name": "Jupri",
      "age": 40,
      "email": "jupri@gmail.com",
      "empty": false
    },
    {
      "id": 3,
      "name": "Supri",
      "age": 20,
      "email": "supri@gmail.com",
      "empty": false
    }
  ]
}
```

### GET - By Id
Request:    
__http://localhost:8080/api/v1/fakecrud/person/{id}__  
Response:   
```Json
{
  "message": "Success",
  "code": 200,
  "personArrayList": [
    {
      "id": 1,
      "name": "Joni",
      "age": 70,
      "email": "joni@gmail.com",
      "empty": false
    }
  ]
}
```

### POST - Single
Request:    
__http://localhost:8080/api/v1/fakecrud/person/add__  
Body:   
```Json
{
  "id": 4,
  "name": "Dika",
  "age": 18,
  "email": "dika@gmail.com"
}
``` 
Response:   
```Json
{
  "message": "Success add person",
  "code": 200,
  "personArrayList": [
    {
      "id": 1,
      "name": "Joni",
      "age": 70,
      "email": "joni@gmail.com",
      "empty": false
    },
    {
      "id": 2,
      "name": "Jupri",
      "age": 40,
      "email": "jupri@gmail.com",
      "empty": false
    },
    {
      "id": 3,
      "name": "Supri",
      "age": 20,
      "email": "supri@gmail.com",
      "empty": false
    },
    {
      "id": 4,
      "name": "Dika",
      "age": 18,
      "email": "dika@gmail.com",
      "empty": false
    }
  ]
}
```

### PUT - Single
Request:    
__http://localhost:8080/api/v1/fakecrud/person/{id}__  
Body:   
```Json
{
  "id": 6,
  "name": "Ikhwah",
  "age": 9,
  "email": "wah@gmail.com"
}
``` 
Response:   
```Json
{
  "message": "Success update",
  "code": 200,
  "personArrayList": [
    {
      "id": 1,
      "name": "Joni",
      "age": 70,
      "email": "joni@gmail.com",
      "empty": false
    },
    {
      "id": 2,
      "name": "Jupri",
      "age": 40,
      "email": "jupri@gmail.com",
      "empty": false
    },
    {
      "id": 3,
      "name": "Supri",
      "age": 20,
      "email": "supri@gmail.com",
      "empty": false
    },
    {
      "id": 6,
      "name": "Ikhwah",
      "age": 9,
      "email": "wah@gmail.com",
      "empty": false
    }
  ]
}
```

### DELETE - Single
Request:    
__http://localhost:8080/api/v1/fakecrud/person/{id}__  
Response:   
```Json
{
  "message": "Success delete",
  "code": 200,
  "personArrayList": [
    {
      "id": 1,
      "name": "Joni",
      "age": 70,
      "email": "joni@gmail.com",
      "empty": false
    },
    {
      "id": 2,
      "name": "Jupri",
      "age": 40,
      "email": "jupri@gmail.com",
      "empty": false
    },
    {
      "id": 3,
      "name": "Supri",
      "age": 20,
      "email": "supri@gmail.com",
      "empty": false
    },
    {
      "id": 6,
      "name": "Ikhwah",
      "age": 9,
      "email": "wah@gmail.com",
      "empty": false
    }
  ]
}
```