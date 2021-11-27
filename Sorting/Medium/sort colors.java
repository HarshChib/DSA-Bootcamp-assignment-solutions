class Solution {
    public void sortColors(int[] arr1) {
         int n1 = arr1.length;
        int arr2[]={0,1,2};
        int n2 = arr2.length;
        
        // pointer to sort arr1
        int point = 0;
        
        // traverse in arr2 to get each element and sort according to that
        for(int i=0; i<n2; i++)
        {
            // find current value inside arr1 and put on a right place
            point = findSort(arr2[i],arr1,point,n1); 
        }
        
        // sort the arr1 so non-present element come in ascending order at last
        
        
     
    }
    
    int findSort(int val,int[] arr,int k,int size)
    {
        for(int i=k; i<size; i++)
        {
            if(arr[i] == val)
            {
                swap(i,k,arr);
                k++;
            }
        }
        return k;
    }
    
    void swap(int ind1, int ind2, int[] arr)
    {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }
    
}