class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int i = 0;
       
        for (int k = 0; k < arr2.length ; k++){
            for(int j = i; j < arr1.length ; j++){
                if(arr2[k] == arr1[j]){
                    int temp = arr1[i]; arr1[i] = arr1[j]; arr1[j] = temp;
                    i++;
                }
                
            }
        }
          Arrays.sort(arr1, i, arr1.length);
      
       return arr1;
    
        
    }
}