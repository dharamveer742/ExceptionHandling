package Handling;

import java.util.Scanner;

public class ExceptionInArray {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int arr[]= new int[n];
        try{
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(sc.next());
            }
            System.out.println("Enter the index");
            int in=sc.nextInt();
            System.out.println(arr[in]);
        }
        catch (NumberFormatException d){
            System.out.println("Number format exception occured");

        }
        catch(IndexOutOfBoundsException p){
            System.out.println(p);
        }
    }
}
