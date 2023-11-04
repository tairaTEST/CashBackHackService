package ru.netology.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashBackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain() {
        CachBackHackService service = new CachBackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @org.testng.annotations.Test
    public void testRemainWithCashBack() {
        CachBackHackService service = new CachBackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }
}