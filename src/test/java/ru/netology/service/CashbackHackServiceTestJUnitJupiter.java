package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTestJUnitJupiter {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn120IfAmount880() {

        int actual = service.remain(880);
        int expected = 120;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn900IfAmount100() {

        int actual = service.remain(100);
        int expected = 900;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnZeroIfAmount1000() {

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }
}