// Roan Silver      Created: January 23rd 2023        Last Edits: January 26th, 2023
// Collaborator: https://www.tutorialspoint.com/java/java_string_hashcode.htm
public class HashTables {

    // Instance Data

    private int HashTableLength;
    private String[] array;

    // Constructors

    public HashTables(int capacity){
        array = new String[capacity];
        HashTableLength = capacity;
    }

    // Methods

    public boolean put(String key, String value){
        int hashValue = hashCode(key);
        array[hashValue] = value;
        return true;
    }

    public String get(String key){
        int hashValue = hashCode(key);
        return array[hashValue];
    }

    // s[0]*31^(n - 1) + s[1]*31^(n - 2) + ... + s[n - 1]
    // From: tutorialspoint.com
    private int hashCode(String key){
        int hashTotal = 0;
        int hashLoop;
        int loopNumber = 0;
        for (int i = 0; i < key.length(); i++){
            loopNumber++;
            char c = key.charAt(i);
            int k = c;
            hashLoop = k * 31^(key.length() - loopNumber);
            hashTotal += hashLoop;
        } return hashTotal % array.length;
    }

    // My own PERSONAL adaptation of a HashCode Function
    private int customHashCode(String key){
        int hashTotal = 0;
        int hashLoop;
        int loopNumber = 0;
        if (key.length() == 1){
            char c = key.charAt(0);
            int k = c;
            hashTotal = c * 31 ^ c;
        } else{
            for (int i = 0; i < key.length() - 1; i++) {
                loopNumber++;
                char c = key.charAt(i);
                char c2 = key.charAt(i + 1);
                int k = c;
                hashLoop = c * c2 ^ c;
                hashTotal += hashLoop;
            }
        } return hashTotal % array.length;
    }
}
