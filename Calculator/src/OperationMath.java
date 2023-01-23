public class OperationMath {


    public static int mathOperation (String sign, int a, int b ){
        int answer = 0;
        switch (sign){
            case "+"  :
                answer = a + b;
                break;

            case "-"  :
                answer = a - b;
                break;

            case "/"  :
                answer = a / b ;
                break;

            case "*"  :
                answer = a * b;


        }
        return answer;
    }
}
