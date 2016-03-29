package eu.programisci.cssResObfuscationExample.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import eu.programisci.cssResObfuscationExample.client.CssResObfuscationExampleService;

public class CssResObfuscationExampleServiceImpl extends RemoteServiceServlet implements CssResObfuscationExampleService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}