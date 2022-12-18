package web.gdsc.jmlibrary.phone;


import java.time.LocalDate;

public class Phone {
    private String type;
    private LocalDate releaseDate;
    private String operatingSystem;
    private Double price;
    private Double resX;
    private Double resY;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getResX() {
        return resX;
    }

    public void setResX(Double resX) {
        this.resX = resX;
    }

    public Double getResY() {
        return resY;
    }

    public void setResY(Double resY) {
        this.resY = resY;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "type='" + type + '\'' +
                ", releaseDate=" + releaseDate +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", price=" + price +
                ", resX=" + resX +
                ", resY=" + resY +
                '}';
    }
}
