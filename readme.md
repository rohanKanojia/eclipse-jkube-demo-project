# Random Generator Application Demonstrating usage of Eclipse JKube for deploying onto Kubernetes

This is a simple random number generation application which just generates a random string on `/random` endpoint. It just
demonstrates usage of Eclipse JKube: https://github.com/eclipse/jkube

## How to build
Just run `mvn clean install`

## How to run
Do `mvn spring-boot:run`

After spring boot initializes, just do a `curl localhost:8080/random` to check endpoint.

## How to deploy application on Kubernetes/Openshift

- Building Docker image

  In order to build docker image of your application, you just have to make sure your docker deamon is running. If using
  minikube, you can simply do `eval $(minikube docker-env)` to expose docker deamon running inside minikube vm. Now in
  order to build simply issue:

  ```
     mvn k8s:build
  ```
  <img src="https://developers.redhat.com/blog/wp-content/uploads/2019/12/Screenshot-from-2019-12-19-18-32-45-768x542.png" alt="Eclipse JKube Build"/>

- Generating Kubernetes Manifests
  
  Once your image is built, you need to generate Kubernetes resource manifests for your Deployments, Service etc. To do
  it using Eclipse Jkube Kubernetes Maven Plugin just do:

  ```
     mvn k8s:resource
  ```
  <img src="https://developers.redhat.com/blog/wp-content/uploads/2019/12/Screenshot-from-2019-12-19-18-39-13-768x273.png" alt="Eclipse JKube resource generation" />

- Deploying application onto Kubernetes
  
  In order to deploy these generated manifests onto Kubernetes, just issue:

  ```
     mvn k8s:deploy
  ```
  <img src="https://developers.redhat.com/blog/wp-content/uploads/2019/12/Screenshot-from-2019-12-19-18-50-30-300x244.png" alt="Eclipse JKube applying generated Manifests" />
  
  You'd observe they would be applied onto your Kubernetes Cluster.

- Undeploy your application from Kubernetes cluster

  If you want to undeploy, we have this goal to delete all resources applied.

  ```
     mvn k8s:undeploy
  ```
  <img src="https://developers.redhat.com/blog/wp-content/uploads/2019/12/Screenshot-from-2019-12-19-18-53-11-300x182.png" alt="Eclipse JKube deleting deployed resources" />
