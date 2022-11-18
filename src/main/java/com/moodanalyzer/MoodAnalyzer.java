package com.moodanalyzer;

import com.moodanalyzer.exception.MoodAnalysisException;

public class MoodAnalyzer {
    private String msg;
    public MoodAnalyzer(String msg) {
        this.msg = msg;
    }
    public void analyseMood(String msg) throws MoodAnalysisException {
        this.msg = msg;
        analyseMood();
    }

    public String analyseMood() throws MoodAnalysisException{
        try {
            if(msg.length()==0)
                throw new MoodAnalysisException(MoodAnalysisException.exceptionType.EMPTY,"Enter exact mood");
            if(msg.contains("SAD"))
                return "SAD";
            else
                return "HAPPY";
        }
        catch (NullPointerException e){
            throw new MoodAnalysisException(MoodAnalysisException.exceptionType.NULL,"Enter exact mood");
        }
    }
}
