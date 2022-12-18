package web.gdsc.jmproject;

import web.gdsc.jmlibrary.PhoneFactory;
import web.gdsc.jmlibrary.phone.Phone;

import java.time.LocalDate;

public class ProjectDriver {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();

        //registered a function that creates an A53 phone
        phoneFactory.setPhoneConstructor("A53", ProjectDriver::createA53);

        System.out.println(phoneFactory.getPhone("A523"));
    }

    public static Phone createA53() {
        Phone phone = new Phone();
        phone.setType("A53");
        phone.setResX(1080.0);
        phone.setPrice(399.99);
        phone.setResY(2400.0);
        phone.setReleaseDate(LocalDate.of( 2022, 3, 24));
        phone.setOperatingSystem("android 11");
        return phone;
    }
}
