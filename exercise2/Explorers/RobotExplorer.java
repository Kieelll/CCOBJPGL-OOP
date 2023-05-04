package Explorers;

import Planets.Earth;
import Planets.Jupiter;
import Planets.Mars;
import Planets.Mercury;
import Planets.Neptune;
import Planets.Saturn;
import Planets.Uranus;
import Planets.Venus;

public class RobotExplorer implements Explorer{


    @Override
    public void visit(Earth earth) {
        System.out.println("Robot generate randomizer... we are going to earth");
        
    }

    @Override
    public void visit(Jupiter jupiter) {
        System.out.println("Robot generate randomizer... we are going to Jupiter");
        
    }

    @Override
    public void visit(Venus venus) {
        System.out.println("Robot generate randomizer... we are going to Venus");
        
    }

    @Override
    public void visit(Neptune neputune) {
        System.out.println("Robot generate randomizer... we are going to Neptune");
        
    }

    @Override
    public void visit(Uranus uranus) {
        System.out.println("Robot generate randomizer... we are going to Uranus");
        
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("Robot generate randomizer... we are going to Saturn");
        
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("Robot generate randomizer... we are going to Mars");
        
    }

    @Override
    public void visit(Mercury mercury) {
        System.out.println("Robot generate randomizer... we are going to Mercury");
        
    }
    
}
