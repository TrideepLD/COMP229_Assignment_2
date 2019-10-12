import java.util.*;

public interface MoveStrategy{
    public Cell chooseNextLoc(List<Cell> possibleLocs);
}