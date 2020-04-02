package org.garpesa.services;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;

/**
 * https://www.baeldung.com/quarkus-io
 */
@ApplicationScoped
public class HelloService {

    @ConfigProperty(name = "greeting")
    private String greeting;

    public String politeHello(String name){
        return greeting + " " + name;
    }


}