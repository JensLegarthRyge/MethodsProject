public class holder {
    public static void largestValue ( int firstValue, int secondValue, int thirdValue){
        if (firstValue > secondValue) {
            if (secondValue > thirdValue) {
                System.out.println("The biggest value is: " + firstValue);
            }
        } else if (secondValue > firstValue) {
            if (secondValue > thirdValue) {
                System.out.println("The biggest value is: " + secondValue);
            }
        } else if (thirdValue > firstValue) {
            if (thirdValue > secondValue) {
                System.out.println("The biggest value is: " + thirdValue);
            }
        }
    }
}
