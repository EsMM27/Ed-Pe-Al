Enigma
Starter repository for the CP1 week 4 laboratory exercise

Challenge brief
During World War II, the Germans developed an Enigma machine to encrypt and decrypt their communications. The device used an electromechanical rotor mechanism that scrambled the 26 letters of the alphabet. The machine worked by scrambling each letter in a message e.g. ‘A’ by mapping it to another letter e.g., ‘K’. Typically, each message was encrypted several times using a series of electromagnetic rotors that mapped each alphabetic character to another pre-defined character, ‘A’ to ‘K’, ‘B’ to ‘Q’ and so forth.

Encryption
The outline process of encoding and decoding a message is as follows:

To encrypt the string "ABCD":

Step 1: apply CAESAR shift with the incrementing number (let us use 4 in this example)
"A" + (4+0) = "E"
"B" + (4+1) = "G"
"C" + (4+2) = "I"
"D" + (4+3) = "K"

"ABCD" becomes "EGIK"

Step 2: translate trough first rotor (let’s say "BDFHJLCPRTXVZNYEIWGAKMUSQO" here)
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
B D F H J L C P R T X V Z N Y E I W G A K M U S Q O

"EGIK" becomes "JCRX"

Step 3: translate trough second rotor (let’s say "AJDKSIRUXBLHWTMCQGZNPYFVOE" here)
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
A J D K S I R U X B L H W T M C Q G Z N P Y F V O E

"JCRX" becomes "BDGV"

Step 4: translate trough third rotor (let’s say "EKMFLGDQVZNTOWYHXUSPAIBRCJ" here)
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
E K M F L G D Q V Z N T O W Y H X U S P A I B R C J

"BDGV" becomes"KFDI"

So after those 4 steps "ABCD" is encrypted to "KFDI"

Decryption
Step 1: translate from third rotor (let’s say "EKMFLGDQVZNTOWYHXUSPAIBRCJ" here)
E K M F L G D Q V Z N T O W Y H X U S P A I B R C J
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z

"KFDI" becomes"BDGV"

Step 2: translate from second rotor (let’s say "AJDKSIRUXBLHWTMCQGZNPYFVOE" here)
A J D K S I R U X B L H W T M C Q G Z N P Y F V O E
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z

"BDGV" becomes "JCRX"

Step 3: translate from first rotor (let’s say "BDFHJLCPRTXVZNYEIWGAKMUSQO" here)
B D F H J L C P R T X V Z N Y E I W G A K M U S Q O
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z

"JCRX" becomes "EGIK"

Step 4: undo CAESAR with the incrementing number (let’s say 4 here)
"E" - (4+0) = "A"
"G" - (4+1) = "B"
"I" - (4+2) = "C"
"K" - (4+3) = "D"

"EGIK" becomes "ABCD"

So after those 4 decryption steps "KFDI" is decrypted to "ABCD"
