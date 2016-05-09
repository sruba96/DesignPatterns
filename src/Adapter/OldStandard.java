package Adapter;

/**
 * Created by pawel on 09.05.16.
 */
public interface OldStandard {
    public void oldBuild();
}

class OldStandardBuild implements OldStandard {
    @Override
    public void oldBuild() {
        System.out.println("Very good foundations");
    }
}
