package handson3;

public class WhileLoop3 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 20){
            if (i > 15){
                break;
            }

            if(i % 3 == 0){
                i++;
                continue;
            }

            System.out.println(i);
            i++;
        }
    }
}
