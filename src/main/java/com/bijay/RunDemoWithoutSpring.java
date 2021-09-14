package com.bijay;

import com.bijay.entities.*;

public class RunDemoWithoutSpring {

    public static void main(String[] args){
        Team manchesterUnited = new ManchesterUnited();
        Team realMadrid = new RealMadrid();
        Game game = new FootBallGame(manchesterUnited, realMadrid);
        System.out.println(game.playGame());
    }

}
