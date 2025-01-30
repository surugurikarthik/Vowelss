

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print(" enter string = ");
            String k = sc.nextLine().toLowerCase();
            int VowelsCount = 0;
            for(char c : k.toCharArray()){
                if(c =='a'||c =='e'||c =='i'||c =='o'||c =='u') {
                    VowelsCount++;
                }
                System.out.println(" Number of vowels = " + VowelsCount);
            }
        }
    }
    

