package ru.x5.logertask.logfactory;

import ru.x5.logertask.logger.ConsoleLogger;
import ru.x5.logertask.logger.Log;


public class ConsoleLogFactory extends LogFactory {
    @Override
    public Log createLog() {
        return ConsoleLogger.getInstance();
    }
}
