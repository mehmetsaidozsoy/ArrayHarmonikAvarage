
public class ArrayHarmonikAvarage {
    
public static void main(String[] args) {

    int[] arr= {1, 2, 3, 4, 5};

    double revSum=0.0;

    for(int i=0; i<arr.length; i++){
        revSum=revSum+(1.0/arr[i]);
        //System.out.println("i:"+i);
        //System.out.println("1/i:"+1.0/arr[i]);

    }
    System.out.println(arr.length);
    System.out.println("revSum:"+revSum);
    System.out.println("Sonuç :"+arr.length/revSum);
}
}