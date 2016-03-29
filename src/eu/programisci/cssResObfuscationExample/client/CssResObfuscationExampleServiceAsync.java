package eu.programisci.cssResObfuscationExample.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface CssResObfuscationExampleServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}
