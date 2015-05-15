package com.dukescript.demos.kocomponent.js;

import net.java.html.js.JavaScriptBody;

public final class ComponentLikeWidget {

    private ComponentLikeWidget() {
    }

    @JavaScriptBody(args = {  },body = "ko.components.register('like-widget', {\n" +
"    viewModel: function(params) {\n" +
"        // Data: value is either null, 'like', or 'dislike'\n" +
"        this.chosenValue = params.value;\n" +
"         \n" +
"        // Behaviors\n" +
"        this.like = function() { this.chosenValue('like'); }.bind(this);\n" +
"        this.dislike = function() { this.chosenValue('dislike'); }.bind(this);\n" +
"    },\n" +
"    template:\n" +
"        '<div class=\"like-or-dislike\" data-bind=\"visible: !chosenValue()\">\\\n" +
"            <button data-bind=\"click: like\">Like it</button>\\\n" +
"            <button data-bind=\"click: dislike\">Dislike it</button>\\\n" +
"        </div>\\\n" +
"        <div class=\"result\" data-bind=\"visible: chosenValue\">\\\n" +
"            You <strong data-bind=\"text: chosenValue\"></strong> it\\\n" +
"        </div>'\n" +
"});")
    public static native void registerComponent();

}
