FROM ubuntu:jammy
COPY target/springboot-graalvm-docker /springboot-graalvm-docker
CMD ["/springboot-graalvm-docker"]

#docker pull bellsoft/liberica-openjdk-alpine:23-cds

#https://hub.docker.com/r/bellsoft/liberica-native-image-kit-container