package ru.netology.sqrswrvice.services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.sqrswrvice.services.SqrService;

public class SqrServiceTest {
    @Test
    public void shouldTestCalcExact() {
        SqrService service = new SqrService();

        int expected = 3;
        int actual = service.calculate(200, 300);


        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldTestCalcEquivalentNumbersMin() {
        SqrService service = new SqrService();

        int expected = 1;
        int actual = service.calculate(100, 100);


        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldTestCalcBoundaryNumbersMin1() {
        SqrService service = new SqrService();

        int expected = 8;
        int actual = service.calculate(90, 300);


        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldTestCalcBoundaryNumbersMin2() {
        SqrService service = new SqrService();

        int expected = 0;
        int actual = service.calculate(100, 0);


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestCalcBoundaryNumbersMax1() {
        SqrService service = new SqrService();

        int expected = 90;
        int actual = service.calculate(100, 9_801);


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestCalcBoundaryNumbersMax2() {
        SqrService service = new SqrService();

        int expected = 85;
        int actual = service.calculate(200, 10_000);


        Assertions.assertEquals(expected, actual);
    }

}





