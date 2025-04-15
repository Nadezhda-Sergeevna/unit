package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void testRemainIfAmountIsAboveBoundary() {
        CashbackHackService service = new CashbackHackService();
        int expected = 900;
        int actual = service.remain(1100);
        Assert.assertEquals(expected, actual);
    }
}