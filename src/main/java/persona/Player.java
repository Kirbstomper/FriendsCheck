package persona;

/**
 * Created by Christopher on 5/9/2017.
 * This will just keep track of a players name and level, and their facebook id connected to them
 * It will also keep track of
 */
public class Player {
    String facebookID; // The unique identifier for the
    String dispName; //the forward facing name of the player
    int level; //This is the level of the player, and is used in fusion
    int persona;// This is the ID of the persona currently equipped
    int weapon; // Holds the ID of the weapon being used
    int health; // Health
    int magic; // The players MP

    public Player(String facebookID, String dispName){

        this.facebookID = facebookID;
        this.dispName = dispName;
        this.setLevel(1);
    }
//Getters and Setters
   //Display name methods
    public String getDispName() {
        return dispName;
    }

    public int getWeapon() {
        return weapon;
    }

    public void setWeapon(int weapon) {
        this.weapon = weapon;
    }

    public void setDispName(String dispName) {
        this.dispName = dispName;

    }

    public void setHealth(int level) {
        this.health = 10+(level*15);
    }

    public void setMagic(int magic) {
        this.magic = 10+(level*10);
    }

    //Faacebook ID Methods
    public String getFacebookID() {
        return facebookID;
    }

    public void setFacebookID(String facebookID) {
        this.facebookID = facebookID;
    }

    //Level methods
    public int getLevel(){
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
        setHealth(level);
        setMagic(level);
    }


    public int getPersona() {
        return persona;
    }

    public void setPersona(int persona) {
        this.persona = persona;
    }

    public int getHealth(){
        return health;
    }
    public int getMagic(){
        return magic;
    }

    //Methods

    /*
        Levels up and allocates stats according to the formula
     */
    public void levelUp(){
        level = level+1;
        setHealth(level);
        setMagic(level);
    }


}
