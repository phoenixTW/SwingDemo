package com.swingDemo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kaustavc on 3/17/2015.
 *
 * Country and its capitals
 */
public class Countries {
    public static Map<? extends String, ? extends String> capitals() {
        Map<String, String> capitals = new HashMap<String, String>();
        capitals.put("India", "New Delhi");
        capitals.put("Pakistan", "Islamabad");
        capitals.put("Bangladesh", "Dhaka");

        return capitals;
    }
}
