public class Trapping_RainWater {

    public static int trappingRainWater(int height[]){
        int n = height.length;
        //Calculate left-Max boundary array

        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        //Calculate right-Most boundary array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }

        int trappedWater = 0;
        //loop
        for(int i=0;i<n;i++){
            //Waterlevel = min(left-max boundary, right-max boundary)
            int waterlevel = Math.min(leftMax[i],rightMax[i]);

            //trapped water = (Waterlevel - height[i]) * width --> here width = 1, so we ignore it
            trappedWater += waterlevel -height[i];
        }
        return trappedWater;
    }
    public static void main(String args[]){
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.print("The Total Trapped Water is:"+trappingRainWater(height));
    }
}
