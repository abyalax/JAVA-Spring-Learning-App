package com.learning.spring;

import org.junit.jupiter.api.Test;


public class DatabaseTest {
    
    @Test
    void testDatabase() {
        var db1 = Database.getInstance();
        var db2 = Database.getInstance();
        assert db1 == db2;
    }
}
