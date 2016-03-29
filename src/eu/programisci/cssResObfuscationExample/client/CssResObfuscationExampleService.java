package eu.programisci.cssResObfuscationExample.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("CssResObfuscationExampleService")
public interface CssResObfuscationExampleService extends RemoteService {
    // Sample interface method of remote interface
    String getMessage(String msg);

    /**
     * Utility/Convenience class.
     * Use CssResObfuscationExampleService.App.getInstance() to access static instance of CssResObfuscationExampleServiceAsync
     */
    public static class App {
        private static CssResObfuscationExampleServiceAsync ourInstance = GWT.create(CssResObfuscationExampleService.class);

        public static synchronized CssResObfuscationExampleServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
