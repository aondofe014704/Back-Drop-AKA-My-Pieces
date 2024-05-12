package NotGivingUp;

public class Seven {
    public static void main(String[] args) {
        int result = 0;
        for(int index = 1; index <= 10; index++){
            for (int count = 1; count <= 10; count++){
               result =  index += count;
                System.out.println(result);

            }
        }
    }
}
