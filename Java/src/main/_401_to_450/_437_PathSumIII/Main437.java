package main._401_to_450._437_PathSumIII;

import main.utils.TreeNode;
import main.utils.myTreeUtils;

public class Main437
{
  public static void main(String[] args)
  {
    System.out.println("434. Number of Segments in a String");
    
    String format = "\r\nroot = %s"
                  + "\r\nsum = %d"
                  + "\r\rnReturn: %d"
                  ;
    
    Solution437 sol = new Solution437v1();
    
    for (Integer[][] testcase : _testCases)
    {
      int sum = testcase[0][0];
      TreeNode root = myTreeUtils.createBinaryTree(testcase[1]);
      int res = sol.pathSum(root, sum);
      
      System.out.println(String.format(format, 
          myTreeUtils.toString(root), sum, res));
    }
  }
  
  private static Integer[][][] _testCases = 
  {
    { {8}, {10,5,-3,3,2,null,11,3,-2,null,1} }    
  };
}
