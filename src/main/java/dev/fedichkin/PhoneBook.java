package dev.fedichkin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    Map<String, String> phoneBookMap = new HashMap<>();

    public int add(Map<String, String> value) {
        int count = 0;

        if (phoneBookMap.isEmpty()) {
            phoneBookMap.putAll(value);
            return value.size();
        } else {
            for (Map.Entry<String, String> entry : phoneBookMap.entrySet()) {
                if (!phoneBookMap.containsKey(entry.getKey())) {
                    phoneBookMap.put(entry.getKey(), entry.getValue());
                    count++;
                }
            }
        }

        return count;
    }

    public Map.Entry<String, String> findByNumber() {
        return null;
    }
}
