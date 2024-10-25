import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hi this is CBSE Percentage Calculator Programm");
        System.out.println("Enter marks in Hindi");
        int Hindi = sc.nextInt();
        System.out.println("Enter marks in English");
        int English=sc.nextInt();
        System.out.println("Enter marks in Maths");
        int Maths=sc.nextInt();
        System.out.println("Enter marks in Science");
        int Science=sc.nextInt();
        System.out.println("Enter marks in SST");
        int SST=sc.nextInt();
        int total=Hindi+English+Maths+Science+SST;
        int maxmarks=500;
        double result=(total/(double) maxmarks)*100;
        System.out.println("You get "+result+" %");
        System.out.println("Thanks for using");
    }
}