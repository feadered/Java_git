import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

    }
    public static void main11(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] arr = new int[a*3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int count = 0,m = a;
        for (int i = arr.length-1; i >=0 ; i--) {
            if (m<=0&&m>-a){
                count = count+arr[i];
            }
            m--;
        }
        System.out.println(count);
    }
    public static void main10(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] arr1 = in.next().toCharArray();
        char[] arr2 = in.next().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int j = 0;
        int flag = 0;
        if (arr1.length<arr2.length){
            System.out.println("No");
            return;
        }
        for (int i = 0; i < arr2.length&&j<arr1.length; i++) {
            if (arr1[j]!=arr2[i]){
                flag = 1;
            }
            j++;
        }
        if (flag==0&&arr2[arr2.length-1]!=arr1[j]){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
    public static int mySqrt(int x) {
        //1.暴力解法
        // if(x==1||x==2)return 1;
        // for(long i = 0;i<x;i++){
        //     if(i*i==x)return (int)i;
        //     if(i*i>x)return (int)i-1;
        // }
        // return 0;
        //二分方式进行求解
        int left = 1;
        int right = x;
        while(left<right){
            int mid = left+(right-left)/2;
            if(mid<=left*left)left = mid+1;
            else right = mid;
        }
        return left;
    }

    public static void main9(String[] args) {
        int a = mySqrt(4);
        System.out.println(a);
    }
    public static void main8(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = n;
        double An = 0;
        double Sn = 0;
        for (int i = 0; i <a ; i++) {
            while (n>=0){
                An = An+2*Math.pow(10,n);
                n--;
            }
            Sn=Sn+An;
        }
        System.out.println((int) Sn);
    }
    public static void main7(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int Cha=0,INT=0,K=0,Oth=0;
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            if (Character.isLetter(a))Cha++;
            else if (Character.isDigit(a)) INT++;
            else if (a==' ') K++;
            else Oth++;
        }
        System.out.println(Cha+" "+INT+" "+K+" "+Oth);
    }
    public static void main6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int max=0;
        for (int i = 1; i <= a&&i<=b ; i++) {
            if (a%i==0&&b%i==0)
                max = Math.max(max,i);
        }
        System.out.println(max);
        int c = Math.max(a,b);
        for (int i = c; i <= a*b; i++) {
            if (i%a==0&&i%b==0){
                System.out.println(i);
                break;
            }
        }
    }
    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a<=100000) System.out.println((int)(a*0.1));
        else if (a>100000&&a<=200000) System.out.println((int) (10000+(a-100000)*0.075));
        else if (a>200000&&a<=400000) System.out.println((int)(10000+100000*0.075+(a-200000)*0.05));
        else if (a>400000&&a<=600000) System.out.println((int)(10000+100000*0.075+200000*0.05+(a-400000)*0.03));
        else if (a>600000&&a<=1000000) System.out.println((int)(10000+100000*0.075+200000*0.05+200000*0.03+(a-600000)*0.015));
        else {
            System.out.println((int)(10000+100000*0.075+200000*0.05+200000*0.03+400000*0.015+(a-1000000)*0.01));
        }

    }
    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int count = 0;
        int b = a;
        while (b!=0){
            //System.out.println(b%10);
            b=b/10;
            count++;
        }
        System.out.println(count);
        p(a);
//        while (c!=0){
//            System.out.print(c%10+" ");
//            c=c/10;
//        }
        System.out.println();
        b = a;
        while (b!=0){
            System.out.print(b%10);
            b=b/10;
        }
    }
    private static void p(int a){
        if (a<10){
            System.out.print(a+" ");
            return;
        }
        //a=a%10;
         p(a/10);
        System.out.print(a%10+" ");
    }
    public static void main3(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int a = scanner.nextInt();
        if (a>=90){
            System.out.println('A');
        } else if (a >= 80 && a < 90) {
            System.out.println('B');
        }else if (a>=70&&a<80){
            System.out.println('C');
        } else if (a >= 60 && a < 70) {
            System.out.println('D');
        }else {
            System.out.println('E');
        }
    }
    public static void main2(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        if (x<1) System.out.println(x);
        if (x>=1&&x<10) System.out.println(2*x-1);
        if (x>=10) System.out.println(3*x-11);
    }
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max = a;
        if(max<b)max =b;
        if(max<c)max=c;
        System.out.println(max);

    }
}
