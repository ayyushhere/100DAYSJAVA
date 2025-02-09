import java.util.Scanner;

class powerOftwo{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no:: ");
    int n = sc.nextInt();
    System.out.println(n<1? false:(n&(n-1))==0?"yes it is in power of two.":false);
    sc.close();
}
}