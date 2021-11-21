package test;

import java.util.HashMap;

public class HashTest {

    public static void main(java.lang.String[] args) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < 16; i++) {
            User user = new User();
            user.setAge(1);
            user.setName(i + "");
            hashMap.put(user, i);
        }
    }
}
