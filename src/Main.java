import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>random=new ArrayList<>();
        ArrayList<Integer>eveninteger=new ArrayList<>();
        ArrayList<Integer>odd=new ArrayList<>();
        Random rm=new Random();
        for (int i = 0; i <50; i++) {
            int randomint = rm.nextInt(1, 100);
            random.add(randomint);
            if (randomint % 2 == 0) {
                eveninteger.add(randomint);
            }else if(randomint%2!=0){
                odd.add(randomint);
            }
        }
        System.out.println("just random integers: "+random);
        System.out.println("even numbers: "+eveninteger);
        System.out.println("odd numbers: "+odd);







        }
        }



