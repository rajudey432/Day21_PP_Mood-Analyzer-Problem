package com.bridgelabz.moodAnalyser.HandleExeption;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser() {
        this.message = "";
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() {
        try {
            if (message == null) {
                return "Happy";
            } else if (message.toLowerCase().contains("sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            return "Invalid mood provided";
        }
    }
}