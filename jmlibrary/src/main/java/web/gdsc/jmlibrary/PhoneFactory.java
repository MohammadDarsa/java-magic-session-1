package web.gdsc.jmlibrary;

import web.gdsc.jmlibrary.phone.Phone;

import java.time.LocalDate;

public class PhoneFactory {

    public Phone getPhone(String phoneType) {
        if(phoneType.equalsIgnoreCase("A53")) {
            Phone a53 = new Phone();
            a53.setType("A53");
            a53.setOperatingSystem("android 11");
            a53.setReleaseDate(LocalDate.of(2022, 3, 24));
            a53.setPrice(449.99);
            a53.setResY(2400.0);
            a53.setResX(1080.0);
            return a53;
        }

        else if(phoneType.equalsIgnoreCase("iphone 13")) {
            Phone iphone13 = new Phone();
            iphone13.setType("iphone 13");
            iphone13.setOperatingSystem("IOS 15");
            iphone13.setReleaseDate(LocalDate.of(2021, 9, 24));
            iphone13.setPrice(799.99);
            iphone13.setResY(2532.0);
            iphone13.setResX(1170.0);
            return iphone13;
        }

        else return null;
    }
}