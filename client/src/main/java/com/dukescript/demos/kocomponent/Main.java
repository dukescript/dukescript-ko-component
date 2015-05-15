package com.dukescript.demos.kocomponent;

import com.dukescript.demos.kocomponent.js.ComponentLikeWidget;
import net.java.html.boot.BrowserBuilder;
import net.java.html.json.Models;

public final class Main {
    private Main() {
    }
    
    public static void main(String... args) throws Exception {
        BrowserBuilder.newBrowser().
            loadPage("pages/index.html").
            loadClass(Main.class).
            invoke("onPageLoad", args).
            showAndWait();
        System.exit(0);
    }

    /**
     * Called when the page is ready.
     */
    public static void onPageLoad() throws Exception {
        
        Product pain = new Product();
        pain.setName("Pain au chocolat");
        Product spag = new Product();
        pain.setName("Seagull Spaghetti");
        MyViewModel m = new MyViewModel(
                new Product("Garlic bread", "like"),
                pain, spag       
        );
        Models.toRaw(m); // this line is required to initialize knockout
        ComponentLikeWidget.registerComponent();
        m.applyBindings();
    }
    
}
