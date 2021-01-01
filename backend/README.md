#DOCKERIZED:

- CREATE IMAGE : ```docker build -t azurewebapp-backend-x.x .```
- RUN CONTAINER : ```docker run --rm -it -p 8080:8080 azurewebapp-front-x.x```
* ports: ```-p outside-port:inside-port``` docker compose 
* detach ```-d``` no have logs in console
