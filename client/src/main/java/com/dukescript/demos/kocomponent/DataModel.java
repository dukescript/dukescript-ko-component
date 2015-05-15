package com.dukescript.demos.kocomponent;

import net.java.html.json.ComputedProperty;
import net.java.html.json.Function;
import net.java.html.json.Model;
import net.java.html.json.Property;
import com.dukescript.demos.kocomponent.js.ComponentLikeWidget;

/**
 * Model annotation generates class Data with one message property, boolean
 * property and read only words property
 */
@Model(className = "MyViewModel", targetId = "", properties = {
    @Property(name = "products", type = Product.class, array = true)
})
final class DataModel {

    @Model(className = "Product", properties = {
        @Property(name = "name", type = String.class),
        @Property(name = "userRating", type = String.class)
    })
    final class ProductModel {
    }

}
