/**
 * PokemonType is an interface that defines methods for
 * other classes that are a specific PokemonType
 * to implement. PokemonType extends Comparable.
 * @author Sahithya Pasagada
 * @version 1.0
 */
public interface PokemonType extends Comparable<PokemonType> {
    /**
     * This method creates a String representation of the PokemonType which
     * is the name of the class.
     *
     * @return The name of the class in the form of a String.
     */
    String type();
}
