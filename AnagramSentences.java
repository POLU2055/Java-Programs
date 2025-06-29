import java.util.Arrays;
import java.util.Scanner;
public class AnagramSentences {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.err.println("Enter first string : ");
        String text1 = sc.nextLine();
        System.err.println("Enter second string  : ");
        String text2 = sc.nextLine();
        text1=text1.replaceAll("\\s","").toLowerCase(); //  to remove all spaces
        text2=text2.replaceAll("\\s","").toLowerCase();  // to remove all spaces
        
        
        if(text1.length() == text2.length()){
            char[] arr1 = text1.toCharArray();
            char[] arr2 = text2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2))
        System.err.println("The given strings are anagram.");
        else
        System.err.println("The given strings are Not anagram");
        }
        else
        System.err.println("The given Strings are Not anagram");
        sc.close();
    }
}

//PYTHON ANAGRAM CODE
def is_anagram(s,d):
    s=s.lower()
    d=d.lower()
    if sorted(s)==sorted(d):
        print("The two strings are anagrams")
    else:
        print("The two strings are not anagrams")
s=input()
d=input()
is_anagram(s,d)
