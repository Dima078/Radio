package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if ((currentStation < 0) || (currentStation > 9)) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation == 9) {
            currentStation = 0;
        } else
            currentStation++;
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = 9;
        } else
            currentStation--;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            this.currentVolume = 0;
            return;
        }
        if (currentVolume > 10) {
            this.currentVolume = 10;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume != 0) {
            currentVolume--;
        }
    }
}
