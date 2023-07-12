import java.util.ArrayList;
import java.util.List;
import java.util.Random;
//Пусть дан произвольный список целых чисел, удалить из него четные числа
public class Les41 {
    public static void main(String[] args) {
        List<Integer> numbers = generateRandomNambers(10,1,100);
        System.out.println(numbers);
        List<Integer> nambersRemove = removeEvenNumbers(numbers);
        System.out.println(nambersRemove);
    }

    public static List<Integer> generateRandomNambers (int count,int min, int max) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 1; i < count; i++){
            int randomNumber = random.nextInt(max - min + 1) + min;
            numbers.add(randomNumber);
        }
        return numbers;
    }
    public static List<Integer>   removeEvenNumbers(List<Integer> numbers){
        List<Integer> nambersRemove = new ArrayList<>();
        for (Integer number: numbers){
            if (number % 2 != 0){
                nambersRemove.add(number);
            }
        }
        return nambersRemove ;
    }
    
}
