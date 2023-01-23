import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter example in format: a + b ");
        System.out.println(calc(scanner.nextLine().toUpperCase()));



    }



    public static String calc (String input) throws Exception {
        String [] dataInArray = input.split(" ");
        int a = 0;
        int b = 0;
        int answer = 0;
        int answerInRoman = 0;




        try {
            a = Integer.valueOf(dataInArray[0]);
            b = Integer.valueOf(dataInArray[2]);
            InputDataValidation.inputDataValidation(a,b);
            answer  = OperationMath.mathOperation(dataInArray[1], a , b);
            return String.valueOf(answer);

        }
        catch (NumberFormatException e){
           a = RomanNumber.valueOf(dataInArray[0]).getArabicNumbers();
           b = RomanNumber.valueOf(dataInArray[2]).getArabicNumbers();
           InputDataValidation.inputDataValidation(a,b);

            if (OperationMath.mathOperation(dataInArray[1],a , b ) <= 0){
               throw new Exception();
            } else {
               answerInRoman = OperationMath.mathOperation(dataInArray[1],a , b);
           }


            return TransformationToRoman.transformationToRoman(answerInRoman);


        }











    }
}
