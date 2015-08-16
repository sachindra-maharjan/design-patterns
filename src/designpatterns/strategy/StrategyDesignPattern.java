/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.strategy;

import java.util.Scanner;


/**
 *
 * @author sachindra
 */
public class StrategyDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int channelNumber = scanner.nextInt();
        ChannelChooser cc;
        
        switch(channelNumber){
            case 1:
                cc = new ChannelChooser(new StarSport());
                cc.showCurrentProgram();
                cc.showScheduleOfToday();
                break;
                
            case 2:
                cc = new ChannelChooser(new FoxSport());
                cc.showCurrentProgram();
                cc.showScheduleOfToday();
                break;
                
            case 3:
                cc = new ChannelChooser(new BTSport());
                cc.showCurrentProgram();
                cc.showScheduleOfToday();
                break;
            default:
                cc = new ChannelChooser(new StarSport());
                cc.showCurrentProgram();
                cc.showScheduleOfToday();
                 break;
        
        }
        
       
        
        
    }
    
}
