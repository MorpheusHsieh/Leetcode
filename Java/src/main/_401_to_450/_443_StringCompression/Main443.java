package main._401_to_450._443_StringCompression;

import java.util.ArrayList;
import java.util.List;

public class Main443
{
  static List<TestCase443> cases = new ArrayList<TestCase443>(); 
  
  public static void main(String[] args)
  {
    System.out.println("443 String Compression");
    

    init();
    
    
  }
  
  public static void init()
  {
    char[][] inputs = {
      {'a','a','b','b','c','c','c'}, 
      {'a'},
      {'a','b','b','b','b','b','b','b','b','b','b','b','b'}
    };
    
    char[][] outputs = {
      {'a','2','b','2','c','3'}, 
      {'a'}, 
      {'a','b','1','2'},
    };
    
    int[] ans = { 6, 1, 4 };
    
    int row_num = inputs.length;
    for (int i=0; i<row_num; i++)
    {
      TestCase443 tc = new TestCase443(
          inputs[i], outputs[i], ans[i]
      );
      
      System.out.println();
      System.out.println(tc.toString());
      
      Main443.cases.add(tc);
    }
  }
  
}
