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
public class ChannelChooser {
    
    ChannelTuner channelTuner;
    
    public ChannelChooser(){}
    public ChannelChooser(ChannelTuner channelTuner){
        this.channelTuner = channelTuner;
    }
    
    public void showCurrentProgram(){
        channelTuner.showCurrentProgram();
    }
    
    public void showScheduleOfToday(){
        channelTuner.showScheduleOfToday();
    }
}
