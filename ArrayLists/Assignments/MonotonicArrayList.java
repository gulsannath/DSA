import java.util.ArrayList;

public class MonotonicArrayList {

    public static boolean isMonotonic(ArrayList<Integer> list){
        boolean incr = true;
        boolean decr = true;

        for(int i=0;i<list.size()-1;i++){

            //Increament case fails
            if(list.get(i) > list.get(i+1)){
                incr = false;
            }

            //Decreament case fails
            if(list.get(i) < list.get(i+1)){
                decr = false;
            }
        }

        return incr || decr;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(4);

        System.out.println(isMonotonic(list));
    }
}
