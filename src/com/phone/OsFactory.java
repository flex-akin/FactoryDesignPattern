package com.phone;

public class OsFactory {
    public Os FactoryInstance(String OsName) {
        if (OsName.equals("Android")) {
            return  new Android();
        }
        else if (OsName.equals("IOS")){
            return new Ios();
        }
        else {
            return new Windows();
        }
    }
}
