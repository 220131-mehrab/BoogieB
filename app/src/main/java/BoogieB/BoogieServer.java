package BoogieB;

import org.apache.catalina.startup.Tomcat;

public class BoogieServer {
    private Tomcat server;

    public BoogieServer(BoogieServer boogieServer) {
        this.server = new Tomcat();
        this.server.setBaseDir(System.getProperty("java.io.tmpdir"));
        this.server.getConnector();
        this.server.addContext("contextPath", null);
    }
}
