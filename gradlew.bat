#!/bin/sh

# Gradle startup script for macOS

# Set the APP_HOME directory
DIRNAME=$(dirname "$0")
APP_HOME=$(cd "$DIRNAME" && pwd -P)

# Add default JVM options here. You can also use JAVA_OPTS and GRADLE_OPTS to pass JVM options to this script.
DEFAULT_JVM_OPTS="-Xmx64m -Xms64m"

# Find the Java executable
if [ -n "$JAVA_HOME" ] ; then
    JAVA_EXE="$JAVA_HOME/bin/java"
else
    JAVA_EXE="java"
fi

# Set the CLASSPATH
CLASSPATH="$APP_HOME/gradle/wrapper/gradle-wrapper.jar"

# Execute Gradle
"$JAVA_EXE" $DEFAULT_JVM_OPTS $JAVA_OPTS $GRADLE_OPTS "-Dorg.gradle.appname=$(basename "$0")" -classpath "$CLASSPATH" org.gradle.wrapper.GradleWrapperMain "$@"
