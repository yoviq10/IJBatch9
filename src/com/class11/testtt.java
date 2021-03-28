package com.class11;

public class testtt {

	public static void main(String[] args) {
		
		
		int nums[] = { 12, 15, 16, 17, 19 };

			   for (int i = nums.length-1; i >0; i--) {

			      System.out.println(nums[i]);

			    }
		
		
		
		
		
		
		System.out.println("----4----");
		
		int[] a = {12, 15, 11, 13, 9, 25};
		int[] a2 = {12, 15, 11, 13, 9, 25};
		int sum = 0;
		for (int i = 0; i <a.length; i++) {
		         if (a[i] % 2== a2[i ] % 5)  {
		                  sum += i * i;
		         }
		}
		System.out.println("sum = " + sum);
		
		
		System.out.println("---#6--");
		
		int[] egArray = { 2, 4, 6, 8, 10, 1, 3, 5, 7, 9 };

		for ( int index= 0 ; index < 5 ; index++ ) {
		       System.out.print( egArray[ index ] + " " );
		}

		
		
		
		System.out.println("-----");
		
		
		
				char array_variable [] = new char[10];
				for (int i = 0; i < 10; ++i) {
				         array_variable[i] = 'i';
				         System.out.print(array_variable[i] + " ");
				}
		
		
		System.out.println();
		System.out.println("---#9-");
		
		//int array_variable[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int sums = 0;

		for (int i = 0; i < 3; ++i) {

		   for (int j = 0; j < 3; ++j) {

		    //   sums = sums + array_variable[i][j];

		   }

		}

		System.out.print(sum / 5);
		
		System.out.println();
		System.out.println("-----10");
		
		int[] array = { 1, 4, 3, 6, 8, 2, 5 };

		int what = array[0];

		for (int index = 0; index < array.length; index++) {

		       if (array[index] > what) {

		                  what = array[index];

		        }

		}

		System.out.println(what);
		
		System.out.println("-----11");
		
		int[] zip = new int[5];

		zip[0] = 7;
		zip[1] = 3;
		zip[2] = 4;
		zip[3] = 1;
		zip[4] = 9;

		System.out.println( zip[ 2 + 1 ] );
		
		System.out.println("-----13");
		
		int x=1;

		while(x<5) {   

		   x++;   

		   System.out.print(x);

		}
		
		
		System.out.println("----");
	     
	     
	     System.out.println(" ");
		
	     int count = 0;
	     while (count++ < 10) {
	     System.out.println("Welcome to Java");
	     }
	     
	     System.out.println();
	     System.out.println("---#19--");
	     
	     int y = 0;
	     for (int i = 0; i < 10; ++i) {
	     y += 1;
	     }  
	     
	     System.out.println();
	     System.out.println("----21");
	     for(int i = 0; i <= 5; i++ )
	        {
	            System.out.println("i = " + i );
	        }
	     
	     System.out.println("--#22--");
	     
	     int k=3, tot=0;

	     do{

	        tot=tot+k;

	        k++;

	     } while(k<11);

	     System.out.print(tot);
	     
	     System.out.println();
	     System.out.println("  ------#24---- ");
	     
	     
	     int z=2, sumz=0;

	     while(z<9) {

	        z++;

	        sumz=sumz+z;

	     }

	     System.out.print(sumz);
	     
	     System.out.println();
	     System.out.println("----25");
	     
	     
	     int m=2, total=0;

	     while(m<6) {

	        total=total+m;

	        m++;

	     }

	     System.out.println(total);
	     System.out.println(m);
	     
	     
	     
	     
	     
	     
	     
	}

}
