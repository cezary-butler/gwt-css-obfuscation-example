package eu.programisci.cssResObfuscationExample.client;

import com.google.gwt.resources.client.ClientBundle;

/**
 * Sample client resource bundle with sample css
 */
public interface TestBundle extends ClientBundle {

    @Source("test.css")
    TestCssResource css();
}
