package persona;

/**
 * Created by Christopher on 5/9/2017.
 */
public interface BattleOptions {


    public int calculateDamage(Species A, Species B); //Calculates the actual damage that will be done to a target
    public int attack();//Returns the damage for an attack

}