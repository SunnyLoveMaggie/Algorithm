package Algorithm.Test.T003_MaxSumSubArray;

public class MaxSumSubArray {

	private int data[];
	public MaxSumSubArray(int []a) {
		data = a;
	}

	public int getMaxSumSubArray(){
		int sum = 0;
		int max=0;
		int lastIndex = -1;
		for(int index = 0; index < data.length; index++){
			sum = sum + data[index];
			if(sum<0){
				sum = 0;
			}
			if(sum > max){
				max = sum;
				lastIndex = index;
			}
		}
		
		//Print the sub array
		System.out.println("The max sum is:" + max);
		if(lastIndex!=-1){  
            System.out.println("The subArray is:");  
            //print the sub array  
            int i=lastIndex;  
            while(i>=0&&max>0){  
            	max-=data[i];  
                i--;  
            } 
            i++;
            for(int j=i;j<=lastIndex;j++){  
                System.out.print(data[j]+" ");  
            }  
        }  
		return max;
	}
}
