package array;

public class Main {
    public static void main(String[] args) {

        //Cú pháp khai báo mảng
        int[] array;
        short[] array1;

        //Không khuyến khích
        byte array3[];

        //Khởi tạo mảng 1 chiều
        int[] arr = new int[10]; //Mảng có n phần tử
        String b[] = new String[10];

        //Thao tác với các phẩn tử của mảng 1 chiều
        //Gán: <nameArr>[vị trí] = value
//        arr[0] = 1;
        for(int i = 0; i< arr.length; i++){
            arr[i] = i;
        }

        //In phần tử
        for(int  i : arr){
            System.out.println(i);
        }
    }

}
