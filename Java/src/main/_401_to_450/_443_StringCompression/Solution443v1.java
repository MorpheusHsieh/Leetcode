package main._401_to_450._443_StringCompression;

public class Solution443v1 implements Solution443
{
  public int compress(char[] chars)
  {
    int len = chars.length;

    StringBuffer sb = new StringBuffer();

    int i = 0, j = 0;
    while (j < len)
    {
      System.out.format("\r\ni: %d, j: %d, %c, %c", i, j, chars[i], chars[j]);
      if (chars[j] == chars[i]) {
        j++; continue;
      }

      sb.append(chars[i]);
      sb.append(String.valueOf(j-i));  // number of chars[i]
      i = j; 
    }
    
    sb.append(chars[i]);

    int cnt = (i == (len - 1)) ? 1 : ((len-1) - i + 1);
    sb.append(String.valueOf(cnt));
    
    System.out.println("\r\n"+sb.toString());
    
    return sb.length();
  }
  
}
