import java.util.Optional;

/**
 * Created by zyf on 16/7/15.
 */
public class Test {
    public static void main(String[] args) {
        Optional<Integer> num = Optional.ofNullable(1);
//        System.out.println(num.get());
        System.out.println(num.get());
    }
}
