import java.util.Scanner;

public class TekCift {
    public static void main(String[] args) {

        tekCift();
    }

    private static void tekCift() {
        Scanner scan=new Scanner(System.in);


        int count=1;
        while(count<=3){
            System.out.print("Bir sayı giriniz: ");
            int number=scan.nextInt();
            if(number%2==0){
                System.out.println("Çift");
            }else {
                System.out.println("Tek");
            }

            count++;
        }


    }
}
