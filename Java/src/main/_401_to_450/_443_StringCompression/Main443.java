package main._401_to_450._443_StringCompression;

import java.util.HashMap;

public class Main443
{
  private HashMap<char[], TestCase> cases;
  
  public static void main(String[] args)
  {
    System.out.println("443 Strign Compression");
    
    Solution443 sol = new Solution443v1();

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
      
    
  }
  
}

class TestCase<T1, T2, T3>
{
  private T1 _Input  = null;
  private T2 _Output = null;
  private T3 _Answer = null;  
  
  public TestCase(T1 in, T2 out, T3 ans)
  {
    this._Input  = in;
    this._Output = out;
    this._Answer = ans;
  }
  
  public T1 getInput()  { return this._Input;  }
  public T2 getOutput() { return this._Output; }
  public T3 getAnswer() { return this._Answer; }
}


  

//["a","a","b","b","c","c","c"]
//["a","2","b","2","c","3"]
//6    
//
//["a"]
//["a"]
//1
//  
//["a","b","b","b","b","b","b","b","b","b","b","b","b"]
//["a","b","1","2"]
//4
