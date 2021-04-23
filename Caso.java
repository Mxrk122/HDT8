public class Caso implements Comparable<Caso>{

    // Atributos
    private String nombre;
    private String enfermedad;
    private String character;
    private int numero;

    public Caso(String name, String sickness, String c){
        nombre = name;
        enfermedad = sickness;
        character = c;
        //characterToNumber();
    }

    
    /** 
     * @param o
     * @return int
     */
    @Override
    public int compareTo(Caso o) {
        // TODO Auto-generated method stub
        String otro = o.getCharacter();

        return character.compareTo(otro);
    }
    
    
    /** 
     * @return String
     */
    /*public int characterToNumber(){
        numero = Character.getNumericValue(character);
        return numero;
    }*/

    public String getEnfermedad() {
        return enfermedad;
    }

    
    /** 
     * @return String
     */
    public String getNombre() {
        return nombre;
    }

    
    /** 
     * @return String
     */
    public String getCharacter() {
        return character;
    }

    
    /** 
     * @return int
     */
    public int getNumero() {
        return numero;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "\nNombre: " + nombre +
        "\nEnfermedad: " + enfermedad +
        "\nPrioridad: " + character + "\n";
    }
}
