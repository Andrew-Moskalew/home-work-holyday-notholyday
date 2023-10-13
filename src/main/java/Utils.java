public class Utils {
    public static void checkDayAndMonthIsHoliday(int day, int month) {

        Print print = new Print();
        System.out.println("Число: " + day + " Месяц: " + month);

        if (month < 1 || month > 12) {
            print.monthNotExist();
        } else if ((day < 1) || (((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)) && day > 31)
                || ((month == 2) && day > 29) || ((month == 4) || (month == 6) || (month == 9) || (month == 11) && day > 30)) {
            print.dayNotExist();
        } else if ((month == 1 && day == 1) || (month == 1 && day == 7) || (month == 3 && day == 8) || (month == 5 && day == 1) ||
                (month == 5 && day == 9) || (month == 7 && day == 3) || (month == 11 && day == 7) || (month == 12 && day == 25)) {
            print.holyday();
        } else print.notHolyday();

        /*switch (month) {
            case 1:
                if ((day < 1) || (day > 31)) {
                    print.dayNotExist();
                } else if ((day == 1) || (day == 7)) {
                    print.holyday();
                } else print.notHolyday();
                break;
            case 2:
                if ((day < 1) || (day > 29)) {
                    print.dayNotExist();
                } else print.notHolyday();
                break;
            case 3:
                if ((day < 1) || (day > 31)) {
                    print.dayNotExist();
                } else if (day == 8) {
                    print.holyday();
                } else print.notHolyday();
                break;
            case 4:
                if ((day < 1) || (day > 30)) {
                    print.dayNotExist();
                } else print.notHolyday();
                break;
            case 5:
                if ((day < 1) || (day > 31)) {
                    print.dayNotExist();
                } else if ((day == 1) || (day == 9)) {
                    print.holyday();
                } else print.notHolyday();
                break;
            case 6:
                if ((day < 1) || (day > 30)) {
                    print.dayNotExist();
                } else print.notHolyday();
                break;
            case 7:
                if ((day < 1) || (day > 31)) {
                    print.dayNotExist();
                } else if (day == 3) {
                    print.holyday();
                } else print.notHolyday();
                break;
            case 8:
                if ((day < 1) || (day > 31)) {
                    print.dayNotExist();
                } else print.notHolyday();
                break;
            case 9:
                if ((day < 1) || (day > 30)) {
                    print.dayNotExist();
                } else print.notHolyday();
                break;
            case 10:
                if ((day < 1) || (day > 31)) {
                    print.dayNotExist();
                } else print.notHolyday();
                break;
            case 11:
                if ((day < 1) || (day > 30)) {
                    print.dayNotExist();
                } else if (day == 11) {
                    print.holyday();
                } else print.notHolyday();
                break;
            case 12:
                if ((day < 1) || (day > 31)) {
                    print.dayNotExist();
                } else if (day == 25) {
                    print.holyday();
                } else print.notHolyday();
                break;
            default:
                print.monthNotExist();
        }*/
    }
}
