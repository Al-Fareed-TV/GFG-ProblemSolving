/**
 * Problem1
 * returning the index of the string "s" if string "x" is present in "s"
 */
public class Problem1 {
    static int strstr(String s, String x)
    {
       // Your code here
       if (s.contains(x)) {
           return s.indexOf(x);
       }
       return -1;
    }
    public static void main(String[] args) {
        String str1 = "GeeksForGeeks";
        String str2 = "For";
        System.out.println(strstr(str1, str2));
    }
}