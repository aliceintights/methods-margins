public class Radio {
    private int radio;
    private int volume;
    private int radioStationNumber;
    private int nextStation;
    private int prevStation;
    private int increaseVolume;
    private int decreaseVolume;

    public Radio(int radio, int volume, int radioStationNumber, int nextStation, int prevStation, int increaseVolume, int decreaseVolume) {
        this.radio = radio;
        this.volume = volume;
        this.radioStationNumber = radioStationNumber;
        this.nextStation = nextStation;
        this.prevStation = prevStation;
        this.increaseVolume = increaseVolume;
        this.decreaseVolume = decreaseVolume;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public void setRadioStationNumber(int radioStationNumber) {
        this.radioStationNumber = radioStationNumber;
    }

    public int getNextStation() {
        return nextStation;
    }

    public void setNextStation(int nextStation) {
        this.nextStation = nextStation;
    }

    public int getPrevStation() {
        return prevStation;
    }

    public void setPrevStation(int prevStation) {
        this.prevStation = prevStation;
    }

    public int getIncreaseVolume() {
        return increaseVolume;
    }

    public void setIncreaseVolume(int increaseVolume) {
        this.increaseVolume = increaseVolume;
    }

    public int getDecreaseVolume() {
        return decreaseVolume;
    }

    public void setDecreaseVolume(int decreaseVolume) {
        this.decreaseVolume = decreaseVolume;
    }
}
