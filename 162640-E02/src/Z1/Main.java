package Z1;

import java.time.LocalTime;

import static Z1.ArrayUtil.jestPalindromem;

public class Main {
    public static void main(String[] args) {

        Integer[] inty = new Integer[4];
        inty[0] = 1;
        inty[1] = 2;
        inty[2] = 2;
        inty[3] = 1;

        System.out.println(jestPalindromem(inty));


        Integer[] inty2 = new Integer[4];
        inty2[0] = 3;
        inty2[1] = 2;
        inty2[2] = 2;
        inty2[3] = 1;

        System.out.println(jestPalindromem(inty2));

        LocalTime[] time1 = new LocalTime[4];

        time1[0] = LocalTime.of(9, 2);
        time1[1] = LocalTime.of(10, 2);
        time1[2] = LocalTime.of(10,2);
        time1[3] = LocalTime.of(9,2);

        System.out.println(jestPalindromem(time1));

        LocalTime[] time2 = new LocalTime[4];

        time2[0] = LocalTime.of(21, 2);
        time2[1] = LocalTime.of(11, 2);
        time2[2] = LocalTime.of(10,2);
        time2[3] = LocalTime.of(12,2);

        System.out.println(jestPalindromem(time2));
    }
}

