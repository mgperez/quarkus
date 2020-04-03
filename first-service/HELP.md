[QUARKUS - BUILDING A NATIVE EXECUTABLE](https://quarkus.io/guides/building-native-image)

- [Guide to QuarkusIO](https://www.baeldung.com/quarkus-io)
- [Installing Minishift](https://docs.okd.io/3.11/minishift/getting-started/installing.html)
- [Using the OpenShift Client Binary (oc)](https://docs.okd.io/3.11/minishift/openshift/openshift-client-binary.html)
- [Deploying the Cloud Native Starter microservices on Minishift](https://haralduebele.blog/2019/07/03/deploying-the-cloud-native-starter-microservices-on-minishift/)

- [Preparing to Install Minishift](https://docs.okd.io/3.11/minishift/getting-started/preparing-to-install.html)
- [Starting Minishift](https://docs.okd.io/3.11/minishift/getting-started/quickstart.html)

https://github.com/davsclaus/minishift-hello

- [How to install virt manager on OSX to manage KVM virtual machines](https://www.youtube.com/watch?v=EVlc5G3TzYE)

- [Troubleshooting Getting Started](https://docs.okd.io/3.11/minishift/troubleshooting/troubleshooting-getting-started.html)

- ## [Minikube with hyperkit](https://blog.arkey.fr/2018/06/18/minikube-with-hyperkit/)

##### The driver 'xhyve' is not supported on darwin

I solved this problem by using "hyperkit-driver" to instead "xhyve-drive". As below:

https://minikube.sigs.k8s.io/docs/reference/drivers/docker/

```
minikube start --driver=docker

Done! kubectl is now configured to use "minikube"
```

