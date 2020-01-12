/**
 * Sevral methods
 * 
 * @author Sid Ali MAHMOUDI
 * @version 1.0.beta
 */

 
public class SevralTasks{

    // These two integers will be just used in the swap function to see the changes (avoid passing variable by reference)
    // Give them any value you want
    private Integer a = 20;
    private Integer b = 10;

    public Integer setA(Integer value){
        this.a = value;
        return this.a;
    }

    public Integer setB(Integer value){
        this.b = value;
        return this.b;
    }

    /**
     * This function do the swapping between two numbers without using a third variable
     * @param a the first integer
     * @param b the second integer
     */
    public void swapTwo(Integer a, Integer b){
        // store the difference between the 2 numbers in a
        a = b - a ;
        // if b was bigger than a, the value of a is positive
        // else the minus turn it a plus
        b = b - a ;
        // same thing for the value of a
        a = b + a ;
        setA(a);
        setB(b);
    }

    /**
     * This function answer wether a given string text ends with certain string end
     * with two ways: using the built in function and my own implementation 
     * @param text the string to verify its end
     * @param end the end we search in the text string
     * @return a boolean value tells you wether the text string ends with end ot not
     */

    public boolean endsWithString(String text, String end){
        //System.out.println("The end of the text string: \"" +text.substring(text.length() - end.length(), text.length()) + "\"");
        // my own implementation
        return (text.substring(text.length() - end.length(), text.length())).equals(end);
        // the built in function is commented
        //return text.endsWith(end);
    }
    public static void main(String[] args) {
        SevralTasks cai = new SevralTasks();
        boolean t=  cai.endsWithString("Test", "s");
        System.out.println("\nThe \"Test\" string ends with \"s\"? " + t);
        t=  cai.endsWithString("Test", "st");
        System.out.println("\nThe \"Test\" string ends with \"st\"? " + t);
        System.out.println("\nBefore swapping => a: " + cai.a + " b: "+ cai.b);
        cai.swapTwo(cai.a, cai.b);
        System.out.println("\nAfter swapping => a: " + cai.a + " b: "+ cai.b);
    }
}
