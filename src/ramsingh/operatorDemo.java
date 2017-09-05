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

}
}