package main._401_to_450._443_StringCompression;

public class TestCase443
{
  private char[] _Input;
  private char[] _Output;
  private int _Ans;
  
  public TestCase443() {}
  
  public void add(char[] input, char[] output, int ans) 
  {
    this._Input = input;
    this._Output = output;
    this._Ans = ans;
  }
  
  public char[] getInput() { return this._Input; }
  public char[] getOutput() { return this._Output; }
  public int getAnswer() { return this._Ans; }
}
