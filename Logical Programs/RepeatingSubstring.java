import java.util.*;


public class RepeatingSubstring {
    public static char upperAndLower(char ch) {
        if (ch >= 65 && ch <= 90)
            return (char)(ch + 32);
        return ch;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String s = sc.nextLine();

        int size = s.length();
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (upperAndLower(s.charAt(i)) == upperAndLower(s.charAt(j))) {
                    int len = 0, k = i, l = j;
                    while (k < j && l < size && upperAndLower(s.charAt(k)) == upperAndLower(s.charAt(l))) {
                        len++;
                        k++;
                        l++;
                    }
                    if (len >= 2) {
                        String str="";
                        for (int m = i; m < i + len; m++)
                            str+=s.charAt(m);
                            list.add(str);
                        i = i + len - 1;
                        
                    }
                }
            }
        }
        if (list.size()==0)
            System.out.println("none");
        else{
            System.out.println(list);
        }
        sc.close();
    }
}