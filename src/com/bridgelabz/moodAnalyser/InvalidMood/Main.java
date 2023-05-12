package com.bridgelabz.moodAnalyser.InvalidMood;

public class Main {
    public static void main(String[] args) {
        String message = null;

        MoodAnalyser moodAnalyser = new MoodAnalyser(message);
        try {
            String mood = moodAnalyser.analyseMood();
            System.out.println("Mood: " + mood);
        } catch (MoodAnalysisException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Error Type: " + e.getError());
        }
    }
}
