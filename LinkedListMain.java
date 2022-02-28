import java.util.*;

public class LinkedListMain {
    static void addAndSort(LinkedList<Integer> llist, int value){
        llist.add(value);
        llist.sort(null);
    }
    static void pickAndSwap(LinkedList<Integer> Llist, int in1, int in2){
        int val1;
        int val2;
        val1 = Llist.get(in1);
        val2 = Llist.get(in2);
        Llist.set(in1, val2);
        Llist.set(in2, val1);
    
    }
    static int checkValue() {
        LinkedList<Integer> llist = new LinkedList<Integer>();
        Random rand = new Random();
        for (int i=0;i<500;i++){
            llist.add(rand.nextInt(1000,9999));
        }
        int toFind = rand.nextInt(1000,9999);
        if(llist.indexOf(toFind)>=0){
        System.out.println("Finding index of: "+ toFind);
        return llist.indexOf(toFind);
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args){
        LinkedList<Integer> llist = new LinkedList<Integer>();
        for(int i=1;i<12;i+=2){
            llist.add(i);
        }
        System.out.print("Original LinkedList: " + llist + "\n");
        System.out.print("Please enter integer value: ");
        try (Scanner scan = new Scanner(System.in)) {
            int value = scan.nextInt();
            addAndSort(llist, value);
        }
        System.out.print("Sorted LinkedList: " + llist + "\n");
            int in1 = 1;
            int in2 = 5;
            pickAndSwap(llist, in1, in2);

            System.out.print("\n" + "Swapped LinkedList: " + llist + "\n");


        System.out.print("\n" + "Random LinkedList Index: " + checkValue() + "\n");
        
    }
}
