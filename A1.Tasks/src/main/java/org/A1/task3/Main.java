package org.A1.task3;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1. Прочитать файл logins.csv с локальной файловой системы
        String filePath = "C:\\Users\\bodna\\IdeaProjects\\lab(AIPRP)\\A1.Tasks\\src\\main\\java\\org\\A1\\task3\\logins.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            System.out.println("\nLogins:\n");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 2. Прочитать файл postingsss.csv с локальной файловой системы (строки со значениями в поле Mat. Doc.)
        System.out.println("\nPostings:\n");
        String csvFile = "C:\\Users\\bodna\\IdeaProjects\\lab(AIPRP)\\A1.Tasks\\src\\main\\java\\org\\A1\\task3\\postinggsss.csv";
        String line = "";
        String cvsSplitBy = ";";
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] posting = line.split(cvsSplitBy);
                String matDoc = posting[0];
                String item = posting[1];
                String docDate = posting[2];
                String pstngDate = posting[3];
                String matDesc = posting[4];
                String quantity = posting[5];
                String bun = posting[6];
                String amountLc = posting[7];
                String crcy = posting[8];
                String userName = posting[9];

                System.out.println(matDoc);
                // Вывод всех значений posting.scv
//               System.out.println(matDoc + item +docDate + pstngDate + matDesc + quantity + bun  + amountLc + crcy + userName);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}



