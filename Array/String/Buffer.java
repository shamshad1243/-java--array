package String;

public class Buffer {
    public static void main(String[] arge )
   // create the string buffer objects
    {
 StringBuilder sb= new StringBuilder(" hello");
 //Append text
        sb.append(" world");
        System.out.println(" After Append :" + sb ); // hello world
//Insert text
        sb.insert(6,",");
        System.out.println("After Insert:" + sb);   //hello,world
 //Replace text
        sb.replace (7,13,"java");
        System.out.println("After Replace :" + sb);  //hello,java
 //delete text
        sb.delete(6,7);
        System.out.println("After Delete "); // hello java
 //Reverse  the string
        sb.reverse();
        System.out.println("After Reverse : " + sb);
        // avajolleh


    }
}
