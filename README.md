Minimal web application including:

1. A servlet which expose service bean methods
2. A Generic dao implementation with an embedded object database (DBMS is ObjectDB https://www.objectdb.com/)

The web application expose an example bean implemented byt the class it.solutionsexmachina.webapp.actionbeans.ContactManager
and it save a row of type it.solutionsexmachina.webapp.entities.Contact on the database if not present

After starting the web application, the method ca be tested calling the endpoint http://localhost:8080/webapp/ajax/ContactManager
with the following body:

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
