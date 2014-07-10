package com.interzonedev.springdidemo;

/**
 * Abstract superclass with a top level property.
 */
public abstract class AbstractSuper {

    private final String foo;

    // TODO - Is there a way Spring can dependency inject the "foo" bean on the AbstractSuper constructor?
    public AbstractSuper(String foo) {
        this.foo = foo;
    }

    public String getFoo() {
        return foo;
    }

}
