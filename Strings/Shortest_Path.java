public class Shortest_Path {

    public static float shortestPath(String path){
        int x = 0;
        int y = 0;

        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);

            //east
            if(dir == 'E'){
                x++;
            }
            
            //west
            else if(dir == 'W'){
                x--;
            }

            //north
            else if(dir == 'N'){
                y++;
            }

            //south
            else{
                y--;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;

        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String args[]){
        String path = "WNEENESENNN";

        System.out.print("The Shortest path is:"+shortestPath(path));
    }
}
