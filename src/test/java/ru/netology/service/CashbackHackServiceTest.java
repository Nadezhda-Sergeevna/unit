package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void testRemainIfAmountIsAboveBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = 900;
        int actual = service.remain(1100);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainIfAmountLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(900);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainIfAmountEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(expected, actual);
    }
}
