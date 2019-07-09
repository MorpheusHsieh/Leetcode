package main._401_to_450._443_StringCompression;

import java.util.Arrays;

public class Solution443v1 implements Solution443
{
  public int compress(char[] chars)
  {
    System.out.print("\r\nCompress:");
    
    
    int len = chars.length;
    int i = 0, j = 0, cnt = 0;
    System.out.println("\r\nlen = " + len);
    
    while (j < len)
    {
      System.out.format("\r\ni: %d, j: %d", i, j);

      if (i == j) { j++; cnt++; continue; }
      
      if (j+1 < len && chars[j] == chars[i]) {
        j++; cnt++;
      } 
      else  
      {
        if (j+1 == len) cnt = len - i;
        
        int digits = (int) (Math.log10(cnt));
        System.out.format("\r\ncnt = %d, digits = %d", cnt, digits);
        System.out.println();

        while (digits > 0) 
        {
          int divisor = (int) Math.pow(10, digits);
          int digit = cnt / divisor;
          cnt = cnt % divisor;

          chars[++i] = (char) (digit + 48); 
        }
        
        char num = (char)(cnt+48);
        chars[++i] = num;
        
        System.out.println(Arrays.toString(chars));

        if (j+1 == len) break;
        chars[++i] = chars[j++];
        cnt = 0;
      }
      
    }
      
    return i+1;
  }
}
