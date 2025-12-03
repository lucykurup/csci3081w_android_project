package com.example.affirmationapp;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class AffirmationData {
    private static final List<String> AFFIRMATIONS = Arrays.asList(
            "You are worthy of love and respect.",
            "Your potential is limitless.",
            "You are capable of achieving your goals.",
            "Today is full of possibilities.",
            "You deserve happiness and success.",
            "Your smile brightens the world.",
            "You are stronger than you think.",
            "Your kindness makes a difference.",
            "You are a work in progress, and that's okay.",
            "Every day is a fresh start.",
            "You are enough, just as you are.",
            "Your dreams are valid and important.",
            "You have the power to create change.",
            "You are growing and improving every day.",
            "Your voice matters.",
            "You are deserving of rest and care.",
            "You bring joy to those around you.",
            "Your past doesn't define your future.",
            "You are brave for trying.",
            "You are capable of amazing things."
    );

    private static final Random random = new Random();

    public static String getRandomAffirmation() {
        return AFFIRMATIONS.get(random.nextInt(AFFIRMATIONS.size()));
    }
}
