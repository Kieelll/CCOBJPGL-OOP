package Explorers;

import Planets.Earth;
import Planets.Jupiter;
import Planets.Mars;
import Planets.Mercury;
import Planets.Neptune;
import Planets.Planet;
import Planets.Saturn;
import Planets.Uranus;
import Planets.Venus;

public interface Explorer {
  void visit(Earth earth);
  
  void visit(Jupiter jupiter);

  void visit(Venus venus);

  void visit(Neptune neputune);
  
  void visit(Uranus uranus);

  void visit(Saturn saturn);

  void visit(Mars mars);

  void visit(Mercury mercury);
  
  default void visit(Planet planet){
    System.out.println("Visit on a random planet");
  }
}
