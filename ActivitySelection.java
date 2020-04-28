public class ActivitySelection {
	/*
	problem statement 
		you are given n Activites with start and finish time so that ypu have to find the maximum number of activites done , 
		assuming that he can do one work at time .
	Solution :
		I have sorted both arrays based on increasing order of finish array , so that using dp / memosiation i had found out the 
		max activity .	
	*/
	public static void main(String[] args) {
		int n = 6 ;
		int[] start = { 0,3,1,5,5,8 } ;
		int[] finish = { 6,4,2,8,7,9 } ;
		// Sort finish array in increaseing order , while sorting finish array sort the start array matching same indices .
		for( int i=0;i<n;i++ ) {
			int index = 0 ;
			for( int j=i+1;j<n;j++ ){
				if( finish[i]>finish[j] ){
					index = j ;
					int temp = finish[index] ;
					finish[index] =finish[i] ;
					finish[i] = temp ;
					temp = start[index] ;
					start[index] = start[i] ;
					start[i] = temp ;
				}
			}	
		}
		int[] maxActivity = new int[n] ;
		for( int i=0;i<maxActivity.length;i++ ) maxActivity[i] = 0 ;
		for( int i=1;i<n;i++ ) {
			for( int j=0;j<i;j++ ) {
				if( finish[j]<=start[i] && maxActivity[i]<maxActivity[j]+1 ) {
					maxActivity[i] = maxActivity[j]+1 ;
				}
			}
		}
		int max = 0 ;
		for( int i=0;i<n;i++ ) if( max<maxActivity[i] ) max = maxActivity[i] ;
		System.out.print( "Maximum Activity done : "+( max+1 ) ) ;
	}
}