import java.util.Scanner;  

public class Automaatti {
    public static void main(String args[] ) {
        //tilin saldo :(
        int balance = 500, withdraw;

        Scanner sc = new Scanner(System.in);
          
        while(true) {
            System.out.println("Pankkiautomaatti");
            System.out.println("Paina 1 nostaaksesi rahaa");
            System.out.println("Paina 2 tarkistaaksesi tilisi saldo");
            System.out.println("Paina 3 lopettaaksesi");
              
            //ottaa vaihtoehdon minkä käyttäjä laittaa
            int vaihtoehto = sc.nextInt();

            switch(vaihtoehto) {
            case 1:
            System.out.print("Kuinka paljon haluat nostaa rahaa?");
                      
            //ottaa noston
            withdraw = sc.nextInt();
                      
            //katotaan että riittääkö fyrkka
            if(balance >= withdraw) {  
            //poistaa nostomäärän saldosta 
            balance = balance - withdraw;  
            System.out.println("Ottakaa rahanne");
            } 
            else {  
            //error viesti 
            System.out.println("Ei riitä rahat :(");
            }  
            System.out.println("");  
            break;

            case 2:
            //nayttaa tilin saldon
            System.out.println("Tilin saldo: "+balance);
            System.out.println("");
            break;
   
            case 3:
            //exit
            System.exit(0); }
              
        }  
    }  
}
