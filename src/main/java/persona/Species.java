package persona;

/**
 * Created by Christopher on 5/9/2017.
 *
 * This is the class for the types of demon/persona that will be summoned.
 * Just keeps track of arcana info and everything, to be dumped into some json file for access
 */
public class Species {

    String name;
    String arcana;
    int STR, MAG, END, LUC, AGI;

    public Species(String name, int STR, int MAG, int END, int LUC, int AGI,String arcana) {
        this.name = name;
        this.STR = STR;
        this.MAG = MAG;
        this.END = END;
        this.LUC = LUC;
        this.AGI = AGI;
        this.arcana = arcana;
    }



}