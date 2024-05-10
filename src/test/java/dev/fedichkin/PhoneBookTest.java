package dev.fedichkin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PhoneBookTest {

    @Test
    void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        Assertions.assertEquals(-1, phoneBook.add());
    }
}