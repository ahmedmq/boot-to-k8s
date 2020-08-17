#  Deployment to Kubernetes using Tanzu Build Service, Kustomize and ArgoCD

This repository showcases a use case deployment of a sample Spring boot application right from Git source to local Kubernetes cluster (Docker Desktop) using the following:

**Tanzu Build Service** - used to automatically trigger a build on code commit which in turn uses CNB (Cloud Native Buildpacks) to create a docker image from the source code and push it to DockerHub.

**Kustomize** - used to create separate deployment configuration for development and production environments.

**Argocd** - Declarative gitops tool that keeps the kubernetes deployment in sync with the ops repository which contains the Kubernetes manifest files.
