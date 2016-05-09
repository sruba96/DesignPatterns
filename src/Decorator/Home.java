package Decorator;

/**
 * Created by pawel on 09.05.16.
 */
interface Home {
    public void build();

    public String takeInfo();
}

class SimpleHome implements Home {
    @Override
    public void build() {
        System.out.println("Build simple home");
    }

    @Override
    public String takeInfo() {
        return "Simple Home";
    }
}

class BungalowHome implements Home {
    @Override
    public void build() {
        System.out.println("Build bungalow");
    }

    @Override
    public String takeInfo() {
        return null;
    }
}

abstract class HomeDecorator implements Home {
    protected Home decoratedHome;

    public HomeDecorator(Home decoratedHome) {
        this.decoratedHome = decoratedHome;
    }

}

class HomeWithGardenDecorator extends HomeDecorator {
    public HomeWithGardenDecorator(Home decoratedHome) {
        super(decoratedHome);
    }

    public void build() {
        decoratedHome.build();
        buildWithGarden();
    }

    private void buildWithGarden() {
        System.out.println("Build with garden");
    }

    @Override
    public String takeInfo() {
        return decoratedHome.takeInfo() + "with garden";
    }
}

class HomeWithSecondFloorDecorator extends HomeDecorator {
    public HomeWithSecondFloorDecorator(Home decoratedHome) {
        super(decoratedHome);
    }

    @Override
    public void build() {
        decoratedHome.build();
        buildWithSecondFloor();
    }

    public void buildWithSecondFloor() {
        System.out.println("Build with second floor");
    }

    @Override
    public String takeInfo() {
        return "With second floor";
    }
}

