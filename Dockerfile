FROM ubuntu:latest
LABEL authors="oakland-system"

ENTRYPOINT ["top", "-b"]