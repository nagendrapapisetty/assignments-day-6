package com.bridgelabz.demo;
import java.util.Scanner;
public class stopWatch {
        public long startTimer=0;
        public long stopTimer=0;
        public long elapsed;

        //to start timer
        public void start()
        {
            startTimer=System.currentTimeMillis();
            System.out.println("Start Time is: "+startTimer);
        }

        // to stop timer
        public void stop()
        {
            stopTimer=System.currentTimeMillis();
            System.out.println("Stop Time is: "+stopTimer);
        }

        public long getElapsedTime()
        {
            elapsed=stopTimer-startTimer;
            return elapsed;
        }

        public static void main(String[] args) throws Exception
        {
            Scanner r=new Scanner(System.in);
            stopWatch sw=new stopWatch();
            System.out.println("Press '1' to Start Time: ");
            r.nextInt();
            sw.start();

            System.out.println();
            System.out.println("Press '2' to Stop Time: ");
            r.nextInt();
            sw.stop();

            long l=sw.getElapsedTime();
            System.out.println();
            System.out.println("Total Time Elapsed(in millisec) is:"+l);
            System.out.println();
            System.out.println("Converting millisec to seconds: "+(l/1000)+" sec");
        }
    }

