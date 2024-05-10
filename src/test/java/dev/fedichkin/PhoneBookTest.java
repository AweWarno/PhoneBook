package dev.fedichkin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class PhoneBookTest {

    @Test
    void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        Map<String, String> map = new HashMap<>();
        map.put("test", "111111");
        Assertions.assertEquals(1, phoneBook.add(map));
    }

    @Test
    void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        Assertions.assertNotNull(phoneBook.findByNumber());
    }
}