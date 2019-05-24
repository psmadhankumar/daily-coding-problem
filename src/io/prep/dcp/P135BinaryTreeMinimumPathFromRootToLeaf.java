package io.prep.dcp;

import io.prep.dcp.lib.Tree;
import io.prep.dcp.lib.TreeUtil;

/**
 * 
 * 
 * Given a binary tree, find a minimum path sum from root to a leaf.
 *
 * For example, the minimum path in this tree is [10, 5, 1, -1], which has sum 15.
 * 
 *  10
 * /  \
 * 5    5
 *  \    \
 *   2    1
 *       / 
 *     -1
 *
 */
public class P135BinaryTreeMinimumPathFromRootToLeaf {

    public static void main(String[] args) {
        
        String input = "[10,5,5,-6,2,null,1,null,null,-1,null]";
        Tree root = TreeUtil.stringToTree(input);
        
        int sum = dfs(root, 0, Integer.MAX_VALUE);
        System.out.println(sum);
    }

    private static int dfs(Tree root, int sum, int maxSum) {
        
        if(root == null ) {  return sum;}
        
        sum += root.val;
        
        return Math.min(dfs(root.left, sum, maxSum),dfs(root.right, sum, maxSum));
    }

}
