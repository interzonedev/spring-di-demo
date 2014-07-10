package com.interzonedev.springdidemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Starts and runs the application from the command line.
 */
public class AppRunner {

    public void runApp() {

        // Create and register for autoclosing the annotation configured Spring application context.
        try (AnnotationConfigApplicationContext appCtx = new AnnotationConfigApplicationContext()) {

            // Configure and start the application context.
            appCtx.register(AppConfig.class);
            appCtx.refresh();
            if (!appCtx.isRunning()) {
                appCtx.start();
            }

            // Explicitly pass in all 3 constructor arguments, effectively overriding the dependency inject in the
            // ImplementingBean constructor.
            ImplementingBean implementingBean1 = (ImplementingBean) appCtx.getBean("implementingBean", "a", "b",
                    "bazValue");
            System.out.println("implementingBean1 = " + implementingBean1);

            // TODO - How can Spring dependency inject the first 2 out of 3 constructor arguments when creating an
            // ImplementingBean instance?
            ImplementingBean implementingBean2 = (ImplementingBean) appCtx.getBean("implementingBean", "bazValue");
            System.out.println("implementingBean2 = " + implementingBean2);
        }

    }

    public static void main(String[] args) {
        (new AppRunner()).runApp();
    }

}
