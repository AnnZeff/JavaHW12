package ru.netology;

public class Radio {
    public int currentChannel;

    public void setToMinChannel() {

        currentChannel = 0;
    }

    public void setToMaxChannel() {
        currentChannel = 9;
    }

    public void setCurrentChannel(int newCurrentChannel) {

        currentChannel = newCurrentChannel;
    }

    public void nextChannel() {
        if (currentChannel >= 0) {
            currentChannel = currentChannel + 1;
        }
        if (currentChannel > 9) {
            currentChannel = 0;
        }
        if (currentChannel < 0) {
            currentChannel = 9;
        }
    }

    public int currentVolume;

    public void setToMinVolume() {
        currentVolume = 0;
    }

    public void setToMaxVolume() {
        currentVolume = 100;
    }


    public void ambitVolume() {
        if (currentVolume <= 0) {
            setToMinVolume();
        }
        if (currentVolume >= 100) {
            setToMaxVolume();
        }
    }

    public void increaseVolume() {

        currentVolume = currentVolume + 1;


    }

    public void decreaseVolume() {
        currentVolume = currentVolume - 1;
    }


}
