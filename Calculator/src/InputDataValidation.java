public class InputDataValidation {


    public static void inputDataValidation(int a, int b) throws Exception {
        if ( a > 10 || a < 0 || b > 10 || b <0){
            throw new Exception();
        }

    }
}
