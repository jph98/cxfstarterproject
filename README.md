Sample CXF Service
==================

This is an example Apache CXF 2.5 REST service. 

Embedded Tomcat
---------------

See the following for the goals to run on the embedded Tomcat: 

http://tomcat.apache.org/maven-plugin-2.0/context-goals.html

To get help:

	mvn tomcat7:help
	
To package and run:

	mvn package
	mvn tomcat7:run
	
This runs the current project under the context by the same finalname of the war file built (cxfstarterproject):

	http://localhost:8080/cxfstarterproject
	
Endpoints
---------
	
The CXF servlet is the main entry point, from where you can see the WADL:

	http://localhost:8080/cxfstarterproject/services
	
and the default REST service built here can be viewed as:

	http://localhost:8080/cxfstarterproject/scriptexecution/
	
Path for explanation of this:

	web.xml -> beans.xml -> WebService		