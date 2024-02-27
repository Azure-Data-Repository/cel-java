#!/usr/bin/env bash
echo "\
MAVEN_USER=$NEXUS_TOKEN MAVEN_PASSWORD=$NEXUS_PW bazel run --stamp \
  --define \"maven_repo=https://nexus.int.snowflakecomputing.com/repository/Releases/\" \
  //publish:cel.publish\
"
