import java.util.*;
class Marbles
  {
    public static void main(String arg[])
       {
         Scanner sanj=new Scanner(System.in); 
         int m=sanj.nextInt();
         int n=m;
         int d1=sanj.nextInt();
         int n1=sanj.nextInt();
         int d2=sanj.nextInt();
         int n2=sanj.nextInt();
         float c1=(float)n1/d1;
         float c2=(float)n2/d2;
         int min;
         int max;
         int count=0;
         int count1; 
         if(c1>c2)
         {
            min=n2;
            max=n1;
         }
         else{
            min=n1;
            max=n2;
         }
         if(m%max==0)
         {
           System.out.println(""+(m/max)+"  0");
           }
         else{
           count1=1;
           m=m-min;
           while(m>0)
             {
                if(m%max==0)
                  { count=m/max; 
                    System.out.println(""+count+" "+count1);
                    break;
                   }
                else
                 {   m=m-min;
                     count1++;
                 }
            }
            int x=count*max+count1*min;
            if(x!=n)
            {
            System.out.println("Failed");
             }
           }
          }
 }
            
      

                