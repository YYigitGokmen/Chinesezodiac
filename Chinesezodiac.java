import java.util.Scanner;



public class Chinesezodiac {
public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

    int brth;
    int zodiac;
    System.out.print("Doğum Tarihinizi Yıl Olarak Giriniz: ");
    brth = scan.nextInt();
    zodiac = brth%12;


 if(brth>0 && brth<2050) {


     switch (zodiac) {

         case 0:
             System.out.print("Çin Zodyağınız Maymundur");
             break;
         case 1:
             System.out.print("Çin Zodyağınız Horozdur");
             break;
         case 2:
             System.out.print("Çin Zodyağınız Köpekdir");
             break;
         case 3:
             System.out.print("Çin Zodyağınız  Domuzdur");
             break;
         case 4:
             System.out.print("Çin Zodyağınız  Faredir");
             break;
         case 5:
             System.out.print("Çin Zodyağınız  Öküzdür");
             break;
         case 6:
             System.out.print("Çin Zodyağınız  Kaplandır");
             break;
         case 7:
             System.out.print("Çin Zodyağınız  Tavşandır");
             break;
         case 8:
             System.out.print("Çin Zodyağınız  Ejderhadır");
             break;
         case 9:
             System.out.print("Çin Zodyağınız  Yılandır");
             break;
         case 10:
             System.out.print("Çin Zodyağınız  Atdır");
             break;
         case 11:
             System.out.print("Çin Zodyağınız  Koyundur");
             break;
             }
        } else {
     System.out.print("Yanlış Doğum Tarihi Girdiniz");
 }
    }
}
