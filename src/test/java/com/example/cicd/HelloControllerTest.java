package com.example.cicd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloControllerTest {
    @Test
    void testMessage() {
        HelloController controller = new HelloController();
        assertEquals("Hello from CI/CD Pipeline!", controller.hello());
    }
}
