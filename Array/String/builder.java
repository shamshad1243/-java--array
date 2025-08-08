package String;

public class builder {
    public static void main(String[] arge){
        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");
        // Append text
                 sb.append(" World");
                 System.out.println("After append: " + sb); // Hello World
        // Insert text
                sb.insert(5, ",");
                System.out.println("After insert: " + sb); // Hello, World
        // Replace text
                sb.replace(6, 11, "Java");
                System.out.println("After replace: " + sb); // Hello, Java
        // Delete text
                sb.delete(5, 6);
                System.out.println("After delete: " + sb); // Hello Java
        // Reverse the string
                sb.reverse();
                System.out.println("After reverse: " + sb); // avaJ olleH
            }
        }
