/* 
Given an array of non-negative integers nums, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Your goal is to reach the last index in the minimum number of jumps.

You can assume that you can always reach the last index.
*/

class Solution {
    public int jump(int[] nums) {
        if(nums.length == 1) return 0;

        int result = 0;
        int current = 0;

        while(current < nums.length - 1) {
            int maxSteps = nums[current];
            int maxForwardMove = 0;
            int move = 0;

            for(int i = 1 ; i <= maxSteps ; i++) {
                int moveTo = current + i;
                if(moveTo == nums.length - 1) {
                    move = i;
                    break;
                }

                int forwardMove = moveTo + nums[moveTo];
                if(forwardMove > maxForwardMove) {
                    maxForwardMove = forwardMove;
                    move = i;
                }
            }

            result++;
            current = current + move;
        }

        return result;
    }
}
