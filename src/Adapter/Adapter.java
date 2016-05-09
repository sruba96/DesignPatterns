package Adapter;

/**
 * Created by pawel on 09.05.16.
 */
public class Adapter implements NewStandard {
    OldStandard oldStandard;

    public Adapter() {
        oldStandard = new OldStandardBuild();
    }

    @Override
    public void buildFutureBuildings() {
        oldStandard.oldBuild();
    }
}
