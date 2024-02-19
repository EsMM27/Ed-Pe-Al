/// Filename: Enigma.java
// / Author: Dr. Shane Wilson
/// Description: Add a useful description of this file

import java.util.List;

public final class Enigma {

    public static String Encrypt(String message, List<String> rotors, int incrementNumbers){
        
        String initial = Ceaser(message.toUpperCase(), incrementNumbers);
        String s = "";
        String temp = "";
        int len = initial.length();
        int[] indexList = getIndexList(initial);

        for(int i = 0; i < rotors.size()-1; i++){
            for(int j = 0; j < len; j++){
                s += rotors.get(i).charAt(indexList[j]);
            }
            temp = s;
            s = "";
            indexList = getIndexList(temp);
        }
        return temp;
    }

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

    public static int[] getIndexList(String s){
        int[] indexList = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            int index = s.charAt(i) - 'A';
            if (index < 0) {
                index += 26;
            } else if (index >= 26) {
                index -= 26;
            }
            indexList[i] = index;
        }
        return indexList;
    }

    // public static String Encrypt(String message, int incrementNumber,List<String> rotors ){
        
        
    //     // TODO - Implement the Encrypt method
    //     // Steps in brief
    //     // 1. Apply the CAESAR shift using the increment number
    //     // 2. For each rotor in the list rotors
    //     //  2.1 Translate the message using the rotor
    //     // 3. Return the encrypted string

    //     return "Implement the encrypt method";
    // }


    public static String Decrypt(String message, int incrementNumber, List<String> rotors)
    {
        // TODO - Implement the Decrypt method

        // Steps in brief
        // 1. For each rotor in the list rotors, starting with the last rotor
        //  1.1 Translate the message using the rotor
        // 2. Apply the CAESAR shift
        // 3. Return the decrypted string

        return "Implement the decrypt";

    }
}
