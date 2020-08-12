using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Linq;

namespace pasclRowCreate
{
    class Program
    {
        static void Main(string[] args)
        {
            int row = Convert.ToInt32(Console.ReadLine());

            IList<int> list = getRow(row);

            foreach(int val in list)
            {
                Console.Write(val + " ");
            }
           
        }

        static IList<int> getRow(int rowIndex)
        {

            if(rowIndex==0)
            {
                return new List<int> { 1 };
            }
           

            List<int> ar = new List<int>() { 1, 1 };
       

            for(int i=0; i<rowIndex-1; i++)
            {
                List<int> temp = new List<int> { 1};

                for(int j=0; j<ar.Count()-1; j++)
                {
                    temp.Add(ar[j] + ar[j + 1]);
                }
                temp.Add(1);
                ar = temp;

            }

            return ar;    
            
        }
    }
}
