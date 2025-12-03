/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    for (y = 0; y < nums.length; y++){
        const current = nums[y]
        for (x = y+1; x < nums.length; x++){
            if (current + nums[x] === target){
                return [y, x]
            }
        }
    }
 };
