package com.rohit.designpattern.creationaldesignpatterns.builderpattern;

public class TestRobotBuilder {

    public static void main(String[] args) {

        RobotBuilder oldStyleRobot = new OldRobotBuilder();
        RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);
        robotEngineer.makeRobot();

        Robot firstRobot = robotEngineer.getRobot();

        System.out.println(firstRobot.toString());


    }

}
