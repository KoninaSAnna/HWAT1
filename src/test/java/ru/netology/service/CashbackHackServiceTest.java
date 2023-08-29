package ru.netology.service;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test

    public void whenAmountBoundary (){
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test

    public void whenAmountLessBoundary (){
        CashbackHackService service = new CashbackHackService();
        int amount = 810;

        int actual = service.remain(amount);
        int expected = 190;

        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void whenAmountMoreBoundary (){
        CashbackHackService service = new CashbackHackService();
        int amount = 1111;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void whenNoAmount (){
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void minBorderAmount (){
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void maxBorderAmount (){
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }



}