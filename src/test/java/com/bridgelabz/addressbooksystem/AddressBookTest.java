package com.bridgelabz.addressbooksystem;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class AddressBookTest {
    @Test
    public static void givenFirstNameIsTrue(String firstname){
        String regex = "^[A-Za-z]\\w{5,29}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstname);
        assert(matcher.matches());

    }
}
