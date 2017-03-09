# compile

```
javac helloworld.java
```

# build image

```
docker build -t java8-helloworld .
```

# run docker image

```
docker run -it --rm --name my-running-app java8-helloworld
```

# deploy to k8s

```
kubectl create -f deploy.yaml --namespace=$NAMESPACE
```
