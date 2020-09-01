# scylladb-java-driver-mvn-archetype

ScyllaDB Java Driver Maven Archetype

# what it does

This archetype provides you with default
`org.apache.maven.archetypes:maven-archetype-quickstart`
including all neccessary to quickstart with
ScyllaDB development:

- drivers 
- mapping annotator
- dependency builder
- source code example

# current version

4.8.0-scylla-0

# quick start

```bash
$ mvn archetype:generate -DarchetypeGroupId=com.scylladb -DarchetypeArtifactId=java-quickstart -DarchetypeVersion=1.0-SNAPSHOT -DgroupId=com.project -DartifactId=sample -Dversion=1.0-SNAPSHOT
```

# dependencies

- com.scylladb.java-driver-core
- com.scylladb.java-driver-query-builder
- com.scylladb.java-driver-mapper-runtime

# link

- https://github.com/scylladb/java-driver/tree/4.x/
- https://hub.docker.com/r/scylladb/scylla/