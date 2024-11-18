**Kubernetes Notes and Commands**

**Starting Minikube:**

```bash
minikube start
```

**Checking Minikube Status:**

```bash
minikube status
```

**Resolving Minikube Failure:**

```bash
minikube stop
minikube delete —all
rm -rf ~/.minikube
minikube start —force-systemd=true
```

**Creating a Deployment:**

```bash
kubectl create deployment easy-recipes —image=ram1uj/easy-recipes
```

**Exposing a Deployment:**

```bash
kubectl expose deployment easy-recipes —type=NodePort —port=80
```

**Monitoring a Service:**

```bash
minikube service easy-recipes
```

**Retrieving Deployments:**

```bash
kubectl get deployments
```

**Retrieving Services:**

```bash
kubectl get svc
```

**Deleting a Service:**

```bash
kubectl delete svc [service-name]
```

**Deleting a Deployment:**

```bash
kubectl delete deployment [deployment-name]
```

**Scaling Applications:**

```bash
kubectl scale deployment easy-recipes —replicas=3
```

**Pushing a New Release:**

```bash
kubectl set image deployment easy-recipes easy-recipes=ram1uj/covid-info
```






