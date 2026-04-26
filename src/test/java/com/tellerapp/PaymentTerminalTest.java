@Test
void testAffordableMealWithEnoughMoney() {
    PaymentTerminal terminal = new PaymentTerminal();
    assertTrue(terminal.eatAffordably(5.0)); // Should return true
}