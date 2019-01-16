class Missing2 
{ 
      
// Returns the sum of the array 
static int getSum(int arr[], int n) 
{ 
    int sum = 0; 
    for (int i = 0; i < n; i++) 
        sum += arr[i]; 
    return sum; 
} 
  
// Function to find two missing  
// numbers in range [1, n]. This 
// function assumes that size of  
// array is n-2 and all array  
// elements are distinct 
static void findTwoMissingNumbers(int arr[],  
                                  int n) 
{ 
    // Sum of 2 Missing Numbers 
    int sum = (n * (n + 1)) / 
               2 - getSum(arr, n - 2); 
  
    // Find average of two elements 
    int avg = (sum / 2); 
  
    // Find sum of elements smaller  
    // than average (avg) and sum of  
    // elements greater than average (avg) 
    int sumSmallerHalf = 0,  
        sumGreaterHalf = 0; 
    for (int i = 0; i < n - 2; i++) 
    { 
        if (arr[i] <= avg) 
            sumSmallerHalf += arr[i]; 
        else
            sumGreaterHalf += arr[i]; 
    } 
  
    System.out.println("Two Missing " +  
                       "Numbers are"); 
  
    // The first (smaller) element =  
    // (sum of natural numbers upto  
    // avg) - (sum of array elements 
    // smaller than or equal to avg) 
    int totalSmallerHalf = (avg *  
                           (avg + 1)) / 2; 
    System.out.println(totalSmallerHalf -  
                         sumSmallerHalf); 
  
    // The first (smaller) element =  
    // (sum of natural numbers from 
    // avg+1 to n) - (sum of array  
    // elements greater than avg) 
    System.out.println(((n * (n + 1)) / 2 -  
                        totalSmallerHalf) -  
                           sumGreaterHalf); 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
int arr[] = {1, 3, 5, 6}; 
      
// Range of numbers is 2 
// plus size of array 
int n = 2 + arr.length; 
      
findTwoMissingNumbers(arr, n); 
} 
} 