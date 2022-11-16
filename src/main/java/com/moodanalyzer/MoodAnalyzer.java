package com.moodanalyzer;

public class MoodAnalyzer {
    private String msg;
    public MoodAnalyzer(String msg) {
        this.msg = msg;
    }

    public String analyseMood() {
        if(msg.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
