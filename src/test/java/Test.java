import com.github.javafaker.Faker;
import org.testng.Assert;

public class Test {
    public static void main(String[] args) {

        System.out.println("Testing");

        Assert.assertEquals(10, 10);

        Faker faker = new Faker ();
        System.out.println(faker.business().creditCardNumber());
        System.out.println(faker.address().firstName());
        System.out.println(faker.address().lastName());
        System.out.println(faker.address().streetAddress());
    }


}
