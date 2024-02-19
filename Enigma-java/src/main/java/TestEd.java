import java.util.ArrayList;
import java.util.List;

public class TestEd {

    public static String Ceaser(String message, int incrementNumbers){
        
        String s = "";
        int len = message.length();
        
        for(int x = 0; x < len; x++){
            
            char c = (char)(message.charAt(x) + incrementNumbers);
            if (c > 'z')
                s += (char)(message.charAt(x) - (26-incrementNumbers));
            else
                s += (char)(message.charAt(x) + incrementNumbers);
            incrementNumbers++;
        }
    

        
        // TODO - Implement the Encrypt method
        // Steps in brief
        // 1. Apply the CAESAR shift using the increment number
        // 2. For each rotor in the list rotors
        //  2.1 Translate the message using the rotor
        // 3. Return the encrypted string

        return s;
    }

    //method to return the indexlist of a given String within the alphabet
    public static int[] getIndexList(String s){
        int[] indexList = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            indexList[i] = s.charAt(i) - 'A';
        }
        return indexList;
    }

    public static String RotorShift(String message, List<String> rotors){
        
        String initial = Ceaser(message, 4);
        String s = "";
        String temp = "";
        int len = initial.length();
        int[] indexList = getIndexList(initial);

        for(int i = 0; i < rotors.size()-1; i++){
            System.out.println("Rotor: " + rotors.get(i));
            for(int j = 0; j < len; j++){
                s += rotors.get(i).charAt(indexList[j]);
            }
            System.out.println("s: " + s);
            temp = s;
            s = "";
            indexList = getIndexList(temp);
        }
        return temp;
    }

   

    public static void main(String []args){

        // System.out.println(Encrypt("ABCD", 4));  //prints def
        // System.out.println(Encrypt("ABCD",1));  //prints abc

        // System.out.println(Arrays.toString(getIndexList("EGIK")));

        List<String> rotors = new ArrayList<String>();
        rotors.add("BDFHJLCPRTXVZNYEIWGAKMUSQO");
        rotors.add("AJDKSIRUXBLHWTMCQGZNPYFVOE");
        rotors.add("EKMFLGDQVZNTOWYHXUSPAIBRCJ");

        System.out.println(RotorShift("ABCD", rotors)); 

        Ceaser("ABCD",4 );
        
        


    }
}
