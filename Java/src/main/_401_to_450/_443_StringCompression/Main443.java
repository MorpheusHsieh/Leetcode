package main._401_to_450._443_StringCompression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main443
{
  public static void main(String[] args)
  {
    System.out.println("443 String Compression");
    
    List<TestCase443> cases = new ArrayList<TestCase443>();
    Solution443 sol = new Solution443v1();
    
    init(cases);
    System.out.println(cases.toString());
    
    for (TestCase443 tc : cases)
    {
      char[] in = tc.getInput();
      System.out.format("\r\nInput: %s", Arrays.toString(in));
      
      int res = sol.compress(in);
      System.out.format("\r\nOutput: %d", res);
    }
    
    
  }
  
  public static void init(List<TestCase443> cases)
  {
    char[][] inputs = {
      {'a','a','b','b','c','c','c'}, 
      {'a'},
      {'a','b','b','b','b','b','b','b','b','b','b','b','b'},
      {'a','b','c','d','e','f','g'}
    };
    
    char[][] outputs = {
      {'a','2','b','2','c','3'}, 
      {'a'}, 
      {'a','b','1','2'},
      {'a','1','b','1','c','1','d','1','e','1','f','1','g','1'}
    };
    
    int[] ans = { 6, 1, 4, 14 };
    
    int row_num = inputs.length;
    for (int i=0; i<row_num; i++)
    {
      TestCase443 tc = new TestCase443(
          inputs[i], outputs[i], ans[i]
      );
      
      cases.add(tc);
    }
  }
  
}
