/*
 * Complete the function below.
 */

    static String decrypt(String encrypted_message) {
                
        int[] key = new int[]{8,2,5,1,2,2,0};
        StringBuffer decryptMessage = new StringBuffer();
        int i = 0;
        for(char c: encrypted_message.toCharArray()){  
            if(Character.isLetter(c)){
                if(Character.isUpperCase(c))
                    decryptMessage.append(Character.toString((char) (((c - 'A' + (26-key[i])) % 26) + 'A')));
                else 
                    decryptMessage.append(Character.toString((char) (((c - 'a' + (26-key[i])) % 26) + 'a')));
                i++;
                if(i == key.length)
                    i = 0;
            }
            else{
                decryptMessage.append(c);
            }
        }
        
        return decryptMessage.toString();

    }

