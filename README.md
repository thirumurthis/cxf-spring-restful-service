# cxf-spring-restful-service
Demo cxf spring restful web service to trial

Clone or download this project directly, and import into eclipse as a new project.

Install the necessary tomcat version (used here is 8.0.38)

used the POSTMAN chrome plugin to send GET request 
http://localhost:8080/CXF_REST/rservice/getall

Jars used CXF 3.1.18 version with Jackson all jar.

The java object will directly be converted into json object.

Implementing within an application using Spring + Struts.

Ensure that if the
Struts.xml file having any exclude pattern should include that URL pattern too.
Below is a sample 
<constant name="struts.action.excludePattern" value=".*services*.,.*services/[a-zA-Z_0-9]*,.*services/[a-zA-Z_0-9]*/[a-zA-Z_0-9]*"/>

http://localhost8080/app/services/bookService => will be allowed, in this case above sample exclude pattern will allow, instead of going and checking for the structs action class mapper.
