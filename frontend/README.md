run 

#DOCKERIZED:

- CREATE IMAGE : ```docker build -t azurewebapp-front-x.x .```
- RUN CONTAINER : ```docker run --rm -it -p 4200:4200 azurewebapp-front-x.x```
* ports: ```-p outside-port:inside-port``` docker compose 
* detach ```-d``` kontener działa w tle nie ma logow w consoli
