#Jorge Armijo May 2019#

MicroServicio con Docker Spring Boot desarrollado con IntelliJ IDEA

# Requerimientos #
**Contenerdor**
Se requiere tener instalado Docker y la imagen base de centos
El contenedor esta listo para ser desplegado en la imagen de Docker

**MicroServicio 1**
El objetivo es generar un contenedor con un microservicio 


**DeployDocker**

```
sudo docker build -t microservicio
```

**RunDocker**
Se utilizará el puerto 8080 del docker y de la máquina donde
sea desplegado el contenedor

```
sudo docker run -d -p 8080:8080 microservicio
```

