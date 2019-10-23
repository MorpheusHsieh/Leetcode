package test._401_to_450;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import main._401_to_450._429_NaryTreeLevelOrderTraversal.Node;
import main._401_to_450._429_NaryTreeLevelOrderTraversal.Solution0429;
import main._401_to_450._429_NaryTreeLevelOrderTraversal.Solution0429v1;
import main._401_to_450._429_NaryTreeLevelOrderTraversal.TestData;
import main._401_to_450._429_NaryTreeLevelOrderTraversal.TreeUtil;

class _429_Testing {

  @Test
  void test()
  {
    Solution0429 sol = new Solution0429v1();
    Node root = TreeUtil.createTree(TestData.TrainData);
    List<List<Integer>> result = TestData.getTrainResult(); 
    assertEquals(result, sol.levelOrder(root));
  }

}
