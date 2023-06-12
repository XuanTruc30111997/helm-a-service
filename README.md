# Getting Started
## Push to Docker Registry
* **Build package:** mvn package -Dmaven.test.skip
* **Build Docker:** docker build -t practice-helm/a-service:1.1.2 .
* **Tag Image:** docker tag practice-helm/a-service:1.1.2 <repo>/helm-a-service:1.1.2
* **Push Image:** docker push <repo>/helm-a-service:1.1.2
## Helm
* **Helm install:** helm install a-service-dev -n practice-helm ./charts
* **Helm get:** helm ls --all -n practice-helm
* **Helm upgrade:** helm upgrade a-service-dev -n practice-helm ./charts
* **Helm rollback to previous version:** helm rollback a-service-dev 1 -n practice-helm
* **Helm uninstall:** helm uninstall a-service-dev -n practice-helm
