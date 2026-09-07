package DSA;

public class stringBuilder {
    public static void main(String[] args) {
        // 1. Create a StringBuilder with an initial string
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Initial string: " + sb);

        // 2. Append text to the end
        sb.append(" World"); 
        System.out.println("After append: " + sb); // Output: Hello World

        // 3. Insert text at a specific index
        sb.insert(6, "Beautiful "); 
        System.out.println("After insert: " + sb); // Output: Hello Beautiful World

        // 4. Replace a portion of the text (start index, end index, new text)
        sb.replace(6, 15, "Awesome"); 
        System.out.println("After replace: " + sb); // Output: Hello Awesome World

        // 5. Delete a portion of the text (start index, end index)
        sb.delete(5, 13); 
        System.out.println("After delete: " + sb); // Output: Hello World

        // 6. Reverse the characters
        sb.reverse();
        System.out.println("After reverse: " + sb); // Output: dlroW olleH

        // Reverse back to normal
        sb.reverse();

        // 7. Get length and current capacity
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity()); // Internal buffer size

        // 8. Convert StringBuilder back to a standard String
        String finalResult = sb.toString();
        System.out.println("Final String: " + finalResult);
    }
}