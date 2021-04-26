package com.app.runnables;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppRunnable implements Runnable{
    @Override
    public void run() {
        throw new UnsupportedOperationException("Not Supported yet");
    }

    public static void main(String[] args) {
        AppRunnable runnable = new AppRunnable();
    }
}
