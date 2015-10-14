package com.example.tong.babymemo;

import java.util.Date;

public class Baby {
    private static String name = "Baby";    //if the user does not enter a name, then use Baby as default name
    private static String gender;
    private static Date birthday;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Baby.name = name;
    }

    public static String getGender() {
        return gender;
    }

    public static void setGender(String gender) {
        Baby.gender = gender;
    }

    public static Date getBirthday() {
        return birthday;
    }

    public static void setBirthday(Date birthday) {
        Baby.birthday = birthday;
    }


}
