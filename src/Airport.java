import java.util.ArrayList;

public class Airport {
    ArrayList<String> hanger = new ArrayList<String>();
    public Boolean land(String plane) {
        return hanger.add(plane);
    }
}
