//Given an integer i. Print the maximum number of nodes on level i of a binary tree.
class Solution {
    static int countNodes(int i) {
        int n;
        n=(int)Math.pow(2,i-1);
        return n;
        // code here
    }
}