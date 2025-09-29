import java.util.ArrayList;

public class ListPractice {


  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    ArrayList<String> myStrings = new ArrayList<>();

    // Add 3 elements to the list (OK to do one-by-one)
    myStrings.add("String #1");
    myStrings.add("String #2");
    myStrings.add("String #3");

    // Print the element at index 1
    System.out.println(myStrings.get(1));

    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)
    myStrings.set(1, "New String #2");

    // Insert a new element at index 0 (the length of the list will change)
    myStrings.addFirst("New First Element!");

    // Check whether the list contains a certain string


    // Iterate over the list using a traditional for-loop.
    // Print each index and value on a separate line

    // Sort the list using the Collections library

    // Iterate over the list using a for-each loop
    // Print each value on a second line

    /*
     * Usage tip!
     * 
     * Use a traditional for-loop when you need to use the index or you need to iterate in an
     * unconventional order (e.g. backwards)
     * 
     * Otherwise, if you're iterating the in the conventional order and don't need the
     * index values a for-each loop is cleaner.
     */
  }
}