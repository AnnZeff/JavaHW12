package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void testCurrentChannel() {
        Radio chan = new Radio();
        chan.currentChannel = 5;

        int expected = 5;
        int actual = chan.currentChannel;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetToMinChannel() {
        Radio chan = new Radio();
        chan.setToMinChannel();

        int expected = 0;
        int actual = chan.currentChannel;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetToMaxChannel() {
        Radio chan = new Radio();
        chan.setToMaxChannel();

        int expected = 9;
        int actual = chan.currentChannel;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testCurrentNomberOfChannel() {
        Radio chan = new Radio();

        chan.setCurrentChannel(1);

        int expected = 1;
        int acteal = chan.currentChannel;

        Assertions.assertEquals(expected, acteal);
    }

    @Test
    public void testNextChannel() {
        Radio chan = new Radio();
        chan.currentChannel = 4;
        chan.nextChannel();

        int expected = 5;
        int actual = chan.currentChannel;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotNextChannelAboveMax() {
        Radio chan = new Radio();
        chan.currentChannel = 10;
        chan.nextChannel();

        int expected = 0;
        int actual = chan.currentChannel;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotNextChannelBelowMin() {
        Radio chan = new Radio();
        chan.currentChannel = -1;
        chan.nextChannel();

        int expected = 9;
        int actual = chan.currentChannel;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCurrentVolume() {
        Radio vol = new Radio();
        vol.currentVolume = 50;

        int expected = 50;
        int actual = vol.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetToMinVolume() {
        Radio vol = new Radio();
        vol.setToMinVolume();

        int expected = 0;
        int actual = vol.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetToMaxVolume() {
        Radio vol = new Radio();
        vol.setToMaxVolume();

        int expected = 100;
        int actual = vol.currentVolume;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testIncreaseVolume() {
        Radio vol = new Radio();
        vol.currentVolume = 54;
        vol.increaseVolume();

        int expected = 55;
        int actual = vol.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolume() {
        Radio vol = new Radio();
        vol.currentVolume = 54;
        vol.decreaseVolume();

        int expected = 53;
        int actual = vol.currentVolume;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void sholdNotAmbitVolumeLowMin() {
        Radio vol = new Radio();
        vol.currentVolume = -1;
        vol.ambitVolume();

        int expected = 0;
        int actual = vol.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdNotAmbitVolumeAboveMax() {
        Radio vol = new Radio();
        vol.currentVolume = 101;
        vol.ambitVolume();

        int expected = 100;
        int actual = vol.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

}