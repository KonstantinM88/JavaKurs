package homework_22;

public class ArrayEncapsTest {

    public static void main(String[] args) {

        int[] test = {1, 2, 3, 4, 5};

        MagicArrayEncaps magic = new MagicArrayEncaps(test);
        //magic.add(10);
        System.out.println(magic.toString());

        test[3] = 1000;

    } //End
}
