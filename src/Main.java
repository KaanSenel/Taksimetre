import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        double acilisUcreti=10.0;
        double kmUcreti=2.20;
        int gidilenKm;
        double odenecekUcret;
        Scanner input= new Scanner(System.in);

        System.out.println("TAKSİMETRE PROGRAMI");
        System.out.println("-------------------");

        System.out.print("Gidilen mesafe kaç kilometre : ");
        gidilenKm=input.nextInt();

        odenecekUcret=acilisUcreti+(gidilenKm*kmUcreti);
        if(odenecekUcret<20)
            odenecekUcret=20;

        System.out.println("Ödenecek tutar: "+odenecekUcret);
    }
}
