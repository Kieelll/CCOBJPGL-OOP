package Explorers;

import Planets.Earth;
import Planets.Jupiter;
import Planets.Mars;
import Planets.Mercury;
import Planets.Neptune;
import Planets.Saturn;
import Planets.Uranus;
import Planets.Venus;

public class HumanExplorer implements Explorer {

    @Override
    public void visit(Earth earth) {
        System.out.println("Try visiting earth");
        
    }

    @Override
    public void visit(Jupiter jupiter) {
        System.out.println("Try visiting Jupiter");
        
    }

    @Override
    public void visit(Venus venus) {
        System.out.println("Try visiting Venus");
        
    }

    @Override
    public void visit(Neptune neputune) {
        System.out.println("Try visiting Neptune");
        
    }

    @Override
    public void visit(Uranus uranus) {
        System.out.println("Try visiting Uranus");
        
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("Try visiting Saturn");
        
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("Try visiting Mars");
        
    }

    @Override
    public void visit(Mercury mercury) {
        System.out.println("Try visiting Mercury");
        
    }

}
