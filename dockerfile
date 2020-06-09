#https://hub.docker.com/r/jboss/wildfly
FROM jboss/wildfly:11.0.0.Final
COPY MicroInes-ear.ear /opt/jboss/wildfly/standalone/deployments/
COPY MicroInes-ejb.jar /opt/jboss/wildfly/standalone/deployments/
COPY MicroInes-web.war /opt/jboss/wildfly/standalone/deployments/

CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0"]

