package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Solution ob=new Solution();
        System.out.println(ob.repeatedSubstringPattern("c"));

    }
}

class Solution
{
    public boolean repeatedSubstringPattern(String s) {

        int len=s.length();

        if(len==1)
            return false;

        List divisors=new ArrayList<Integer>();

        divisors=generateDivisors(len);

        //System.out.println(divisors);

        if(divisors.isEmpty())
        {
            return false;
        }
        else
        {
            boolean flag=false;
           for(int i=0; i<divisors.size(); i++)
           {
               String subst,st="";

               subst=s.substring(0,(int)divisors.get(i));
               //System.out.println("sub : "+subst);

               for(int j=0; j<len/(int)divisors.get(i); j++)
               {
                   st+=subst;
               }

               if(st.equals(s))
               {
                   flag=true;
                   break;
               }

           }

           return flag;

        }


    }

    private List generateDivisors(int len) {
        List divisors=new ArrayList<Integer>();

        divisors.add(1);

        for(int i=2; i*i<=len; i++)
        {
            if(len%i==0)
            {
                if(len/i!=len/(len/i))
                {

                    divisors.add(len/(len/i));
                    divisors.add(len/i);
                }
                else
                {
                    divisors.add(len/i);
                }
            }
        }



        return divisors;

    }


}