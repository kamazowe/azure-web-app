# APPLICATION

### RUN DOCKERIZED APP: ```docker-compose -f docker-compose.dev.yml up```
 (run last image - cached image)
 
 ##### WARNING: if you want to be sure that the image is new : 
 
 1. delete containers 
    - delete all containers: ```docker rm $(docker ps -a -q)``` 
 2. delete images
    - delete all images: ```docker image rm $(docker image ls -a -q)``` 

### RUN LOCAL APP (if you don't need more customization):
   - db:
    ./database/setup.sh
   
   - api:  
   // TODO 
    ./backend/setup.sh
   alternative:
    run in IDE with active profile 'local' 
   
   - front: ./frontend/setup.sh

### DEPENDECIES:

#### RUN:
- docker: 19.x.x + 
    - for windows: you must have enable wsdl2,
    - for linux: manage docker as non-root users ```https://docs.docker.com/engine/install/linux-postinstall/```

#### DEVELOP:
- node: 12.x.x +
- java: 11

