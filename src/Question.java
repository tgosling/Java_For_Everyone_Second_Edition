public class Question {
    private String text;
    private String answer;

    public Question(){
        text = "";
        answer = "";
    }

    public void setText(String qstnTxt){
        text = qstnTxt;
    }

    public void setAnswer(String crctResp){
        answer = crctResp.toLowerCase();
    }

    public boolean checkAnswer(String response){
        return response.toLowerCase().equals(answer);
    }

    public void display(){
        System.out.println(text);
    }
}
