import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        String[] dersler = {"Matematik","Fizik","Kimya","Türkçe","Müzik"};
        int[] notlar = new int[5];

        Scanner scanner = new Scanner(System.in);
        int sum=0;
        for (int i=0; i<dersler.length; i++) {
            System.out.println(dersler[i] + " notunu giriniz : ");
            notlar[i]=scanner.nextInt();
            sum+=notlar[i];
            if(i== dersler.length-1){
                System.out.println("Not Ortalamanız : " + sum / dersler.length);
            }
        }


    }
}
