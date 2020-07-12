import java.util.*;
class Diamond
{
   public static void  main(String  abc[])
   {
      Scanner in = new Scanner(System.in);
      int line = in.nextInt();
      printDiamond(line);
   }


   public static void printDiamond(int diamondSize)
   {
     int spaceVariable = diamondSize-1;
     int starConditionVariable  = 0;
     for(int  i=0; i<= diamondSize*2-1;i++)
     {
       if(i >= diamondSize) {
         spaceVariable = i+((i - diamondSize)+1);
         starConditionVariable = (2* diamondSize-(i+2))*2;
       }
       else starConditionVariable  = (2*i);
       for(int j = spaceVariable ; j > i  ;  j--  ) System.out.print("  ");
       for(int k  = 0; k <=  starConditionVariable;k++)  System.out.print("* ");
       System.out.println();
     }
   }
}

