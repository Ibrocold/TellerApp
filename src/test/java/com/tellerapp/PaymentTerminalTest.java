package com.tellerapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class PaymentTerminalTest {

    @Test
    void testEatAffordablyWithCash() {
        PaymentTerminal terminal = new PaymentTerminal();
        // The cash version returns a double (the change)
        double change = terminal.eatAffordably(10.0); 
        
        // Use assertEquals(expected, actual, delta) for numbers
        assertEquals(7.5, change, 0.001, "Change should be 7.5 when paying 10.0 for a 2.5 meal");
    }

    @Test
    void testEatAffordablyWithCard() {
        PaymentTerminal terminal = new PaymentTerminal();
        PaymentCard card = new PaymentCard(10.0);
        
        // The card version returns a boolean, so assertTrue works here
        boolean success = terminal.eatAffordably(card);
        assertTrue(success, "Card transaction should return true");
    }
}
