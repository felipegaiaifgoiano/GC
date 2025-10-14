package com.backend;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testSoma() {
        App a = new App();
        int result = a.soma(2, 3);
        assertEquals(5, result, "2 + 3 deve ser 5");
    }
    
    @Test
    void testSubtracao() {
        App a = new App();
        int result = a.sub(5, 3);
        assertEquals(2, result, "5 - 3 deve ser 2");
    }
}