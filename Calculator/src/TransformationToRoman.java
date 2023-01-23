public class TransformationToRoman {

    public static String transformationToRoman(int numberArabic ){
        RomanNumber romanNumber = null;
        for (RomanNumber rn : RomanNumber.values()) {
            if (numberArabic == rn.getArabicNumbers())
                romanNumber = rn;

    }
        return String.valueOf(romanNumber);

    }
}
