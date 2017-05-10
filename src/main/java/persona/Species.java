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
    int resistances[] = new int [10];
    /*
    0|Pys
    1|Gun
    2|Fire
    3|Ice
    4|Lightning
    5|Wind
    6|Psychic
    7|Nuclear
    8|Holy
    9|Dark
     */
    public Species(String name, int STR, int MAG, int END, int LUC, int AGI,String arcana, int [] resistances) {
        this.name = name;
        this.STR = STR;
        this.MAG = MAG;
        this.END = END;
        this.LUC = LUC;
        this.AGI = AGI;
        this.arcana = arcana;
        this.resistances = resistances;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArcana() {
        return arcana;
    }

    public void setArcana(String arcana) {
        this.arcana = arcana;
    }

    public int getSTR() {
        return STR;
    }

    public void setSTR(int STR) {
        this.STR = STR;
    }

    public int getMAG() {
        return MAG;
    }

    public void setMAG(int MAG) {
        this.MAG = MAG;
    }

    public int getEND() {
        return END;
    }

    public void setEND(int END) {
        this.END = END;
    }

    public int getLUC() {
        return LUC;
    }

    public void setLUC(int LUC) {
        this.LUC = LUC;
    }

    public int getAGI() {
        return AGI;
    }

    public void setAGI(int AGI) {
        this.AGI = AGI;
    }

    public int[] getResistances(){
        return resistances;
    }





}