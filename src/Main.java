public class Main {
    public static void main(String[] args) {

        int number = 123455678;

       /* int length = 0;

        int temp = number;

        while(temp > 0){
            length++;
            temp = temp/10;
        }

        System.out.println("Length of number " + number + " = " + length);*/

        boolean withoutRepet = true;

        for (int i = number % 10; i > 0; i = number % 10) {

            int copy = number / 10;

            while (copy > 0) {
                if(i == copy % 10) {
                    withoutRepet = false;
                    break;
                }
                copy = copy / 10;
            }

            number /= 10;
        }

        System.out.println(withoutRepet);
    }
}