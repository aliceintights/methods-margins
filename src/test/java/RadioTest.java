import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldGetMaxRadioStationNumber() {
        Radio radio = new Radio();

        radio.setStationToMax();

        int expected = 9;
        int actual = radio.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMinRadioStationNumber() {
        Radio radio = new Radio();

        radio.setStationToMin();

        int expected = 0;
        int actual = radio.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationNumber() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(10);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStationNumber() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(-1);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldGetNextStationFromMax() {
        Radio radio = new Radio();

        radio.nextStation();

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetPrevStationFromMin() {
        Radio radio = new Radio();

        radio.prevStation();

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetManuallySetStation() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(5);

        int expected = 5;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMaxVolume() {
        Radio volume = new Radio();

        volume.setVolumeToMax();

        int expected = 100;
        int actual = volume.volume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMinVolume() {
        Radio volume = new Radio();

        volume.setVolumeToMin();

        int expected = 0;
        int actual = volume.volume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnVolumeAfterAHundred() {
        Radio volume = new Radio();

        volume.volumeMoreThanMax();

        int expected = 0;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnVolumeAfterZero() {
        Radio volume = new Radio();

        volume.volumeLowerThanZero();

        int expected = 100;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnVolumeSetHigherThanMax() {
        Radio volume = new Radio();

        volume.setVolume(101);

        int expected = 0;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnVolumeLowerThanMin() {
        Radio volume = new Radio();

        volume.setVolume(-10);

        int expected = 0;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnVolumeSetManually() {
        Radio volume = new Radio();

        volume.setVolume(20);

        int expected = 20;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

}