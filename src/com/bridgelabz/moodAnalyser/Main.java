package com.bridgelabz.moodAnalyser;

public class Main {
    public static void main(String[] args) {
        String message = "I am feeling sad today!";

        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood(message);

        System.out.println("Mood: " + mood);
    }
}
