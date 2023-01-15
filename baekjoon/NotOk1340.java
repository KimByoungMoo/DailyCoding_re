package src.baekjoon;

import java.util.Scanner;

public class NotOk1340 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] time = input.nextLine().split(" ");

        int year = Integer.parseInt(time[2]);
        boolean yearCheck = false;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            yearCheck = true;
        }

        String month = time[0];
        String[] monArr = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int mon = 0;
        for (int i = 0; i < monArr.length; i++) {
            if (monArr[i].equals(month)) {
                mon = i + 1;
            }
        }

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int day = Integer.parseInt(time[1].split(",")[0]);
        int dayCount = 0;
        for (int i = 0; i < mon-1; i++) {
            if (yearCheck && i == 1) {
                dayCount += 29;
                continue;
            }
            dayCount += days[i];
        }
        dayCount += day;

        int hour = 60 * Integer.parseInt(time[3].split(":")[0]);
        int min = Integer.parseInt(time[3].split(":")[1]);
        int timeHM = hour + min;

        int timeToHour = 60 * 24 * (dayCount -1) + timeHM;

        int totalYear = 0;
        if (yearCheck) {
            totalYear = 366 * 60 * 24;
        } else {
            totalYear = 365 * 60 * 24;
        }

        System.out.println(((double) timeToHour * 100 / (double) totalYear));

    }
}
