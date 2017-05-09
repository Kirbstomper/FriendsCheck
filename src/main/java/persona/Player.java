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
    int persona; // This is the ID of the persona currently equipped

    public Player(String facebookID, String dispName){

        this.facebookID = facebookID;
        this.dispName = dispName;
        this.level = 1;
    }

   //Display name methods
    public String getDispName() {
        return dispName;
    }

    public void setDispName(String dispName) {
        this.dispName = dispName;
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
    }
    public void levelUp(){
        level = level+1;
    }

    //Persona methods
    public int getPersona() {
        return persona;
    }

    public void setPersona(int persona) {
        this.persona = persona;
    }
}
