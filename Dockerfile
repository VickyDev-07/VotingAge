FROM tomcat:latest
# Take the war and copy to webapps of tomcat
COPY target/booking.war /usr/local/tomcat/webapps/booking.war
