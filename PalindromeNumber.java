import java.util.*;

class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        else{
            int temp=x;
            int rev = 0;
            while(temp>0)
            {
                int lastDigit = x%10;
                rev*=10;
                rev+=lastDigit;
                temp=temp/10;
            }

            return(x==temp);
            //  if(x==temp)
            // {
            //     return true;
            // }
            // return false;
        }
    

    }
}

