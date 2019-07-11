package main._401_to_450._443_StringCompression;

public class Solution443v1 implements Solution443
{
  public int compress(char[] chars)
  {
    int len = chars.length;

    int read = -1, anchor = 0, write = 0;
    while (++read < len)
    {
      if ((read+1 == len) || chars[read+1] != chars[read])
      {
        chars[write++] = chars[anchor];

        if (read > anchor) 
        {
          int count = (read - anchor + 1);
          while (count > 0)
          {
            int digits = (int) (Math.log10(count));
            int divisor = (int) Math.pow(10, digits);
            int num = count / divisor;
            count %= divisor;
            chars[write++] = (char)(48 + num);
          }
        }
        anchor = read + 1;
      }
    }
    
    return write;
  }
  
}
