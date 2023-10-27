package ru.netologi.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {

    @Test // устанавливаем номер радиостанции
    public void shouldSetNumber() {
        Radio rad = new Radio(30);

        rad.setCurrentNumber(22);

        int expected = 22;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test // устанавливаем номер радиостанции (по умолчанию)
    public void shouldSetNumberDefault() {
        Radio rad = new Radio();

        rad.setCurrentNumber(7);

        int expected = 7;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }



    @Test // устанавливаем номер больше 9 (по умолчанию)
    public void shouldNotSetNumberAboveMaxDefault() {
        Radio rad = new Radio();

        rad.setCurrentNumber(10);

        int expected = 0;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test // устанавливаем номер больше Nubers
    public void shouldNotSetNumberAboveMax() {
        Radio rad = new Radio(30);

        rad.setCurrentNumber(35);

        int expected = 0;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test // устанавливаем номер Nubers - 1 верхнее значение
    public void shouldNotSetNumber1() {
        Radio rad = new Radio(30);

        rad.setCurrentNumber(29);

        int expected = 29;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test // устанавливаем номер Nubers - 1 нижнее значение
    public void shouldNotSetNumber0() {
        Radio rad = new Radio(30);

        rad.setCurrentNumber(0);

        int expected = 0;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test // устанавливаем номер меньше 0 (по умолчанию)
    public void shouldNotSetNumberAboveMinDefault() {
        Radio rad = new Radio();

        rad.setCurrentNumber(-1);

        int expected = 0;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test // устанавливаем номер меньше 0
    public void shouldNotSetNumberAboveMin() {
        Radio rad = new Radio(30);

        rad.setCurrentNumber(-1);

        int expected = 0;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test //прибавляем звук
    public void increaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(15);

        rad.increaseVolume();

        int expected = 16;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //убавляем звук
    public void decreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(15);

        rad.decreaseVolume();

        int expected = 14;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test // кнопка следующей радиостанции (по умолчанию)
    public void NextNumberDefault() {
        Radio rad = new Radio();

        rad.setCurrentNumber(5);

        rad.nextNumber();

        int expected = 6;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test // кнопка следующей радиостанции
    public void NextNumber() {
        Radio rad = new Radio(30);

        rad.setCurrentNumber(22);

        rad.nextNumber();

        int expected = 23;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test // кнопка предыдущей радиостанции (по умолчанию)
    public void PrevNumberDefault() {
        Radio rad = new Radio();

        rad.setCurrentNumber(5);

        rad.prevNumber();

        int expected = 4;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test // кнопка предыдущей радиостанции
    public void PrevNumber() {
        Radio rad = new Radio(30);

        rad.setCurrentNumber(22);

        rad.prevNumber();

        int expected = 21;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test // кнопка следующей радиостанции на 9 (по умолчанию)
    public void NextNumber9Default() {
        Radio rad = new Radio();

        rad.setCurrentNumber(9);

        rad.nextNumber();

        int expected = 0;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test // кнопка следующей радиостанции max
    public void NextNumber9() {
        Radio rad = new Radio(30);

        rad.setCurrentNumber(29);

        rad.nextNumber();

        int expected = 0;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test // кнопка следующей радиостанции c 8 на 9 (по умолчанию)
    public void NextNumber8Default() {
        Radio rad = new Radio();

        rad.setCurrentNumber(8);

        rad.nextNumber();

        int expected = 9;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test // кнопка следующей радиостанции на max
    public void NextNumber8() {
        Radio rad = new Radio(30);

        rad.setCurrentNumber(28);

        rad.nextNumber();

        int expected = 29;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test // кнопка предыдущей радиостанции на 0 (по умолчанию)
    public void PrevNumber0Default() {
        Radio rad = new Radio();

        rad.setCurrentNumber(0);

        rad.prevNumber();

        int expected = 9;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test // кнопка предыдущей радиостанции на 0
    public void PrevNumber0() {
        Radio rad = new Radio(30);

        rad.setCurrentNumber(0);

        rad.prevNumber();

        int expected = 29;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test // кнопка предыдущей радиостанции с 1 на 0
    public void PrevNumber1() {
        Radio rad = new Radio(30);

        rad.setCurrentNumber(1);

        rad.prevNumber();

        int expected = 0;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test // кнопка предыдущей радиостанции с 1 на 0 (по умолчанию)
    public void PrevNumber1Default() {
        Radio rad = new Radio();

        rad.setCurrentNumber(1);

        rad.prevNumber();

        int expected = 0;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test //прибавляем звук больше 100
    public void increaseVolume100() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);

        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //убавляем звук меньше 0
    public void decreaseVolume0() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);

        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //прибавляем звук на 100
    public void increaseVolume99() {
        Radio rad = new Radio();

        rad.setCurrentVolume(99);

        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //убавляем звук на 0
    public void decreaseVolume1() {
        Radio rad = new Radio();

        rad.setCurrentVolume(1);

        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test // устанавливаем номер радиостанции 9 (по умолчанию
    public void shouldSetNumber9Default() {
        Radio rad = new Radio();

        rad.setCurrentNumber(9);

        int expected = 9;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test // устанавливаем номер радиостанции 0
    public void shouldSetNumber0() {
        Radio rad = new Radio();

        rad.setCurrentNumber(0);

        int expected = 0;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }
}