import java.util.*;
public class HashMapList {
    static void addAndSortHashMap(HashMap<Integer,Integer>hmlist, int value){
        hmlist.put(hmlist.size(),value);
        List<Integer> l = new ArrayList<Integer>(hmlist.values());
        l.sort(null);
        for(int i=1;i<l.size();i++){
            hmlist.put(i,l.get(i));
        }
    }
    static void pickAndSwapHM(HashMap<Integer,Integer> hmlist, int in1, int in2){
        int val1;
        int val2;
        val1 = hmlist.get(in1);
        val2 = hmlist.get(in2);
        hmlist.put(in1,val2);
        hmlist.put(in2,val1);
    
    }
    public static void checkValue(HashMap<Integer,Integer>hmCheck,int toFind) {
        hmCheck = new HashMap<Integer,Integer>();
        Random rand = new Random();
        for (int i=0;i<500;i++){
            hmCheck.put(i,rand.nextInt(1000,9999));
        }
        if(hmCheck.containsValue(toFind)){
        System.out.println("Finding index of: "+ hmCheck.get(toFind));
        
        }
        else{
            System.out.println("Value does not exist.");
        }
        
    }
    public static void main(String[] args){
        HashMap<Integer, Integer> hashmapint = new HashMap<Integer, Integer>();
        hashmapint.put(0,1);
        hashmapint.put(1,3);
        hashmapint.put(2,5);
        hashmapint.put(3,7);
        hashmapint.put(4,9);
        hashmapint.put(5,11);
        System.out.println("Original HashMap: " + hashmapint + "\n");

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter integer value: ");
        int value = scan.nextInt();
        addAndSortHashMap(hashmapint, value);
        System.out.println("Sorted HashMap: " + hashmapint + "\n");
        
        int in1 = 1;
        int in2 = 5;
        pickAndSwapHM(hashmapint, in1, in2);
        System.out.print("Swapped HashMap: " + hashmapint + "\n");
        Random rand = new Random();
        HashMap<Integer,Integer>checkValueHM= new HashMap<>();
        int toFindHM=rand.nextInt(1000,9999);
        checkValue(checkValueHM,toFindHM);
    }

}
