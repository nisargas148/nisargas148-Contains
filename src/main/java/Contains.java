public class Contains {

    /**
     * This method searches an array to see if it contains the target value.
     * It uses a for loop to check every value in the array.
     *
     * @param arr the array to be manipulated.
     * @param target the value that the method should be searching for.
     * @return true if arr contains target, false otherwise.
     */
    public boolean arrayContains(int[] arr, int target){
        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            // If the current element matches the target, return true
            if (arr[i] == target) {
                return true;
            }
        }
        
        // If no match is found, return false
        return false;
    }
}
