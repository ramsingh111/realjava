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
public class RAmsingh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ramsingh");
        System.out.println("Tamang");
        String name = "Ramsingh";
        String address = "gongsbu";
        byte age = 19;
        char gender = 'm';
        float plusTwoPercentage = 60;
        boolean completedPlusTwo = true;
        String fullMessage = " I am\t\t " + name  +  ".\n I am from " +  address +  ". \nI have scored " +   plusTwoPercentage;        
        System.out.println(fullMessage);
        int x =52;
        int y = 98;
        int z= 23;
        System.out.println(2*x-5*y+100*z/86);
        int totalBalance = 1376;
       int  talkedAmount = 667;
       double taxRatePercentage = 0.13;
        System.out.println("Your balance is "+totalBalance + "  with "+(totalBalance-talkedAmount)+ "due" + "   you have paid Rs"+taxRatePercentage*totalBalance+"as tax.");
        int age1 = 27;
        int a = ++age1;
        System.out.println("value of age1" +age1 +".And value of "+ a );
    }
}
