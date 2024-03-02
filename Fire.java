/**
 * The Fire class is a specific PokemonType. It is a concrete class
 * that implements the PokemonType interface.
 *
 * @author Sahithya Pasagada
 * @version 1.0
 */
public class Fire implements PokemonType {
    /**
     * This method creates a String representation of the PokemonType which
     * is the name of the class in this case: Fire.
     *
     * @return The name of the class in the form of a String.
     */
    public String type() {
        return "Fire";
    }

    /**
     * This method compares Fire PokemonTypes to other Fire PokemonTypes based
     * on where it is positioned in the type hierarchy which establishes
     * that that Grass is less than Fire which is less than Water.
     *
     * @param p The PokemonType to be compared to.
     * @return A negative integer, zero, or a positive integer as this
     * PokemonType is less than, equal to, or greater than the specified PokemonType.
     */
    public int compareTo(PokemonType p) {
        if (p.type().equals("Grass") && p instanceof Grass) {
            return 1;
        } else if (p.type().equals("Water") && p instanceof Water) {
            return -1;
        }
        return 0;
    }
}
