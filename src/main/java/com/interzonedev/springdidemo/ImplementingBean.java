package com.interzonedev.springdidemo;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

/**
 * Prototype scoped bean the implements {@link AbstractSuper} and adds it own properties, one of which can be dependency
 * injected and the other set at bean creation time.
 */
@Named("implementingBean")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ImplementingBean extends AbstractSuper {

    // Can be set from the "bar" bean.
    private final String bar;

    // Can be set at bean creation time.
    private final String baz;

    @Inject
    public ImplementingBean(@Named("foo") String foo, @Named("bar") String bar, String baz) {
        super(foo);
        this.bar = bar;
        this.baz = baz;
    }

    public String getBar() {
        return bar;
    }

    public String getBaz() {
        return baz;
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder("{");
        out.append("\"foo\":\"").append(getFoo()).append("\", ");
        out.append("\"bar\":\"").append(getBar()).append("\", ");
        out.append("\"baz\":\"").append(getBaz()).append("\"");
        out.append("}");
        return out.toString();
    }

}
