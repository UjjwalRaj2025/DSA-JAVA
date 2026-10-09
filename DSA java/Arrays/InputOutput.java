import java.util.Scanner;public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int [] arr = {5,-9,5,56,556};
        //printing each element of arr
        // System.out.println(arr[0]);
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]);
        // }
        
        //printing each element by reversing
        // for (int i = (arr.length)-1; i >= 0; i--) {
        //     System.out.print(arr[i]+" ");
        

        // //FACT AND LEARN
        // //all the element in the abouve array is default zero
        int[] raj=new int[7];
        // for (int i = 0; i < raj.length; i++) {
        //     System.out.println(raj[i]);
        // }
        
        //input 
        for (int i = 0; i < 7; i++) {
            raj[i]=sc.nextInt();

            
        }
        
        //print
        for (int i = 0; i < raj.length; i++) {
            System.out.print(2*raj[i]+" ");
        }
        sc.close();


            
        }
    }

