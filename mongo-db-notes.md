**Docker MongoDB Command**

To initiate the MongoDB service using Docker, execute the following command:

```bash
docker run -p 27017:27017 —name mongo -e MONGO_INITDB_ROOT_USERNAME=admin -e MONGO_INITDB_ROOT_PASSWORD=password -e MONGO_INITDB_DATABASE=test -v /tmp/mongo-data:/data/db mongo
```

**How to Start?**
To start the MongoDB service, execute the following command:

```bash
mongo -u admin -p password —authenticationDatabase admin
```

**What is MongoDB?**
MongoDB is a document-oriented database that operates on an object-oriented basis. It does not require the use of an Object-Relational Mapping (ORM) library. MongoDB is a non-relational database, lacking the structured nature of SQL databases. It does not support SQL queries and instead utilizes JavaScript as its query language. MongoDB stores data in BSON (Binary JSON) format.

**Default Port?**
The default port for MongoDB is 27017.

**Installation and Configuration:**
To install MongoDB, follow the appropriate installation instructions for your operating system. Subsequently, create the following folders:
- `C:/data/db`
- `C:/data/log`
Finally, add MongoDB to the system’s PATH environment variable.

**Collection and Documents:**
In MongoDB, collections are analogous to tables in MySQL, while documents are equivalent to rows in MySQL. The `_id` field serves as a unique identifier for each document. It is a 24-digit numeric value that can be automatically generated or manually provided.
- Show all databases (non-empty)
	show dbs
 
- Create or switch database
	use book_db

- Create a collection
	db.createCollection(“book”)

- See all the collections
	db.getCollectionNames()

- Insert a new Document
	db.book.insert({
			title:”Angular Programming”,
			author:”Harsh Kumar”,
			price:545.0
			})
	- With auto-generated id

	db.book.insert({
			“_id” : 2,
			“title” : “Java Programming”,
			“author” : “Gaurav Sharma”,
			“price” : 745
			})
	- Manual id

	db.book.insert({
			“_id” : 3,
			“title” : “Mongo DB”,
			“price” : 745,
			“publishedYear”:2020
			})

- View the documents
	db.find()
	db.find().pretty()
	db.book.find({price:750})
	db.book.find({$or:[{_id:2},{title:”Java Programming”}]})
	db.book.find({price:{$gt:800}}).pretty()
	
- Delete

	db.book.remove({_id:4})
	db.book.remove({“title” : “React JS”})

- How to update the data
	db.book.update({title:”Python for Beginers”},{$set:{title:”Angular Programming”, price:650}})

db.book.save({_id:100101,title:’Java Programming’, price:890})



db.book.update({_id:3},{$set:{price:650}})


- Delete a database
	db.dropDatabase()

- Delete a collection
	db.book.drop()

- Get the document count
	db.book.find().count()

- Using less than or greater than in find query


	 db.book.find({price:{$gt:700}})

## Create database order_db



use order_db



## Creating a new user to access the order_db database


db.createUser(
    {
        user: “ramanuj”,
        pwd: “password”,
        roles: [
            {
```python
{
    “role”: “readWrite”,
    “db”: “order_db”
}
```




