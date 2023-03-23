package org.A1.task1;


public class Task1{

    public static int ipToInt(String ipAddress) {
        String[] octets = ipAddress.split("\\.");
        int result = 0;
        for (int i = 0; i < 4; i++) {
            result |= Integer.parseInt(octets[i]) << (24 - (8 * i));
        }
        return result;
    }

    public static String intToIp(int ipAddress) {
        StringBuilder sb = new StringBuilder(15);
        for (int i = 0; i < 4; i++) {
            sb.append((ipAddress >>> (24 - (8 * i))) & 0xff);
            if (i < 3) {
                sb.append(".");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // Примеры:
        System.out.println(ipToInt("128.32.10.0")); // Вывод: -214958336
        System.out.println(intToIp((int)2149583360L));   // Вывод: 128.32.10.0

        System.out.println(ipToInt("127.0.0.1")); // Вывод: 2130706433
        System.out.println(intToIp(2130706433)); // Вывод: 127.0.0.1

        System.out.println(ipToInt("0.0.0.255"));  // Вывод: 255
        System.out.println(intToIp(255));          // Вывод: 0.0.0.255
    }
}

