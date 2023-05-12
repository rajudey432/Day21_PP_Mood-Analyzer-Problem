package com.bridgelabz.moodAnalyser.HandleExeption;

public class Main {
    public static void main(String[] args) {
        String message = null;

        MoodAnalyser moodAnalyser = new MoodAnalyser(message);
        String mood = moodAnalyser.analyseMood();
        System.out.println("Mood: " + mood);
    }
}