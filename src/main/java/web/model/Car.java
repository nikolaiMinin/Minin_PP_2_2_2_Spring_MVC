package web.model;

public class Car {
    String model;
    String series;
    int vinNumber;

    public Car(String model, String series, int vinNumber) {
        this.model = model;
        this.series = series;
        this.vinNumber = vinNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(int vinNumber) {
        this.vinNumber = vinNumber;
    }
}
