package timeformatter;

import java.util.LinkedList;
import java.util.Queue;

public class TimeFormatter {

    public static void main(String[] args) {
        int duration = 3662;
        String formattedDuration = formatDuration(duration);
    }

    public static String formatDuration(int seconds) {
        StringBuilder stringBuilder = new StringBuilder();
        int oneMinute = 60;
        int oneHour = 60 * oneMinute;
        int oneDay = 24 * oneHour;
        int oneYear = 365 * oneDay;

        //check if input number is 0 or negative
        if (seconds == 0) {
            stringBuilder.append("now");
        } else if (seconds < 0) {
            stringBuilder.append("invalid duration!");
        } else {
            Queue<String> queue = new LinkedList<>();

            String result = "";
            int year = seconds / oneYear;
            if (year == 1) {
                queue.add(year + " year");
            } else if (year > 1) {
                queue.add(year + " years");
            }
            seconds = seconds - year * oneYear;

            int day = seconds / oneDay;
            if (day == 1) {
                queue.add(day + " day");
            } else if (day > 1) {
                queue.add(day + " days");
            }
            seconds = seconds - day * oneDay;

            int hour = seconds / oneHour;
            if (hour == 1) {
                queue.add(hour + " hour");
            } else if (hour > 1) {
                queue.add(hour + " hours");
            }
            seconds = seconds - hour * oneHour;

            int minute = seconds / oneMinute;
            if (minute == 1) {
                queue.add(minute + " minute");
            } else if (minute > 1) {
                queue.add(minute + " minutes");
            }
            seconds = seconds - minute * oneMinute;

            if (seconds == 1) {
                queue.add(seconds + " second");
            } else if (seconds > 1) {
                queue.add(seconds + " seconds");
            }

            while (!queue.isEmpty()) {
                String tmp = queue.poll();
                stringBuilder.append(tmp);
                if (queue.size() > 1) {
                    stringBuilder.append(", ");
                } else if (queue.size() == 1) {
                    stringBuilder.append(" and ");
                }
            }

        }
        System.out.println(stringBuilder.toString());
        return stringBuilder.toString();

    }

}
