import java.util.Scanner;

public class BiletHesaplama {
    public static void main(String[] args) {

        int km,age,ttyp;
        Scanner scan =new Scanner(System.in);

        System.out.print("L�tfen yol uzunlu�unu km �zerinden giriniz: ");
        km= scan.nextInt();

        System.out.print("l�tfen ya��n�z� giriniz: ");
        age= scan.nextInt();

        System.out.print("1-Tek Y�n \n2-Gidi� D�n�� \nL�tfen yolculuk tipini se�iniz: ");
        ttyp= scan.nextInt();

        double normalTutar= 0.1*km;

        if (ttyp==2) {
            normalTutar=normalTutar*0.8*2;
        }if (age <1 || ttyp>2 || ttyp<1 || km<1) {
            System.out.println("Hatal� veri girdiniz!");
        } else if (age <12) {
            System.out.println("�demeniz gereken tutar: " +normalTutar*0.5+ " TL");
        } else if (age >=12 && age <24) {
            System.out.println("�demenzi gereken tutar: "+normalTutar*0.9+ " TL");
        } else if (age >=65) {
            System.out.println("�demeniz gereken tutar: "+normalTutar*0.7 + " TL" );
        } else {
        System.out.println("�demeniz gereken normal tutar: " +normalTutar +" TL");
    }}
}
