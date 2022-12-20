package web.gdsc.jmlibrary.phone;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Data
public class Phone {
    private String type;
    private LocalDate releaseDate;
    private String operatingSystem;
    private Double price;
    private Double resX;
    private Double resY;
}
