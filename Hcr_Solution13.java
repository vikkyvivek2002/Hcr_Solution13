import java.util.Scanner;

public class Hcr_Solution13
 {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
       
        
        String words = s.substring(0,k); 
        
        smallest = words; 
        largest = words; 
        
        for(int i = 1; i <= (s.length())-k; i++ )
        {
            words = s.substring(i,(i+k)); 
            if(words.compareTo(smallest) < 0 ) 
            smallest = words; 
            if(words.compareTo(largest) > 0 )
            largest = words; 
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}