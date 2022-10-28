import java.awt.*;

public class NinjaCat extends Critter {
    public NinjaCat() {    }
    public Color getColor() {
        return Color.YELLOW;
    }
    public String toString() {
        return "NCat";
    }
    public Action getMove(CritterInfo info) {
        if (info.frontThreat()) {
            return Action.INFECT;
        } else if (info.getFront()==Neighbor.EMPTY) {
            return Action.HOP;
        } else {
            return Action.LEFT;
        }
    }
}
