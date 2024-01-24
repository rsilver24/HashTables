import java.util.ArrayList;
import java.util.HashMap;
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
}
