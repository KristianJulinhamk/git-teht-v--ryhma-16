import java.util.Scanner;  

public class Automaatti {
    public static void main(String args[] ) {

        // Pankkiautomaatti ohjelma RYHMA 16

        int balance = 500, withdraw;            // Muuttujat balance(Tilin saldo) ja withdraw

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Pankkiautomaatti");
            System.out.println("Paina 1 nostaaksesi rahaa");
            System.out.println("Paina 2 tarkistaaksesi tilisi saldo");
            System.out.println("Paina 3 lopettaaksesi");

            int vaihtoehto = sc.nextInt();      // Tallennetaan kayttajan syote muuttujaan vaihtoehto

            switch(vaihtoehto) {                // Switch valitaan vaihtoehto 1,2,3

            case 1:                             // CASE 1. Kysytaan kayttajan haluama rahamaara.
            System.out.print("Kuinka paljon haluat nostaa rahaa?");
            withdraw = sc.nextInt();            // Luetaan syote ja tallennetaan muuttujaan withdraw

            if(balance >= withdraw) {           // Tarkistetaan riittaako rahat. 
            balance = balance - withdraw;       // Vahennetaan nostettu rahamaara saldosta.
            System.out.println("Ottakaa rahanne");
            } 
            else {                              // Mikali rahat ei riita.
            System.out.println("Ei riitä rahat :(");
            }  
            System.out.println("");  
            break;


            case 2:                             // CASE 2. Tulostetaan tilin saldo.
            System.out.println("Tilin saldo: "+balance);
            System.out.println("");
            break;


            case 3:                             // CASE 3. Lopetus. EXIT
            System.exit(0); 

            default: // Mikäli valinta ei ole 1, 2 tai 3
                System.out.println("Virheellinen valinta! Anna numero 1, 2 tai 3");
                System.out.println("");
                break;
            }
        }  
    }  
}
