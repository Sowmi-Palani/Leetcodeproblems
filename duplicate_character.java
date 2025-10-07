identifies all characters that appear more than once in the string

 i/p:  abcfgthhca
o/p:   ach


import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String str = sc.nextLine();
        Set<Character> set = new HashSet<>();
        for(char ch : str.toCharArray()){
            set.add(ch);
        }
        String s="";
        for(char ch : set){
            int count = 0 ;
            for(int i=0;i<str.length();i++){
                if(ch==str.charAt(i)){
                    count++;
                }
            }
            if(count>1){
                s+=ch;
            }
        }
        System.out.println(s);
    }
}
