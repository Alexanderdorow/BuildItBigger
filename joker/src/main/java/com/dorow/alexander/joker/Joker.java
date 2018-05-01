package com.dorow.alexander.joker;

import java.util.Random;

public class Joker {
    private static String[] jokes = new String[]{
            "Can a kangaroo jump higher than a house? Of course, a house doesn’t jump at all.",
            "Anton, do you think I’m a bad mother? My name is Paul.",
            "My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away.",
            "How do you make a tissue dance? You put a little boogie in it",
            "Why did the policeman smell bad? He was on duty",
            "Why does Snoop Dogg carry an umbrella? FO DRIZZLE",
            "Why did the policeman smell bad? He was on duty.",
            "Why does Snoop Dogg carry an umbrella? FO DRIZZLE!",
            "Why can’t you hear a pterodactyl in the bathroom? Because it has a silent pee.",
            "What did the Zen Buddist say to the hotdog vendor? Make me one with everything.",
            "What kind of bees make milk instead of honey? Boobies.",
            "Horse walks into a bar. Bartender says, “Why the long face?”",
            "I never make mistakes…I thought I did once, but I was wrong.",
            "What’s Beethoven’s favorite fruit?…Ba-na-na-naaa!",
            "What did the little fish say when he swam into a wall? DAM!",
            "Where does a sheep go for a haircut? To the baaaaa baaaaa shop!",
            "What does a nosey pepper do? Gets jalapeno business!"
    };

    public static String getJoke() {
        int index = new Random().nextInt(17);
        return jokes[index];
    }


}
