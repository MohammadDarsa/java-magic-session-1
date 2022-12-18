package web.gdsc.jmlibrary;

import web.gdsc.jmlibrary.phone.Phone;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class PhoneFactory {

    public static final PhoneFactory INSTANCE;

    private final Map<String, Supplier<Phone>> phoneMap;

    static {
        INSTANCE = new PhoneFactory();
    }

    private PhoneFactory() {
        phoneMap  = new HashMap<>();
    }

    public Phone getPhone(String phoneType) {
        return phoneMap.getOrDefault(phoneType, () -> null).get();
    }

    public void setPhoneConstructor(String phoneType, Supplier<Phone> supplier) {
        phoneMap.put(phoneType, supplier);
    }
}