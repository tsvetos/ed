package org.institutoserpis.ed;

public class Vector {

	public static void main(String[] args) {
//		int[] v = new int [] {9, 15, 7, 12, 6}; 
//		
//		for (int index = 0; index < 5; index++)
//			System.out.printf("v[%s]=%s ", index, v[index]);
//		System.out.println();
//		
//		int value = 6;
//		
//		int position = indexOf(v, value);
//		System.out.println("position = " + position);
//		int min = min(v);
//		System.out.println("min = " + min);
//	}
//
//	
//	public static int indexOf(int[] v, int value) {
////		for (int index = 0; index < v.length -1; index++)
////			if (v[index] == value)
////				return index;
////		return -1;
//		int index = 0;
//		while (index < v.length && v[index] != value ) // Ojo con el orden de la condicion
//			index++;
//		return index < v.length ? index : -1;
//	}
//	
//	
//	public static int min (int[]v) {
//		int min = v[1];
//		for (int index = 1; index < v.length; index++)
//			if( v[index] < min)
//				min = v[index];
//		return min;
//		int min = v [0];
//		for (int item : v)
//			if (item < min)
//				min = item;
//		return min;
//	}
	
//	public static void selectionSort() {
//		int selectedIndex, indexOfMin,aux;
//		for(int index = 0; index < v.length;index++){
//			indexOfMin = index;
//		      for( selectedIndex = index+1; selectedIndex < v.length; selectedIndex++) {
//		          if(v[selectedIndex] < v[indexOfMin])
//		        	 indexOfMin = selectedIndex;
//		      
//		      if (indexOfMin != index) {
//		      aux = v[index];
//		      v[index] = v[selectedIndex];
//		      v[indexOfMin] = aux;  
//		      }
//		}
//	}
//	}
	}
	public static int suma(int[]v) {
		int suma=0;
		
//		for (int index=0; index< v.length ; index++) 
//		suma=suma + v[index];
		for (int item: v)
			suma = suma + item;
		
		
		return suma;	
	}
	
	public static int indexOfMin(int[] v) {
		int indexOfMin = 0;
		for (int index =1; index < v.length; index++)
			if ( v[index] < v[indexOfMin])
				indexOfMin = index;
		return indexOfMin;
			
	}
	
}





