package com.bridgelabz.moodAnalyser.HandleExeption;

public class Main {
    public static void main(String[] args) {
        String message = null;

        MoodAnalyser moodAnalyserWithMessage = new MoodAnalyser(message);
        String moodWithMessage = moodAnalyserWithMessage.analyseMood();
        System.out.println("Mood with message: " + moodWithMessage);

        MoodAnalyser moodAnalyserWithoutMessage = new MoodAnalyser();
        String moodWithoutMessage = moodAnalyserWithoutMessage.analyseMood();
        System.out.println("Mood without message: " + moodWithoutMessage);
    }
}