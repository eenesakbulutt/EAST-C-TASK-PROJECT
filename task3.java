package groupproject;

public class task3 {

	public static void main(String[]args) {
		
		int sumeven =0;
		int sumodd=0;
		
		int[][] arr = { { 1, 2, 3, 4 }, { 10, 9, 8, 7 }, { 6, 5 } };
		
	
	for(int[]i:arr) {
		
		for(int j:i) {
			
			if(j%2==0) {
				
				sumeven=sumeven+j;
				
			}else if( j%2!=0) {
				
				sumodd=sumodd+j;
			}
		
					
		}
	}
	
	System.out.println(sumeven);
	
	System.out.println("----------");
	
	System.out.println(sumodd);
		
	    
	    


		
		
		
		
		
		
	}

}
