package main._051_to_100._100_SameTree;

import main.utils.TreeNode;

/*
 * Your runtime beats 24.21% of java submissions.
 */

public class Solution100v2 implements Solution100
{
  public boolean isSameTree(TreeNode p, TreeNode q) 
  {
    if (p == null && q == null) return true;

    if (p == null || q == null) return false;

    if (p.val != q.val) return false;
    
    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
  }
}
