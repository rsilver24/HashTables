// Roan Silver      Created: January 24th 2023        Last Edits: January 26th, 2023
// Collaborator: https://www.tutorialspoint.com/java/java_string_hashcode.htm
public class HashTablesTestDriver {
    public static void main(String[] args) {

        HashTables table = new HashTables(15);

        /** Test to see if hashCode as a whole works.
         *
         * The algorithm that calculates a key into a hash code is demonstrated by this procedure:
         *
         * s[0]*31^(n - 1) + s[1]*31^(n - 2) + ... + s[n - 1]    —    (read more in the readMe file)
         *
         * To test whether or not this works, given these 6 key values, I should be able to put and get the same key to get the same
         * value that has been inputed below. These following keys are what I've decided to use:
         * "Hey!", "How are you?", "but like... I don't want to go >:(", "157382", "!@#$%^&*()", and "A".
         *
         * These following values are what I've decided to use:
         * "Hi!", "I'm doing alright", "but you HAVE to go!", "wow those sure are numbers", "I don't really understand but yeah!", and "B".
         *
         * Additionally I have noticed that there must be a minimum HashTable capacity of 15 in order to avoid overlap. Given how I've done the calculations,
         * this is an understandable result given 6 different keys. Overlap is pretty bound to happen with a small capacity. Making
         * a capacity far larger would most definetly make this code so much more effective.
         */

        table.put("Hey!", "Hi!");
        table.put("How are you?", "I'm doing alright");
        table.put("but like... I don't want to go >:(", "but you HAVE to go!");
        table.put("157382", "wow those sure are numbers");
        table.put("!@#$%^&*()", "i don't really understand but yeah!");
        table.put("A", "B");

        System.out.println(table.get("Hey!"));
        System.out.println(table.get("How are you?"));
        System.out.println(table.get("but like... I don't want to go >:("));
        System.out.println(table.get("157382"));
        System.out.println(table.get("!@#$%^&*()"));
        System.out.println((table.get("A")));
    }
}
