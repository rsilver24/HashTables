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

    }

    private int hashCode(String key){

    }
}
