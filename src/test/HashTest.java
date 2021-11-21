package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class HashTest {

    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < 16; i++) {
            User user = new User();
            user.setAge(1);
            user.setName(i + "");
            hashMap.put(user, i);
        }
    }
}
