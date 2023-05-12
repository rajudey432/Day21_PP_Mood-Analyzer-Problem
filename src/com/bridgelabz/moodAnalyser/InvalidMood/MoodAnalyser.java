package com.bridgelabz.moodAnalyser.InvalidMood;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser() {
        this.message = "";
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if (message == null || message.isEmpty()) {
                throw new MoodAnalysisException(MoodError.INVALID_MOOD, "Invalid mood provided");
            } else if (message.toLowerCase().contains("sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalysisException(MoodError.INVALID_MOOD, "Invalid mood provided");
        }
    }
}

