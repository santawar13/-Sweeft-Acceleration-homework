import java.util.Scanner;

public class myprogram {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stearsCount = scanner.nextInt();
        System.out.println(countVariants(stearsCount));

    }
    public static int countVariants(int stearsCount){
        int[] a = new int[stearsCount+1];
        a[1]=1;
        a[2]=2;

        for(int k=3;k<=stearsCount;k++){
            a[k]=a[k-1]+a[k-2];
        }
       return a[stearsCount];
    }
}
