public class Stringlength{
    public static void main(String[] args){
        String str = new String("Programming");//Creates new string object in Heap memory
        String str1 = "Java";//String Literal stored in string pool
        System.out.println("The length of str: "+(str.length()));
        System.out.println("The length of str1: "+(str1.length()));

    }
}