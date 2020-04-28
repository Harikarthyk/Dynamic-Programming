//@hari_karthyk
//Minimum  length to reach the end of the array .
public class JumpStarttoEnd {
	public static void main(String[] args) {
		int[] arr = { 2,3,1,1,2,4,2,0,1,1 } ;
		int[] jumpTrack = new int[arr.length] ;
		int[] noJumps = new int[arr.length] ;
		noJumps[0] = 0 ;
		//here we make the noJumps[0] = 0 has it is the  first index and rest has the max number .
		for( int i=1;i<arr.length;i++ )
		noJumps[i] = Integer.MAX_VALUE-2 ; 
		jumpTrack[0] = -1 ;
		//jumpTrack is an array which is used to track from where we reached the index it is like inidicating the path .
		int end = arr.length ;
		for( int i=1;i<end;i++ ) {
			for( int j=0;j<i;j++ ) {
				if( i<=arr[j]+j ){
					if( noJumps[i] > noJumps[j]+1 ){
						jumpTrack[i] = j ;
						noJumps[i] = noJumps[j]+1 ; 
					}		
				}
			}
		}

		// for( int i=0;i<end;i++ ) System.out.print( noJumps[i]+" " ) ;
		// System.out.println();
		// for( int i=0;i<end;i++ ) System.out.print( jumpTrack[i]+" " ) ;
		if( noJumps[ end-1 ]!=Integer.MAX_VALUE-2 )
			System.out.println( "Minimum Length to reach End  "+noJumps[ end-1 ] ) ;	
		else
			System.out.println( "-1" ) ;
	}
}