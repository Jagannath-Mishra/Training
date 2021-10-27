package arrayexample;

public class TwoDArrayExample{
	
	 
    public static void main(String[] args)
    {
  
        int[][] arr = {
        					{ 1, 2 }, { 3, 4 } 
        		};
        
        
  
        for (int i = 0; i < arr.length; i++) {
        	
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            
         
            System.out.println();
        }
        
        // Store data to some location 
        

            arr[1][0] = 100;
        
        System.out.println("after change of value");
        
 for (int i = 0; i < 2; i++) {
        	
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
  
            System.out.println();
        }
    }
}