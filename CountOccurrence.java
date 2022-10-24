import java.util.HashMap;
import java.util.Scanner;

public class CountOccurrence {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        HashMap<Integer, Integer> map=new HashMap<>();

        System.out.print("How many number you wanna enter: ");
        int size=sc.nextInt();

        for(int i=1; i<=size; i++){
            System.out.print("Enter number: ");
            int n=sc.nextInt();

            map.putIfAbsent(n, 0);
            map.put(n, map.get(n)+1);
        }

        var keyIt=map.keySet().iterator();
        var valueIt=map.values().iterator();

        while (keyIt.hasNext()){
            System.out.println(keyIt.next() + " occur " + valueIt.next() + " times.");
        }
    }
}