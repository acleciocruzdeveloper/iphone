import java.util.List;

public class Ipone implements IMediea, ISafari, ITelephone{
    @Override
    public boolean play() {
        return false;
    }

    @Override
    public boolean stop() {
        return false;
    }

    @Override
    public boolean nextSound() {
        return false;
    }

    @Override
    public boolean previousSound() {
        return false;
    }

    @Override
    public void homePage() {

    }

    @Override
    public void searchPage() {

    }

    @Override
    public void historyNavigator() {

    }

    @Override
    public List<String> favoritesPage() {
        return null;
    }

    @Override
    public boolean on() {
        return false;
    }

    @Override
    public boolean call(String contact) {
        return false;
    }

    @Override
    public boolean endCall() {
        return false;
    }
}
