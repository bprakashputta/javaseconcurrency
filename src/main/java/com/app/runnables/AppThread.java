package com.app.runnables;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppThread extends Thread{
    @Override
    public void run() {
        try(BufferedReader reader = new BufferedReader(new FileReader(new File("/home/theharrypotter1999/IdeaProjects/javaseconcurrency/src/resources/Chapter2/02_03/begin/sample.txt")))){
            String line = null;
            while((line = reader.readLine()) != null){
                System.out.println(Thread.currentThread().getName() + " reading the line : " + line);
            }
        } catch (Exception e) {
//            e.printStackTrace();
            Logger.getLogger(AppThread.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
