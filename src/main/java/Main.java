public class Main {
    public static void main(String[] args) {

        Utils.checkDayAndMonthIsHoliday(1, 1);
        Utils.checkDayAndMonthIsHoliday(7, 1);
        Utils.checkDayAndMonthIsHoliday(31, 1);
        Utils.checkDayAndMonthIsHoliday(32, 1);
        Utils.checkDayAndMonthIsHoliday(1, 2);
        Utils.checkDayAndMonthIsHoliday(29, 2);
        Utils.checkDayAndMonthIsHoliday(30, 2);
        Utils.checkDayAndMonthIsHoliday(8, 3);
        Utils.checkDayAndMonthIsHoliday(31, 3);
        Utils.checkDayAndMonthIsHoliday(32, 3);
        Utils.checkDayAndMonthIsHoliday(7, 4);
        Utils.checkDayAndMonthIsHoliday(31, 4);
        Utils.checkDayAndMonthIsHoliday(1,5);
        Utils.checkDayAndMonthIsHoliday(9,5);
        Utils.checkDayAndMonthIsHoliday(31,5);
        Utils.checkDayAndMonthIsHoliday(32,5);
        Utils.checkDayAndMonthIsHoliday(30,6);
        Utils.checkDayAndMonthIsHoliday(31,6);
        Utils.checkDayAndMonthIsHoliday(3,7);
        Utils.checkDayAndMonthIsHoliday(31,7);
        Utils.checkDayAndMonthIsHoliday(32,7);
        Utils.checkDayAndMonthIsHoliday(31,8);
        Utils.checkDayAndMonthIsHoliday(32,8);
        Utils.checkDayAndMonthIsHoliday(30,9);
        Utils.checkDayAndMonthIsHoliday(31,9);
        Utils.checkDayAndMonthIsHoliday(31,10);
        Utils.checkDayAndMonthIsHoliday(32,10);
        Utils.checkDayAndMonthIsHoliday(7,11);
        Utils.checkDayAndMonthIsHoliday(30,11);
        Utils.checkDayAndMonthIsHoliday(31,11);
        Utils.checkDayAndMonthIsHoliday(25,12);
        Utils.checkDayAndMonthIsHoliday(31,12);
        Utils.checkDayAndMonthIsHoliday(32,12);
        Utils.checkDayAndMonthIsHoliday(1,0);
        Utils.checkDayAndMonthIsHoliday(1,13);
        Utils.checkDayAndMonthIsHoliday(0,1);
    }
}
