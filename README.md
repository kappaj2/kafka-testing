Download Kafka...
https://www.apache.org/dyn/closer.cgi?path=/kafka/2.3.0/kafka_2.12-2.3.0.tgz

Start kafka:
cd /opt/kafka/kafka_2.12-2.3.0
one term :
$ bin/zookeeper-server-start.sh config/zookeeper.properties
other term :
$ bin/kafka-server-start.sh config/server.properties


Start consumer to see messages coming in...