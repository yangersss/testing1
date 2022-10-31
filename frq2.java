public class frq2{
    public static void main (String[] args){
        System.out.println(scramble("abc"));
        
    }

    public static String scramble (String s){
        for (int i = 0; i < s.length - 1; i++){
            String first = s.substring(i);
            String second = s.substring(i + 1);
            if (first.equals("A") && !(second.equals("A"))){
                s[i] = second;
                s[i + 1] = first;
            }
    }
}
}