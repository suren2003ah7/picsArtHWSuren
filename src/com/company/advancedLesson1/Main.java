package com.company.advancedLesson1;

import com.company.advancedLesson1.test.UserServiceTest;

public class Main {
    public static void main(String args[]) {
        UserServiceTest.doSerialize();
        UserServiceTest.doDeSerialize();
        String j = UserServiceTest.doGsonSerialize();
        UserServiceTest.doGsonDeserialize(j);
        UserServiceTest.doXMLSerialize();
        UserServiceTest.doXMLDeserialize();
    }
}
