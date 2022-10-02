public class Test {
    long sum(int[] a) {
        long ans = 0;

            for(int i = 0; i < a.length; i++) {
                ans += a[i];
            }
           

        return ans;
    }
}

public class p15596 {

//class 안에 있는 함수를 메서드라고 한다
//     public static void main(String[] args) {

//         Test test = new Test();

//         int arr1[] = {0, 1, 2 ,3};
//         System.out.println(test.sum(arr1));
//         //test.sum;  ==> 6


//     }



// }