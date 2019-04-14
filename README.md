# Minimal web application including:

- A servlet which expose service bean methods
- A Generic dao implementation with an embedded object database (DBMS is [ObjectDB][endpoint])

The web application expose an example bean implemented byt the class it.solutionsexmachina.webapp.actionbeans.ContactManager
and it save a row of type it.solutionsexmachina.webapp.entities.Contact on the database if not present

After starting the web application, the method ca be tested calling the [endpoint][endpoint] (POST)

with the following body request:

```sh
{
	"bean": "ContactManager",
	"method": "getOrSave",
	"parameters":[
		{
			"name":"name",
			"value":"Diego",
		},
		{
			"name":"address",
			"value":"Via Achille Grandi 4, Cabiate",
		}
	]
}
```

[objectdb]: <https://www.objectdb.com/>
[endpoint]: <http://localhost:8080/webapp/ajax/ContactManager>
