package array;

public class FunctionArray {
    //Lưu ý: Khi truyền mảng vào hàm sẽ làm thay đổi dữ lệu trực tiếp vào mảng và giữ nguyên giá trị thay đổi
    public static void main(String[] args) {
        int[] arr = input();
        display(arr);
    }

    static int[] input(){
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }

    static void display(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}

