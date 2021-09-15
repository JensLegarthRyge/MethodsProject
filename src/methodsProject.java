import java.util.Scanner;

public class methodsProject {
    //Task 1
    /*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input three numbers: ");

        double firstValue = scanner.nextDouble();
        double secondValue = scanner.nextDouble();
        double thirdValue = scanner.nextDouble();

        String smallestNumberResult = ("The smallest number between "+firstValue+", "+secondValue+" and "+thirdValue+
                " is: "+smallestValue(firstValue,secondValue,thirdValue));
        System.out.println(smallestNumberResult);

    }
    public static double smallestValue(double firstValue, double secondValue, double thirdValue) {
        if (firstValue<secondValue&&secondValue<thirdValue){
        return firstValue;
        } else if (secondValue<firstValue&&secondValue<thirdValue){
            return secondValue;
        } else if (thirdValue<firstValue&&thirdValue<secondValue){
            return thirdValue;
        }
        return Integer.MIN_VALUE;
    }
     */

    //Task 2
    /*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a value: ");
        double userInput = scanner.nextInt();
        System.out.println(positiveNegativeOrZero(userInput));

    }
    public static String positiveNegativeOrZero (double value){
        if (value<0){
            return "Value input by user is negative";
        } else if (value>0){
            return "Value input by user is positive";
        } else if (value==0){
            return "Value input by user equals zero";
        } else
        return "bugger";
    }
     */

    //Task 3
    /*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a string of text: ");
        String userInput = scanner.nextLine();

        System.out.println(getMiddleChar(userInput));
    }
    public static String getMiddleChar(String userInput) {
        String userInputWithoutSpaces = userInput.replace(" ","");
        int stringLength = userInputWithoutSpaces.length();
        int modulusStringLength = stringLength%2;

        //EvenString
        if (modulusStringLength == 0) {
            String middleCharsForEvenStringExplanation = "Your string holds an even amount of characters, a definitive " +
                    "middle character could not be found, the closest two are '";
            String middleCharsForEvenString = userInputWithoutSpaces.charAt((stringLength-1)/2)+"' and '"+userInputWithoutSpaces.charAt((stringLength + 1) / 2)+"'";
            return middleCharsForEvenStringExplanation+middleCharsForEvenString;

        } else if (modulusStringLength>0){
            char middleChar = userInputWithoutSpaces.charAt(stringLength/2);
            String middleCharForUnevenString = "The middle character is "+middleChar;
            return middleCharForUnevenString;
        }
        return "bam";

    }
     */

    //Task 4
    /*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide values for a, b and c: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("The area of the triangle provided is: "+getPerimeterTriangle(a,b,c));

    }
    public static double getPerimeterTriangle(double a, double b, double c){
        double s = (a+b+c)/2;
        double A = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return A;
    }
     */

    //Task 5
    public static void main(String[] args) {

    }
    public static boolean passwordVerifier (String userInput){

    }
}
