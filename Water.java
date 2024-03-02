/**
 * The Water class is a specific PokemonType. It is a concrete class
 * that implements the PokemonType interface.
 *
 * @author Sahithya Pasagada
 * @version 1.0
 */
public class Water implements PokemonType {
    /**
     * This method creates a String representation of the PokemonType which
     * is the name of the class in this case: Water.
     *
     * @return The name of the class in the form of a String.
     */
    public String type() {
        return "Water";
    }

    /**
     * This method compares Water PokemonTypes to other Water PokemonTypes based
     * on where it is positioned in the type hierarchy which establishes
     * that Grass is less than Fire which is less than Water.
     *
     * @param p The PokemonType to be compared to.
     * @return Zero or a positive integer as this
     * PokemonType is equal to or greater than the specified PokemonType.
     */
    public int compareTo(PokemonType p) {
        if ((p.type().equals("Grass") && p instanceof Grass) || (p.type().equals("Fire") && p instanceof Fire)) {
            return 1;
        }

        return 0;
    }
}
