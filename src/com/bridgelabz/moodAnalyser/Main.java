package com.bridgelabz.moodAnalyser;

public class Main {
    public static void main(String[] args) {
        String message = "I am in Any Mood";

        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood(message);

        System.out.println("Mood: " + mood);
    }
}