public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = "FizzBuzz";

    public static String callNumber(int number){
        if(number<10){
            return callNumberUnder10(number);
        }
        else{
            int du = number%10;
            int thuong = number/10;
            return callNumberUnder10(thuong)+" muoi "+ callNumberUnder10(du);
        }
    }

    private static String callNumberUnder10(int number) {
        switch (number){
            case 1:
                return "mot";
            case 2:
                return "hai";
            case 3:
                return "ba";
            case 4:
                return "bon";
            case 5:
                return "nam";
            case 6:
                return "sau";
            case 7:
                return "bay";
            case 8:
                return "tam";
            case 9:
                return "chin";
        }
        return null;
    }


    public static String checkFizzBuzz(int number) {
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        if (isFizz && isBuzz) {
            return FIZZ_BUZZ;
        } else {
            if (isBuzz) {
                return BUZZ;
            } else {
                if (isFizz) {
                    return FIZZ;
                }
                return callNumber(number);
            }

        }

    }
}
