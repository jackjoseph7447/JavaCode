package arraypractice;

import java.util.Arrays;

public class ArrayPractice {
  /* sets every item in A[] to initialValue */
  public static void initialize(int A[], int initialValue) {
	  for(int i = 0; i < A.length; i++)
	  {
		  A[i] = initialValue;
	  }
	  
	  return;
  }

  /* returns the average of the items in A
   * Be careful: A[] is an array of int and the method returns
   * double. What do we do to handle this? */
  public static double average(int A[]) {
	  double ave = 0.0;
	  double total = 0.0;
	  for(int i = 0; i < A.length; i++)
	  {
		  total += (double)A[i];
	  }
	  
	  ave = total / A.length;
	  
	  return ave;
  }

  /* returns the number of times that x appears in A[] */
  public static int numOccurrences(int A[], int x) {
	  int c = 0;
	  for(int i = 0; i < A.length; i++)
		  if(A[i] == x)
			  c++;
	  
	  return c;
  }


  /* returns the index of the first occurrence of
   * x in A[] or -1 if x doesn't exist in A[] */
  public static int find(int A[], int x) {
	  int c = 0;
	  for(int i = 0; i < A.length; i++)
	  {
		  if(A[i] == x && c == 0)
			  c = i;
	  }
	  
	  if(c > 0)
		  return c;
	  
	  return -1;
  }

  /* Returns the index of the first occurrence of
   * item within the first n elements of A[] or -1
   * if item is not among the first n elements of A[] */
  public static int findN(int A[], int item, int n) {	  
	  int c = -1;
	  for(int i = 0; i < A.length; i++)
	  {
		  if(A[i] == item && i < n)
		  {
			  c = i;
			  break; // Ends the loops, and because we need the first index, it makes sense to do so. Do not usually use breaks.
		  }
	  }
	  
	  if(c > 0 || c == 0)
		  return c;
	  
	  return -1;
  }

  /* returns the index of the last occurrence of
   * x in A[] or -1 if x doesn't exist in A[] */
  public static int findLast(int A[], int x) {
	  int c = 0;
	  for(int i = 0; i < A.length; i++)
	  {
		  if(A[i] == x)
			  c = i;
	  }
	  
	  if(c > 0)
		  return c;
	  
	  return -1;
  }

  /* returns the largest item found in A */
  public static int largest(int A[]) {
	  int c = 0;
	  for(int i = 0; i < A.length; i++)
	  {
		  if(A[i] >= c)
			  c = A[i];
	  }
	  
	  return c;
  }

  /* returns the index of the largest item found in A */
  public static int indexOfLargest(int A[]) {
	  int c = -100;
	  int index = 0;
	  for(int i = 0; i < A.length; i++)
	  {
		  if(A[i] > A[index])
			  c = i;
	  }
	  
	  
	  return c;
  }

  /* returns the index of the largest odd number
   * in A[] or -1 if A[] contains no odd numbers */
  public static int indexOfLargestOdd(int A[]) {
	  int c = -100;
	  for(int i = 0; i < A.length; i++)
	  {
		  if(A[i] >= A[0] && A[i] % 2 == 1)
		  {
			  c = i;
		  }
	  }
	  
	  if(c >= 0)
		  return c;
	  
	  return -1;
  }

  /* inserts n into A[] at A[index] shifting all */
  /*  the previous items one place to the right. For example */
  /*  if A is  */
  /*   |---+---+---+---+---+---+---+---+---+---| */
  /*   | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | */
  /*   |---+---+---+---+---+---+---+---+---+---| */
  /*   | 5 | 7 | 6 | 9 | 4 | 3 | 0 | 0 | 0 | 0 | */
  /*   |---+---+---+---+---+---+---+---+---+---| */

  /*   and we call insert(A, 15, 1), A then becomes */

  /*   |---+----+---+---+---+---+---+---+---+---| */
  /*   | 0 |  1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | */
  /*   |---+----+---+---+---+---+---+---+---+---| */
  /*   | 5 | 15 | 7 | 6 | 9 | 4 | 3 | 0 | 0 | 0 | */
  /*   |---+----+---+---+---+---+---+---+---+---| */
  /*  the element in A[] that's in the right-most */
  /*    position is removed.                      */
  /*                                              */
  /*  if index < 0 or index >= A.length-1, the method */
  /*                                    does nothing */
  public static void insert(int A[], int n, int index) {	  
	  
	  int[] B = new int[A.length];
	  int temp = 0;
	  for(int i = 0; i < A.length; i++)
	  {
		  B[i] = A[i];
	  }
		  if(index >= 0 && index < A.length)
		  {
			  A[index] = n;
			  for(int i = index + 1; i < A.length; i++)
			  {
				  A[i] = B[i - 1];
			  }
		  }
	  
	  return;
  }

  /* returns a new array consisting of all of the
   * elements of A[] */
  public static int[] copy(int A[]) {
	  int[] B = A;
	  
	  return B;
  }

  /* Returns a new array consisting of all of the
     first n elements of A[]. If n>A.length, returns a
     new array of size n, with the first A.length elements
     exactly the same as A, and the remaining n-A.length elements
     set to 0. If n<=0, returns null. */
  public static int[] copyN(int A[], int n) {
	  if(n <= 0)
		  return null;
	  
	  int[] B = new int[n];
	  
	  if(n < A.length)
	  {
		  for(int i = 0; i < n; i++)
		  {
			  B[i] = A[i];
		  }
		  
		  return B;
	  }
	  else
	  {
		  for(int i = 0; i < A.length; i++)
		  {
			  B[i] = A[i];
		  }
		  
		  return B;
	  }
  }

  /* returns a new array consisting of all of the
   * elements of A[] followed by all of the
   * elements of B[]. For example, if 
   A[] is: {10,20,30} and 
   B[] is: {5, 9, 38}, the method returns the
   array : {10,20,30,5,9,38} */
  public static int[] copyAll(int A[], int B[]) {
	  int length = A.length + B.length;
	  int[] array = new int[length];
	  int pos = 0;
	  
	  for(int ele : A) // For each loop.
	  {
		  array[pos] = ele;
		  pos++;
	  }
	  
	  for(int ele : B)
	  {
		  array[pos] = ele;
		  pos++;
	  }

    return array;
  }

  /* reverses the order of the elements in A[].
   * For example, if A[] is:
   {10,20,30,40,50}, after the method, A[] would
   be {50,40,30,20,10} */
  public static void reverse(int A[]) {
	  int temp = 0;
	  int c = 1;
	  
	  for(int i = 0; i < A.length / 2; i++)
	  {
		  int index = A.length - c;
		  temp = A[i];
		  A[i] = A[index];
		  A[index] = temp;
		  c++;
	  }
	  
	  return;
  }
  

  /* Extra credit:
   *
   * Returns a new array consisting of all of the
   * elements of A, but with no duplicates. For example,
   * if A[] is {10,20,5,32,5,10,9,32,8}, the method returns
   * the array {10,20,5,32,9,8} */
  public static int[] uniques(int A[]) {
    return null;
  }

  public static void main(String[] args) {
    return;
  }
}
