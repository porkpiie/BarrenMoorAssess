public abstract class Gameplay {

    private int horizontalPosition = 0;
    private int verticalPosition = 0;

    private int horizontalInt = (int)(5 * Math.random());
    private int verticalInt = (int)(5 * Math.random());

    private int creatureX;
    private int creatureY;

    private int holeX;
    private int holeY;

    private int bogX;
    private int bogY;

    public void makeCreature()
    {
        creatureX = (int)(5 * Math.random());
        creatureY = (int)(5 *Math.random());

        if(creatureX == horizontalInt && creatureY == verticalInt)
        {
            makeCreature();
        }
    }

    public boolean eatenByCreature()
    {
        if (horizontalPosition == creatureX && verticalPosition == creatureY)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void makeDeepBog()
    {

        bogX = (int)(5 * Math.random());
        bogY = (int)(5 * Math.random());
        if(bogX == horizontalInt && bogY == verticalInt)
        {
            Pit();
        }
    }

    public boolean stuckInBog()
    {
        if (horizontalPosition == bogX && verticalPosition == bogY)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void Pit()
    {

        holeX = (int)(5 + Math.round(10 * Math.random()));
        holeY = (int)(5 + Math.round(10 * Math.random()));
        if(holeX == horizontalInt && holeY == verticalInt)
        {
            Pit();
        }
    }

    public boolean fellInPit()
    {
        if (horizontalPosition == holeX && verticalPosition == holeY)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void resetPlayerPosition()
    {
        horizontalPosition = 0;
        verticalPosition = 0;
    }


    public void printDialReading()
    {
        int horizontalDifference = horizontalInt - horizontalPosition;
        int verticalDifference = verticalInt - verticalPosition;
        double reading = Math.sqrt(horizontalDifference*horizontalDifference+verticalDifference*verticalDifference);
        System.out.println("The dial reads '" + reading + "m'");
    }

    public boolean isComplete()
    {
        if( horizontalPosition == horizontalInt && verticalPosition == verticalInt)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void moveNorth()
    {
        verticalPosition += 1;
        printDialReading();
    }
    public void moveSouth()
    {
        verticalPosition -= 1;
        printDialReading();
    }
    public void moveEast()
    {
        horizontalPosition += 1;
        printDialReading();
    }
    public void moveWest()
    {
        horizontalPosition -= 1;
        printDialReading();
    }
}