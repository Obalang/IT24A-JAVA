
package act2vowel;
import javax.swing.JOptionPane;
public class    Act2Vowel {
    public static void main(String[] args)
    { 
      String input =  JOptionPane.showInputDialog(null, "Enter a string: ");
        int count = 0;
        for(int i = 0; i < input.length(); i++)
        {
            if(isVowel(input.charAt(i)))
            {
                count++;
            }
        }
        
      JOptionPane.showMessageDialog(null,"Number of vowels: " + count);    
    }
        public static boolean isVowel(char c) {
    String vowels = "aeiouAEIOU";
    return vowels.indexOf(c) != -1;


    }
}