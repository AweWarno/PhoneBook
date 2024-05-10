package dev.fedichkin;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    Map<String, String> phoneBookMap = new HashMap<>();

    public int add(Map<String, String> value) {
        int count = 0;

        if (phoneBookMap.isEmpty()) {
            phoneBookMap.putAll(value);
            count = value.size();

            return count;
        } else {
            for (Map.Entry<String, String> entry : value.entrySet()) {
                if (!phoneBookMap.containsKey(entry.getKey())) {
                    phoneBookMap.put(entry.getKey(), entry.getValue());
                    count++;
                }
            }
        }

        return count;
    }
}
