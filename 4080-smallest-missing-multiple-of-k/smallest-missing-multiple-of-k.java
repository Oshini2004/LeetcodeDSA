class Solution {
    public int missingMultiple(int[] nums, int k) {

    //     int multiple =k;

    //     while(true){
    //         boolean found =false;

    //         //check whether this multiple exists in nums
    //         for(int num: nums){
    //             if(num == multiple){
    //                 found = true;
    //                 break;
    //             }
    //         }

    //         if (!found ){
    //             return multiple;
    //         }
    //         multiple+= k;
    //     }
        
    // }

    HashSet<Integer> set =new HashSet<>();
    //strore all numbers for quik lookup
    for(int num: nums){
        set.add(num);
    }
    int multiple=k;

    //chek k,2k,3k,4k...
    while (set.contains(multiple)){
        multiple+=k;
    }
    return multiple;
}
}