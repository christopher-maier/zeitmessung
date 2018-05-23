
public class HöhereSortieralgorithmen {
	public static int[] intArr = { 16, 23, 14, 7, 21, 20, 6, 1, 17, 13, 12, 9, 3, 19 }; 
	
	 public int[] quickSort(int l, int r) { 
	        int q; 
	        if (l < r) { 
	            q = partition(l, r); 
	            quickSort(l, q); 
	            quickSort(q + 1, r); 
	        } 
	        return intArr; 
	    } 
	 
	 private int partition(int l, int r) { 

	        int i, j, x = intArr[(l + r) / 2]; 
	        i = l - 1; 
	        j = r + 1; 

	        do { 
	            i++; 
	        } while (intArr[i] < x); 

	        do { 
	            j--; 
	        } while (intArr[j] > x); 

	        if (i < j) { 
	            int k = intArr[i]; 
	            intArr[i] = intArr[j]; 
	            intArr[j] = k; 
	        } else { 
	            return j; 
	        } 
	        return -1; 
	    } 
	 
	 public int[] mergeSort(int l, int r) { 
         
	        if (l < r) { 
	            int q = (l + r) / 2; 
	             
	            mergeSort(l, q); 
	            mergeSort(q + 1, r); 
	            merge(l, q, r); 
	        } 
	        return intArr; 
	    } 
	 
	 private void merge(int l, int q, int r) { 
	        int[] arr = new int[intArr.length]; 
	        int i, j; 
	        for (i = l; i <= q; i++) { 
	            arr[i] = intArr[i]; 
	        } 
	        for (j = q + 1; j <= r; j++) { 
	            arr[r + q + 1 - j] = intArr[j]; 
	        } 
	        i = l; 
	        j = r; 
	        for (int k = l; k <= r; k++) { 
	            if (arr[i] <= arr[j]) { 
	                intArr[k] = arr[i]; 
	                i++; 
	            } else { 
	                intArr[k] = arr[j]; 
	                j--; 
	            } 
	        } 
	    } 
	
	 private static void heapSort() {
	        int length = intArr.length;

	        buildMaxHeap(intArr, length);
	        for(int i = length - 1; i > 0; i--) {
	            int temp = intArr[0];
	            intArr[0] = intArr[i];
	            intArr[i] = temp;
	            maxHeapify(intArr, 1, i);
	        }
	    }
	 
	 private static void buildMaxHeap(int[] array, int heapSize) {
	        if(array == null) {
	            throw new NullPointerException("null");
	        }
	        if(array.length <=0 || heapSize <= 0) {
	            throw new IllegalArgumentException("illegal");
	        }
	        if(heapSize > array.length) {
	            heapSize = array.length;
	        }

	        for(int i = heapSize/2; i > 0; i--) {
	            maxHeapify(array, i, heapSize);
	        }
	    }

	 private static void maxHeapify(int[] array, int index, int heapSize) {
	        int l = index * 2;
	        int r = l + 1;
	        int largest;

	        if(l <= heapSize && array[l - 1] > array[index - 1]) {
	            largest = l;
	        } else {
	            largest = index;
	        }

	        if(r <= heapSize && array[r - 1] > array[largest - 1]) {
	            largest = r;
	        }

	        if(largest != index) {
	            int temp = array[index - 1];
	            array[index - 1] = array[largest - 1];
	            array[largest - 1] = temp;
	            maxHeapify(array, largest, heapSize);
	        }
	    }
 
	    
	    public static void main(String[] args) {
	    	HöhereSortieralgorithmen algorithmus = new HöhereSortieralgorithmen();
	    	
	    	final long timeStart_quick = System.nanoTime();
	    	int[] quickSort_geordnet = algorithmus.quickSort(0, intArr.length - 1); 
	    	final long timeEnd_quick  = System.nanoTime();
//	    	for (int i = 0; i < quickSort_geordnet.length; i++) { 
//	            System.out.println(i + 1 + ": " + quickSort_geordnet[i]); 
//	        }  
	    	System.out.println("Laufzeit von QuickSort: " + (timeEnd_quick - timeStart_quick) + " Nanosekunden."); 
	    	
	    	final long timeStart_merge = System.nanoTime(); 
	    	int[] mergeSort_geordnet = algorithmus.mergeSort(0, intArr.length - 1); 
	    	final long timeEnd_merge = System.nanoTime();
//	    	for (int i = 0; i < mergeSort_geordnet.length; i++) { 
//	            System.out.println(i + 1 + ": " + mergeSort_geordnet[i]); 
//	        }
	    	System.out.println("Laufzeit von MergeSort: " + (timeEnd_merge - timeStart_merge) + " Nanosekunden."); 
	    	
	    	final long timeStart_heap = System.nanoTime(); 
	    	heapSort(); 
	    	final long timeEnd_heap = System.nanoTime();
//	    	for(int i : intArr) {
//	            System.out.println(i);
//	        }
	    	System.out.println("Laufzeit von HeapSort:  " + (timeEnd_heap - timeStart_heap) + " Nanosekunden."); 
	    	
	    }
}
