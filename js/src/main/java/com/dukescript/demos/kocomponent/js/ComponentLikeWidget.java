package com.dukescript.demos.kocomponent.js;

import net.java.html.js.JavaScriptBody;
import net.java.html.js.JavaScriptResource;
@JavaScriptResource(value = "kocomponent.js")
public final class ComponentLikeWidget {

    private ComponentLikeWidget() {
    }

    @JavaScriptBody(args = {  },body = "")
    public static native void registerComponent();

}
