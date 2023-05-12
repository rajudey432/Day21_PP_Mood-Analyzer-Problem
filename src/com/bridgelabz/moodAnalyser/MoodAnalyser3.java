package com.bridgelabz.moodAnalyser;

public class MoodAnalyser3 {
    public String analyseMood(String message) {
        if (message.toLowerCase().contains("sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }
}