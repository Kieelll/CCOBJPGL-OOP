package Explorers;

import Planets.Earth;
import Planets.Jupiter;
import Planets.Mars;
import Planets.Mercury;
import Planets.Neptune;
import Planets.Saturn;
import Planets.Uranus;
import Planets.Venus;

public class AndroidExplorer implements Explorer {

    @Override
    public void visit(Earth earth) {
        System.out.println("Android trying to invade earth");
        
    }

    @Override
    public void visit(Jupiter jupiter) {
        System.out.println("Android trying to invade Jupiter");
        
    }

    @Override
    public void visit(Venus venus) {
        System.out.println("Android trying to invade Venus");
        
    }

    @Override
    public void visit(Neptune neputune) {
        System.out.println("Android trying to invade Neptune");
        
    }

    @Override
    public void visit(Uranus uranus) {
        System.out.println("Android trying to invade Uranus");
        
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("Android trying to invade Saturn");
        
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("Android trying to invade Mars");
        
    }

    @Override
    public void visit(Mercury mercury) {
        System.out.println("Android trying to invade Mercury");
        
    }
    
}
