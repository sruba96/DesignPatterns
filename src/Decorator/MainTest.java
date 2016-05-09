package Decorator;

/**
 * Created by pawel on 09.05.16.
 */
public class MainTest {


    public static void main(String[] args) {

        Home home = new SimpleHome();
        home.build();
        home.takeInfo();

        home = new HomeWithGardenDecorator(home);
        home.build();
        home.takeInfo();

        home = new HomeWithSecondFloorDecorator(home);
        home.build();
        home.takeInfo();

        System.out.println(" ");

        home = new BungalowHome();
        home = new HomeWithSecondFloorDecorator(new HomeWithGardenDecorator(home));
        home.build();

    }
}
