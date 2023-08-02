import com.phone.Os;
import com.phone.OsFactory;
import com.phone.Phone;
import com.phone.PhoneBuilder;

public class Main {
    public static void main(String[] args) {
//        OsFactory obj = new OsFactory();
//        Os phoneOne = obj.FactoryInstance("Android");
//        Os phoneTwo = obj.FactoryInstance("IOS");
//
//        phoneOne.spec();
//        phoneTwo.spec();


        // Builder
        PhoneBuilder redmi = new PhoneBuilder().setBattery(30);
        Phone felixPhone = redmi.getPhone();
        System.out.println(felixPhone);
    }
}