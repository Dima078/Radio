package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        int expected = 3;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationUpOutOfRangeTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 5;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationLowOutOfRangeTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 5;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationLimTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.nextStation();
        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationLimTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prevStation();
        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeOutOfRangeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeUpOutOfRangeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(110);
        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeUpTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        radio.decreaseVolume();
        int expected = 7;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeDownTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStationTest() {
        Radio radio = new Radio(10, 50);
        int expected = 50;
        int actual = radio.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetQWENumberStationTest() {
        Radio radio = new Radio(10, 50);
        int expected = 30;
        radio.setNumberStation(30);
        int actual = radio.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextNumberStationTest() {
        Radio radio = new Radio(49, 50);
        int expected = 0;
        radio.nextStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevNumberStationTest() {
        Radio radio = new Radio(0, 50);
        int expected = 49;
        radio.prevStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
}