import java.util.ArrayList;
import java.util.Scanner;

class ArrayIntersector{
    public static void Intersector(ArrayList<Integer> a,ArrayList<Integer> b){
        for (int num: a)
        {
            for (int num2: b){
                if(num==num2)
                    System.out.println(num);
            }
        }
    }
}

class Main{
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        int size;

        System.out.println("Enter size of two arrays - ");
        Scanner scan = new Scanner(System.in);
        size = scan.nextInt();

        for(int i =0; i<size; i++){
            System.out.println("Enter Array - 1's ELEMENT "+(i+1)+" - ");
            array1.add(scan.nextInt());

            System.out.println("Enter Array - 2's ELEMENT "+(i+1)+" - ");
            array2.add(scan.nextInt());
        }

        ArrayIntersector.Intersector(array1,array2);
    }
}
