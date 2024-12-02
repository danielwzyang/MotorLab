package com.stuypulse.robot.commands;

import com.stuypulse.robot.util.Motor;

public class DriveFunctions {
    
    public static void driveForwards(Motor left, Motor right) {
        left.set(1);
        right.set(1);
    }

    public static void driveBackwards(Motor left, Motor right) {
        left.set(-1);
        right.set(-1);
    }

    public static void turnRight(Motor left, Motor right) {
        left.set(1);
    }

    public static void turnLeft(Motor left, Motor right) {
        right.set(1);
    }

    public static void arcRight(Motor left, Motor right) {
        left.set(1);
        right.set(0.5);
    }

    public static void arcLeft(Motor left, Motor right) {
        left.set(0.5);
        right.set(1);
    }

    public static void stopDistance(Motor left, Motor right) {
        int setpoint = 60;
        while (left.getDistance() < setpoint)
            driveForwards(left, right);
    }

    public static void bangBang(Motor left, Motor right) {
        int setpoint = 60;
        while (left.getDistance() < setpoint)
            driveForwards(left, right);
        while (left.getDistance() > setpoint)
            driveForwards(left, right);
    }

    public static void lessBang(Motor left, Motor right) {}

    public static void betterControl(Motor left, Motor right) {}

    public static void bestestControl(Motor left, Motor right) {}
}
