# Docker MongoDB Command

To run MongoDB in a Docker container:

```bash
docker run -p 27017:27017 --name mongo \
    -e MONGO_INITDB_ROOT_USERNAME=admin \
    -e MONGO_INITDB_ROOT_PASSWORD=password \
    -e MONGO_INITDB_DATABASE=test \
    -v /tmp/mongo-data:/data/db mongo
```

- This command runs MongoDB with environment variables for a root user and mounts a volume for persistent data storage.

# How to Start MongoDB Client

To connect to the MongoDB instance using the credentials created during the Docker run:

```bash
mongo -u admin -p password --authenticationDatabase admin
```

# What is MongoDB?

- **Document-Oriented Database**: Data is stored in JSON-like documents.
- **Object-Oriented**: Hence, Object-Relational Mapping (ORM) is not required.
- **Non-Relational (NoSQL)**: Unlike traditional databases, it doesn't use rows and tables.
- **No SQL**: MongoDB uses dynamic schemas for unstructured data.
- **Scalable**: Easily scales horizontally by adding more servers.
- **Query Language**: Uses JavaScript as the query language.
- **Data Format**: Stores data in BSON (Binary JSON) format.

# Default Port

- **27017**: The default port MongoDB listens on.

# Installation and Configuration

1. **Install MongoDB** from the official website or package manager.
https://fastdl.mongodb.org/windows/mongodb-windows-x86_64-8.0.1-signed.msi
2. **Create the following directories** (if not using Docker):
   - `C:\data\db` (for database storage)
   - `C:\data\log` (for log files)
3. **Add MongoDB to system PATH** for easy access from the terminal.

# Collections and Documents

- **Collections**: Equivalent to tables in relational databases like MySQL.
- **Documents**: Equivalent to rows in MySQL. Each document is a JSON-like object.
- **_id Field**: Automatically generated 24-digit hexadecimal identifier for each document. Can be manually provided.

# MongoDB Commands

### Show All Databases (Non-Empty)
```bash
show dbs
```

### Create or Switch Database
```bash
use book_db
```

### Create a Collection
```bash
db.createCollection("book")
```

### See All Collections
```bash
db.getCollectionNames()
```

### Insert a New Document

- **With auto-generated `_id`**:
  ```bash
  db.book.insert({
    title: "Angular Programming",
    author: "Harsh Kumar",
    price: 545.0
  })
  ```

- **With manually assigned `_id`**:
  ```bash
  db.book.insert({
    _id: 2,
    title: "Java Programming",
    author: "Gaurav Sharma",
    price: 745
  })
  ```

- **Insert a document with additional fields**:
  ```bash
  db.book.insert({
    _id: 3,
    title: "MongoDB",
    price: 745,
    publishedYear: 2020
  })
  ```

### View Documents
- View all documents:
  ```bash
  db.book.find()
  ```

- Pretty-print documents:
  ```bash
  db.book.find().pretty()
  ```

- Query by condition:
  ```bash
  db.book.find({ price: 750 })
  ```

- Query using `$or` condition:
  ```bash
  db.book.find({ $or: [{ _id: 2 }, { title: "Java Programming" }] })
  ```

- Query using greater than (`$gt`) operator:
  ```bash
  db.book.find({ price: { $gt: 800 } }).pretty()
  ```

### Delete a Document
- Delete by `_id`:
  ```bash
  db.book.remove({ _id: 4 })
  ```

- Delete by condition:
  ```bash
  db.book.remove({ title: "React JS" })
  ```

### Update a Document
- Update with a `$set` operation:
  ```bash
  db.book.update({ title: "Python for Beginners" }, { $set: { title: "Angular Programming", price: 650 } })
  ```

- Save (insert or update) a document:
  ```bash
  db.book.save({ _id: 100101, title: "Java Programming", price: 890 })
  ```

- Update a specific field in a document:
  ```bash
  db.book.update({ _id: 3 }, { $set: { price: 650 } })
  ```

### Drop a Database
```bash
db.dropDatabase()
```

### Drop a Collection
```bash
db.book.drop()
```

### Get Document Count
```bash
db.book.find().count()
```

### Query Using Less Than (`$lt`) or Greater Than (`$gt`) Operators
```bash
db.book.find({ price: { $gt: 700 } })
```

# Create a New Database

```bash
use order_db
```

# Create a New User for the `order_db` Database

```bash
db.createUser({
  user: "ramanuj",
  pwd: "password",
  roles: [
    {
      role: "readWrite",
      db: "order_db"
    }
  ]
})
```

** read and write access to the `order_db` database.
