package project1;

import java.util.List;

public class Survey {
    public static void main(String[] args) {
        SurveyPreparing survey=new SurveyPreparing();
       List<SurveyQuestions> mySurvey=survey.prepSurvey(3);
       survey.startSurvey(mySurvey);
    }

}
