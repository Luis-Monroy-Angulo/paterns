package com.example.paterns.strategy.robot;

/**
 *
 * @author alejo
 */
public class FightBehavior implements RobotBehavior {

    @Override
    public int moveCommand() {
        return 1;
    }    
        
    @Override
    public String toString() {
        return "Fight Behaviour: if find another robot fight ";
    }
        
    
    
}
