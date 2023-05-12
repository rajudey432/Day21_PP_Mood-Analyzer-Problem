package com.bridgelabz.moodAnalyser.InvalidMood;

public class MoodAnalysisException extends Exception {
    private final MoodError error;

    public MoodAnalysisException(MoodError error, String message) {
        super(message);
        this.error = error;
    }

    public MoodError getError() {
        return error;
    }
}
