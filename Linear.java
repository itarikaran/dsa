import java.util.*;

public class Linear {
    public static void main(String[] args) {
        int arr[] = {4, 7, 2, 9, 5};
        int key = 9;
        int pos = -1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                pos=i;
                break;
            }
        }

        if(pos!=-1)
            System.out.println("Found at index "+pos);
        else
            System.out.println("Not Found");
    }
}
