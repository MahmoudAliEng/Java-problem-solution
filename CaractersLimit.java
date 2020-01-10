
/**
 * Given an integer K and a text T
 * we want only take the first K caracters from T 
 * without considering spaces between words and 
 * without cutting a word in the middle.
 * 
 * ex: T = "Let me play this game", if K = 10 ==> we should return "Let me play"
 * 
 * @author Sid Ali MAHMOUDI
 * @version 2.0.beta
 * 
 */

public class CaractersLimit{
    
    /**
     * 
     * @param T the input text 
     * @param K the caracters limit
     * @return the new text containing just K caracters 
     *         (without counting spaces and without cutting words in the middle)
     */ 
    public String caractersLimit(String T, int K) {
        // split the string to remove the spaces and keep only the words
        String[] words = T.split(" ");
        int wordsIndex = 0;
        
        // loop until we attain the K limit, or we pass all the words of the text
        while ( wordsIndex < words.length && ( K - words[wordsIndex].length())>= 0 ){
            // substructing the number of caracters of the current word
            K -= words[wordsIndex].length();
            // move to the next word
            wordsIndex++;            
        }
        // in case that K is bigger than the caracters in the text
        if (wordsIndex == words.length) return T;
        
        String newText = "";
        // rebuilding the new T from the splited one
        for (int i = 0; i < wordsIndex; i++)
            newText += words[i] + " ";

        //remove the space from the final position before returning the string
        return newText.substring(0, newText.length() -1);
    }

    /**
     * The main function
     * @param args
     */
    public static void main(String[] args) {

        CaractersLimit cl = new CaractersLimit();
        // returns : "Let me play"
        System.out.println(cl.caractersLimit("Let me play this game", 10));
        // returns : "Let me play this"
        System.out.println(cl.caractersLimit("Let me play this game", 16));
        // returns : "Let me play this game"
        System.out.println(cl.caractersLimit("Let me play this game", 17));
    }
}
