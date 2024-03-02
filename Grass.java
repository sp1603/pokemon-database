/**
 * The Grass class is a specific PokemonType. It is a concrete class
 * that implements the PokemonType interface.
 *
 * @author Sahithya Pasagada
 * @version 1.0
 */
public class Grass implements PokemonType { //generic
    /**
     * This method creates a String representation of the PokemonType which
     * is the name of the class in this case: Grass.
     *
     * @return The name of the class in the form of a String.
     */
    public String type() {
        return "Grass";
    }

    /**
     * This method compares Grass PokemonTypes to other Grass PokemonTypes based
     * on where it is positioned in the type hierarchy which establishes
     * that Grass is less than Fire which is less than Water.
     *
     * @param p The PokemonType to be compared to.
     * @return Zero or a negative integer as this
     * PokemonType is equal to or less than the specified PokemonType.
     */
    public int compareTo(PokemonType p) {
        if ((p.type().equals("Fire") && p instanceof Fire) || (p.type().equals("Water") && p instanceof Water)) {
            return -1;
        }
        return 0;
    }
}
