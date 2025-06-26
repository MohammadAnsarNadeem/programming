import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("abc", "bbc","abc", "obc", "obc");
        System.out.print(inputList.stream().distinct().collect(Collectors.toList()));
    }
}
