import java.util.*;

public class NoMove implements MoveStrategy {

    @Override
    public Cell chooseNextLoc(List<Cell> possibleLocs) {
        return possibleLocs.get(0);
    }

    @Override
    public String toString(){
        return "NEIN NEIN NEIN";
    }

}