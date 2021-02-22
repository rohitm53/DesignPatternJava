package com.rohit.designpattern.structuraldesignpattern.adapter;

public class TestEnemyAttacker {

    public static void main(String[] args) {

        EnemyTank enemyTank = new EnemyTank();

        EnemyRobot enemyRobot = new EnemyRobot();

        EnemyAttacker robotAdapter  = new EnemyRobotAdapter(enemyRobot);

        System.out.println("The Robot");
        enemyRobot.reactToHuman("Rohit");
        enemyRobot.walksForward();
        enemyRobot.smashWithHands();

        System.out.println("The Enemy Tank");
        enemyTank.assignDriver("Frank");
        enemyTank.driveForward();
        enemyTank.fireWeapon();

        System.out.println("The robot with adapter");
        robotAdapter.assignDriver("Mark");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();
    }

}
