package com.moodanalyzer;

public class MoodAnalyzer {
    private String msg;
    public MoodAnalyzer(String msg) {
        this.msg = msg;
    }
    public String analyseMood() {
        try {
            if(msg.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        }
        catch (NullPointerException e){
            return "Happy";
        }
    }
}
