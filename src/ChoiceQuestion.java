public class ChoiceQuestion extends Question {
    private int nChoices;

    public ChoiceQuestion(){
        super();
    }

    public void addChoice(String choice, boolean correct){
        nChoices += 1;
        super.setText(String.format("\n%d) %s", nChoices, choice));
        if(correct){
            String choiceStr = "" + nChoices;
            setAnswer(choiceStr);
        }
    }

    public String toString(){
        return getClass().getName();
    }
}
