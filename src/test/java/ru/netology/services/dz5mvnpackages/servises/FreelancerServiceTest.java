package ru.netology.services.dz5mvnpackages.servises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FreelancerServiceTest {

    @Test
    void shouldCalculateRestMonthsExample1() {
        FreelancerService service = new FreelancerService();
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int expected = 3;

        int actual = service.calculate(income, expenses, threshold);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateRestMonthsExample2() {
        FreelancerService service = new FreelancerService();
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int expected = 2;

        int actual = service.calculate(income, expenses, threshold);

        assertEquals(expected, actual);
    }

}