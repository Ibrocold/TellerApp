package com.tellerapp;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class PaymentTerminalTest {

    @Test
    void testAffordableMealWithEnoughMoney() {
        PaymentTerminal terminal = new PaymentTerminal();
        assertTrue(terminal.eatAffordably(5.0)); // Should return true
    }
}
