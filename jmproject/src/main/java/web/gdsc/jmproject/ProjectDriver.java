package web.gdsc.jmproject;

import web.gdsc.jmlibrary.PhoneFactory;

public class ProjectDriver {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();
        System.out.println(phoneFactory.getPhone("Iphone 13"));
    }
}
