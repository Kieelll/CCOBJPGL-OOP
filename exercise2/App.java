import Explorers.AndroidExplorer;
import Explorers.Explorer;
import Explorers.HumanExplorer;
import Explorers.RobotExplorer;
import Planets.Earth;
import Planets.Jupiter;
import Planets.Mars;
import Planets.Mercury;
import Planets.Neptune;
import Planets.Planet;
import Planets.Saturn;
import Planets.Uranus;
import Planets.Venus;

public class App {
    public static void main(String[] args) throws Exception {
        Planet mars = new Mars();
        Planet saturn = new Saturn();
        Planet mercury = new Mercury();
        Planet neptune = new Neptune();
        Planet earth = new Earth();
        Planet venus = new Venus();
        Planet jupiter = new Jupiter();
        Planet uranus = new Uranus();

        Explorer astronaut = new HumanExplorer();
        Explorer rover = new RobotExplorer();
        Explorer Invader = new AndroidExplorer();

        mars.accept(astronaut);
        saturn.accept(astronaut);
        mercury.accept(astronaut);
        neptune.accept(astronaut);
        earth.accept(astronaut);
        venus.accept(astronaut);
        jupiter.accept(astronaut);
        uranus.accept(astronaut);


        mars.accept(rover);
        saturn.accept(rover);
        mercury.accept(rover);
        neptune.accept(rover);
        earth.accept(rover);
        venus.accept(rover);
        jupiter.accept(rover);
        uranus.accept(rover);

        mars.accept(Invader);
        saturn.accept(Invader);
        mercury.accept(Invader);
        neptune.accept(Invader);
        earth.accept(Invader);
        venus.accept(Invader);
        jupiter.accept(Invader);
        uranus.accept(Invader);
    }
}
