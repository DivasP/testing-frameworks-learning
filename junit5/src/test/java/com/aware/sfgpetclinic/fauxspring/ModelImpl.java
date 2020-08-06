package com.aware.sfgpetclinic.fauxspring;

import java.util.HashMap;
import java.util.Map;

/*
Here we are implementing the Model interface from the main package
 */
public class ModelImpl implements Model {

    Map map = new HashMap();

    @Override
    public void addAttribute(String key, Object o) {
        map.put(key,o);
    }

    @Override
    public void addAttribute(Object o) {
        // do nothing
    }

}
