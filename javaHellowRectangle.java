import java.util.Scanner;

public class javaHellowRectangle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rows : ");
        int rows = input.nextInt();
        System.out.print("Enter column : ");
        int column = input.nextInt();

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=column;j++){
                if(i==1||i==rows||j==1||j==column){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}