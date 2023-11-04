package ru.netology.unit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashBackHackServiceTest {

    @Test
    public void testRemain() {
        CashBackHackService service = new CashBackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainWithCashback() {
        CashBackHackService service = new CashBackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }
}