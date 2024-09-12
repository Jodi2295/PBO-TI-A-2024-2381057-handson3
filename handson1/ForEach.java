package handson1;

public class ForEach {
    public static void main(String[] args) {
        String[] buah = new String[] {"Apel", "Pisang", "Mangga", "Jeruk"};
        for(String namaBuah : buah){
            if(namaBuah.equals("Mangga") || namaBuah.equals("Jeruk"))
                continue;
            System.out.println(namaBuah);
        }

        for(String namaBuah : buah){
            if (namaBuah.equals("Mangga"))
            break;
            System.out.println(namaBuah);
        }
    }
}