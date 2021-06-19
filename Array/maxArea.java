/*
Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.

Notice that you may not slant the container.
*/
class Solution {
    public int maxArea(int[] height) {
        int vol=0, tempvol=0, i=0, j=height.length-1;
       while(i<j){
            vol=Math.min(height[i],height[j])*((j+1)-(i+1));
            if(vol>tempvol) tempvol=vol;
            if(height[i]<height[j])   i++;
            else j--;
       }
        return tempvol;
    }
}
