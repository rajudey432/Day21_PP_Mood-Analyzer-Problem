package com.bridgelabz.moodAnalyser;

public class MoodAnalyser {
    public String analyseMood(String message) {
        if (message.contains("happy")) {
            return "Happy";
        } else {
            return "Sad";
        }
    }
}

