package RankCalculator;

public class Rank {
    // Initializes the field mark as double;
    double mark;

    // Constructor for our class field
    public Rank(double m)
    {
        mark = m;
    }

    //Function to return the students rank based off of their grade
    public String getRank()
    {
        // Initializes the string as null to be changed as the function iterates
        String m = null;
        // Declares the variable score for switch, converts mark from double to int
        // Divides the new int mark by 10
        var scr = (int)(mark/10);

        //switch statement
        switch (scr)
        {
            // Score between 0-49
            case 0, 1, 2, 3, 4:
                m = "Unacceptable";
                break;
            // Score between 50-59
            case 5, 6:
                m = "Below Expectations";
                break;
            // Score between 70-89
            case 7, 8:
                m = "Meets Expectations";
                break;
            // Score between 90+
            case 9:
                m = "Exceeds Expectations";
                break;
        }
        return m;
    }
}
