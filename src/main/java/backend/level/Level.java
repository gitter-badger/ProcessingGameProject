package backend.level;

import backend.GameEngine;
import backend.actor.Actor;
import backend.actor.Player;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import userinterface.GUIHandler;

/**
 * Super class for all levels in the game.
 *
 * @author Kristian Honningsvag.
 */
public abstract class Level {

    public static java.util.logging.Level SEVERE;

    protected String levelName;

    protected GameEngine gameEngine;
    protected GUIHandler guiHandler;

    protected Player player;
    protected ArrayList<Actor> enemies = new ArrayList<Actor>();
    protected ArrayList<Actor> projectiles = new ArrayList<Actor>();
    protected ArrayList<Actor> items = new ArrayList<Actor>();
    protected CopyOnWriteArrayList<Actor> allEntities = new CopyOnWriteArrayList<Actor>();

    /**
     * Constructor.
     *
     * @param gameEngine
     * @param guiHandler
     */
    protected Level(GameEngine gameEngine, GUIHandler guiHandler) {

        this.gameEngine = gameEngine;
        this.guiHandler = guiHandler;
    }

    // Getters.
    public String getLevelName() {
        return levelName;
    }

    public GameEngine getGameEngine() {
        return gameEngine;
    }

    public GUIHandler getGuiHandler() {
        return guiHandler;
    }

    public Player getPlayer() {
        return player;
    }

    public ArrayList<Actor> getEnemies() {
        return enemies;
    }

    public ArrayList<Actor> getProjectiles() {
        return projectiles;
    }

    public ArrayList<Actor> getItems() {
        return items;
    }

    public CopyOnWriteArrayList<Actor> getActors() {
        return allEntities;
    }

}
