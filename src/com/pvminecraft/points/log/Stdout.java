package com.pvminecraft.points.log;

import com.pvminecraft.points.Config;

public class Stdout {

    /*
     * Print text with log level. Uses config to filter
     */
    public static void println(String message, Level lvl) {
        if(lvl == Level.DEBUG && !Config.debugging.getBoolean())
            return;
        if(lvl == Level.ERROR)
            System.err.println(lvl.getPrefix() + " " + message);
        else
            System.out.println(lvl.getPrefix() + " " + message);
    }
}
