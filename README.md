## Spring DI Demo

#### Very small demo app to demonstrate Spring dependency injection.

To build: `mvn clean package`

To run: `./bin/apprunner`

#### Issues

* How can Spring dependency inject the first 2 out of 3 constructor arguments when creating an `ImplementingBean` instance?
* Is there a way Spring can dependency inject the "foo" bean on the `AbstractSuper` constructor?
