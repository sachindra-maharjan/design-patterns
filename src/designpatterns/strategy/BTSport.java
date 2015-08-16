/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.strategy;

/**
 *
 * @author sachindra
 */
public class BTSport implements ChannelTuner {
    @Override
    public void showCurrentProgram() {
        System.out.println("Current Match: Manchester City Vs Chelsea");
    }

    @Override
    public void showScheduleOfToday() {
        System.out.println("List of programs BTSport today");
    }
}
