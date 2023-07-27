import java.util.*;

class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> l1 = new ArrayList<String>();
        for(int i =1;i<=n;i++)
        {
            if((i%3==0)&&(i%5==0))
            {
                l1.add("FizzBuzz");
                // System.out.print("FizzBuzz ");
            }
            else if(i%3==0)
            {
                l1.add("Fizz");
                //System.out.print("Fizz ");
            }
            else if(i%5==0)
            {
                l1.add("Buzz");
                //System.out.print("Buzz ");
            }
            else{
                l1.add(Integer.toString(i));
                //System.out.print(Integer.toString(i));
            }
        }

        return l1;
    }
}