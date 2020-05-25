# Run app:
  mvn spring-boot:run

# Test app
  mvn test
  
# Package with profile
  mvn clean package
  mvn clean package -P dev
  
# Spring boot app image
docker build -t appspring:1.0 .

# Spring boot app run
docker run --name appspring --publish 8090:8090 appspring:1.0

# Spring boot app run background
docker run -d --name appspring --publish 8090:8090 appspring:1.0
 