package dev.fedichkin;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> phoneBookMap = new HashMap<>();

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

    public String findByNumber(String value) {
        return phoneBookMap.entrySet().stream()
                .filter(entry -> value.equals(entry.getValue()))
                .findFirst().map(Map.Entry::getKey)
                .orElse(null);
    }

    public String findByName(String value) {
        return phoneBookMap.getOrDefault(value, null);
    }
}
