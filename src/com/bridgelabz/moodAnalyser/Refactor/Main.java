package com.bridgelabz.moodAnalyser.Refactor;

public class Main {
    public static void main(String[] args) {
        String message = "I am in Any Mood";

        MoodAnalyser moodAnalyser = new MoodAnalyser(message);
        String mood = moodAnalyser.analyseMood();

        System.out.println("Mood: " + mood);
    }
}