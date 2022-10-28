import java.awt.*;

public class Giant extends Critter {
    int i =0;
    public Giant() {    }
    public Color getColor() {
        return Color.GRAY;
    }
    public String toString() {
        int r = i%24;
        if (r<6) {
            return "fee";
        } else if ((r>=6)&&(r<12)) {
            return "fie";
        } else if ((r>=12)&&(r<18)) {
            return "foe";
        } else {
            return "fum";
        }
    }
    public Action getMove (CritterInfo info) {
        i++;
        if (info.frontThreat()) {
            return Action.INFECT;
        } else if (info.getFront()==Neighbor.EMPTY) {
            return Action.HOP;
        } else {
            return Action.RIGHT;
        }
    }
}
