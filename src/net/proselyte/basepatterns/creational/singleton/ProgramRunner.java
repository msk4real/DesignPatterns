package net.proselyte.basepatterns.creational.singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLoggerInstance().addLogInfo("First log...");
        ProgramLogger.getProgramLoggerInstance().addLogInfo("Second log...");
        ProgramLogger.getProgramLoggerInstance().addLogInfo("Third log...");

        ProgramLogger.getProgramLoggerInstance().showLogFile();
    }
}
