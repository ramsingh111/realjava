/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ramsingh;

/**
 *
 * @author NCC
 */
public class operatorDemo {
    
     public static void main(String[] args){
         int a = 12;
         int b = 18;
         System.out.println(a>b);
         System.out.println(a > 11 || b < 15);
         int c = 18;
         int d = 27;
        int max = a>b?a:b;
         System.out.println();
         int time = 13;
         if(time<12){
         System.out.println("GoodMorning");
         }else if(time<17){
         System.out.println("GoodAfternoon");
         
         }else{
             System.out.println("GoodEvening");
         }
         String name = "sris";
         char gender = 'f';
         if (gender=='m'){
             System.out.println("Hello mr  " +  name);
         }else{
             System.out.println("Hello mrs  "+  name);
         }
         System.out.println(gender=='M'?"Hello mr "+name:"Hello miss "+name);
         for (int j = 1 ;j<11  ;j++ ){
             for (int i = 1 ; i<11;i++){
                System.out.print(j+" * "+i+" = "+i*j+"\t");   
            }
          System.out.println("");
        }
         String names[]={"rahul","sanjay","gita","ram"};
         String nos[]={"1211323","232323","32434","232445"};
         char genders[] = {'m','m','f','m'};
         for(int i = 0;i<names.length;i++){
             System.out.println("name is"+names[i]+"---"+(genders[i]== 'm'?"his":"her")+" phone number is " + nos[i]);
             
         
         }
         
         for (String n :names){
             System.out.println("my name is" + n);
         
     } 
          String searchTeam="nini";
          boolean found=false;
          for(String n:names){
            if (n==searchTeam){
                found= true;
                break;
                
          }
           
         
      }
          System.out.println(found?"congratulation":"sorry"); 
          
          
          int i = 0;
           while (i<=100){
              System.out.println(i);
              i++;
          }
          System.out.println(getMax(50,98));
          
          
           System.out.println(getSum(50,60));
           
           System.out.println(getSum(787,785,45545,4544,5454));
           
     }
     public static int getMax(int a , int b){
        int max = a>b ? a:b;
        return max;
        
        
         
   }
     public static int getSum(int a , int b){
         int sum = a+b;
         return sum;
         
     }
     public static int getSum(int... nums){
        int sum=0;
        for(int i:nums){
        sum+=i;
        }
        return sum;
     }
}   