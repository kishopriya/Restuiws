1) This is a simple restfulApi designed.
2) This Restful Api is developed using JAX-RS libraries and Java
3) Prerequisites for running this dynamic web project.
  a) Eclipse IDE required for running the project.
  b) Downloading apache tomcat version 8.5 and assigning the ports to run properly
4) Import the project through eclipse 
  a) making sure the web xmls and the libraries are properly imported under libraries>>>webapp libraries              and web xml file to run the project on the localhost.
  b) Tests are written using postman tool.
  c) Importing rest assured and TestNg files properly we can do this tests and reports as     well 
5) Once imported properly under the eclipse, right click on the project and run as >>> run on server to initalize the tomcat server which brings up the MSRestful api on the server.

Tests
///further get tests and Post tests are performed on the postman tool///
	//Test1
	//Get tests http://localhost:8080/MSRestful/rest/messages/1///
	//this will fetch the first message successfully returned with status 200 ok
	
	//Test2
	//Get tests http://localhost:8080/MSRestful/rest/messages/2//
	//this will fetch the first message successfully returned with status 200 ok
	//Test3
	//POST tests http://localhost:8080/MSRestful/rest/messages when we send //
	//it returns message delivered successfully with 200Ststaus ok// with the header as content-type and application/HTML as the value.


	