package com.bridgelabz.LogicalPrograms;

import java.time.Duration;
import java.time.Instant;

public class Stopwatch {
    public static void main(String[] args){
        try {
            Instant start = Instant.now();
            System.out.println("Stopwatch started at " + start);
            Thread.sleep(1000);
            Instant stop = Instant.now();
            System.out.println("Stopwatch stopped at " + stop);
            double elapsedTime = Duration.between(start, stop).toMillis();
            System.out.println("Elapsed time is " + elapsedTime);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
