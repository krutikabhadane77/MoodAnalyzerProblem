package com.moodanalyzer.exception;

public class MoodAnalysisException extends Exception {
    public exceptionType type;

    public MoodAnalysisException(exceptionType type, String msg) {
        super(msg);
        this.type = type;
    }
    public enum exceptionType {
        EMPTY, NULL
    }
}
