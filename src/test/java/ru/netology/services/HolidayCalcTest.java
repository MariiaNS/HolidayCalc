package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HolidayCalcTest {
    @Test
    public void testVacation3Months() {
        HolidayCalc service = new HolidayCalc();
        int expected = 3;
          int income = 10_000;
          int expense = 3000;
          int threshold = 20_000;
        int actual = service.calculate(income, expense, threshold);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testVacation2Months() {
        HolidayCalc service = new HolidayCalc();
        int expected = 2;
           int income = 100_000;
           int expense = 60_000;
          int threshold = 150_000;
        int actual = service.calculate(income, expense, threshold);

        Assertions.assertEquals(expected, actual);

    }




}