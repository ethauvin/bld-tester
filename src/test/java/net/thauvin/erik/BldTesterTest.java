package net.thauvin.erik;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BldTesterTest {
    @Test
    void verifyHello() {
        assertEquals("Hello World!", new BldTesterMain().getMessage());
    }
}
