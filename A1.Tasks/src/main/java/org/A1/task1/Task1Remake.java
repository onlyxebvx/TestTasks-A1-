package org.A1.task1;

public class Task1Remake {
    public static long longToInt(String ipAddress) {
        String[] octets = ipAddress.split("\\.");
        long result = 0;
        for (int i = 0; i < 4; i++) {
            result |= Long.parseLong(octets[i]) << (24 - (8 * i));
        }
        return result;
    }


    public static String longToIp(long ipAddress) {
        StringBuilder sb = new StringBuilder(15);
        for (int i = 0; i < 4; i++) {
            sb.append((ipAddress >> (24 - (8 * i))) & 0xff);
            if (i < 3) {
                sb.append(".");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // Примеры:
        System.out.println(longToInt("128.32.10.0")); // Вывод: 2149583360
        System.out.println(longToIp(2149583360L));   // Вывод: 128.32.10.0

        System.out.println(longToInt("0.0.0.255"));  // Вывод: 255
        System.out.println(longToIp(255));          // Вывод: 0.0.0.255
    }
}
