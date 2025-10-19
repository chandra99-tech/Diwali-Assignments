package day01;

public class LongestStringLength {

    public static void main(String[] args) {
        // Sample array of strings for demonstration
        String[] strings = {"hello", "world", "programming", "java"};
        
        try {
            int maxLength = findLongestStringLength(strings);
            System.out.println("Length of the longest string: " + maxLength);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int findLongestStringLength(String[] strings) {
        if (strings == null || strings.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }
        int maxLength = 0;
        for (String str : strings) {
            if (str != null) { // Handle null strings in the array
                maxLength = Math.max(maxLength, str.length());
            }
        }
        return maxLength;
    }
}