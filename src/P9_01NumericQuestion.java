/**   File: P9_01
 * Purpose: Add a class NumericQuestion to the Question Hieararchy;
 */

public class P9_01NumericQuestion extends Question{
    private double answer;

    public void setAnswer(double crctResponse){
        answer = crctResponse;
    }

    public boolean checkAnswer(String r){
        double resDbl = Double.parseDouble(r);
        return Math.abs(resDbl - answer) <= 0.01;
    }
}

