package org.example;

public class Radio {
    private int radioStationNumber;
    private int volume;

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber > 9) {
            return;
        }

        if (newRadioStationNumber < 0) {
            return;
        }

        radioStationNumber = newRadioStationNumber;
    }

    public void setStationToMax() {
        radioStationNumber = 9;
    }

    public void setStationToMin() {
        radioStationNumber = 0;
    }

    public void nextStation() {
        if (radioStationNumber < 9) {
            radioStationNumber++;
            return;
        }
        radioStationNumber = 0;
    }


    public void prevStation() {
        if (radioStationNumber > 0) {
            radioStationNumber--;
            return;
        }
        radioStationNumber = 9;
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume > 100) {
            return;
        }
        if (newVolume < 0) {
            return;
        }
        volume = newVolume;
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }
}

