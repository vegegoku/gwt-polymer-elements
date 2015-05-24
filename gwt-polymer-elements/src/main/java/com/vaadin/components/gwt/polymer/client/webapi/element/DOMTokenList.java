package com.vaadin.components.gwt.polymer.client.webapi.element;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType(prototype="DOMTokenList")
public interface DOMTokenList {

    @JsProperty
    int getLength();
    
    boolean contains();
}
