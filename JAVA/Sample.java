import java.util.*;

class Sample {
    static String UncommonChars(String A, String B) {
        // code here
        // fioqruz
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();
        List<Character> result = new ArrayList<>();

        Set<Character> setA = new HashSet<>();
        Set<Character> setB = new HashSet<>();
        for (char character : a) {
            setA.add(character);
        }
        for (char character : b) {
            setB.add(character);
        }
        for (Character character : setB) {
            if(!setA.contains(character)){
                result.add(character);
            }
        }
        for (Character character : setA) {
            if(!setB.contains(character)){
                result.add(character);
            }
        }
        if(result.size()<1){
            return "-1";
        }
        result.sort(null);
        return result.stream().collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();

    }

    public static void main(String args[]) {
        String A = "geeksforgeeks";
        String B = "geeksquiz";
        System.out.println(UncommonChars(A, B));
    }
}