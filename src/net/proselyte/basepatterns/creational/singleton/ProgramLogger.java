package net.proselyte.basepatterns.creational.singleton;

public class ProgramLogger {
    private static volatile ProgramLogger programLogger;
    private static String logFile = "This is log file. \n\n";

    private ProgramLogger(){

    }

    public static ProgramLogger getProgramLogger(){
        if(programLogger == null){
            synchronized (ProgramLogger.class){
                if (programLogger == null){
                    programLogger = new ProgramLogger();
                }
            }
        }

        return programLogger;
    }

    public void addLogInfo(String logInfo){
        logFile += logInfo + "\n";
    }

    public void showLogFile(){
        System.out.println(logFile);
    }
}