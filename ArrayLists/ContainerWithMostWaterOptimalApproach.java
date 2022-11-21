//Optimal Appproach -> O(n) (Using Two Pointers Approach)

import java.util.ArrayList;
public class ContainerWithMostWaterOptimalApproach {

    public static int mostWater(ArrayList<Integer> height){
        int maxWater = 0;

        int lp = 0;
        int rp = height.size()-1;

        while(lp < rp){
            //calculate area
            int minHeight = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currWater = minHeight * width;
            maxWater = Math.max(currWater, maxWater);

            //condition for updating pointer
            if(height.get(lp) < height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println("Maximum Water that can be stored in the container is:"+mostWater(height));
    }
}
