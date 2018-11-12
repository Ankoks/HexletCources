package ru.ankoks.concurrency.m2.e0.ex;

/**
 * User: ankoks
 * Date: 09.11.2018
 */
public class CopyController {
    public static <T extends IPrinter & IScanner> void copy(T device) {
        String scan = device.scan();
        device.print(scan);
    }
}
