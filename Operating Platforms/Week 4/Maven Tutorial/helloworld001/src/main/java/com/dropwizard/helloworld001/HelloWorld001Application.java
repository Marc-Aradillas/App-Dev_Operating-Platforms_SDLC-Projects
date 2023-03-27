package com.dropwizard.helloworld001;

import com.dropwizard.helloworld001.HelloWorldResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HelloWorld001Application extends Application<HelloWorld001Configuration> {

    public static void main(final String[] args) throws Exception {
        new HelloWorld001Application().run(args);
    }

    @Override
    public String getName() {
        return "HelloWorld001";
    }

    @Override
    public void initialize(final Bootstrap<HelloWorld001Configuration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final HelloWorld001Configuration configuration,
                    final Environment environment) {
        // TODO: implement application
    	/*
    	 * This section registers the HelloWorldresource, which is our
    	 * HTTP end-point with the application. Once this is complete, the
    	 * end-point will be active when the application server runs. You can
    	 * register more than one end-point in the environment, but it is a 
    	 * best practice for each end-point to be developed in a separate class.
    	 */
    	environment.jersey().register(
    			new HelloWorldResource()
    			);
    	}
    }