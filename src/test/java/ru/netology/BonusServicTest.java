package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatServiceTest {

    @Test
    void calcSum() {
        BonusService service = new BonusService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calcSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calcAverSum() {
        BonusService service = new BonusService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        double actual = service.calcAverSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calcMaxMont() {
        BonusService service = new BonusService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.calcMaxMont(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calcMinMont() {
        BonusService service = new BonusService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.calcMinMont(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calcCountUnAver() {
        BonusService service = new BonusService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        double actual = service.calcCountUnAver(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calcCountUpAver() { 
        BonusService service = new BonusService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        double actual = service.calcCountUpAver(sales);
        assertEquals(expected, actual);
    }
}