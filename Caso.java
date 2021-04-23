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

    @Override
    public int compareTo(Caso o) {
        // TODO Auto-generated method stub
        String otro = o.getCharacter();

        return character.compareTo(otro);
    }
    
    /*public int characterToNumber(){
        numero = Character.getNumericValue(character);
        return numero;
    }*/

    public String getEnfermedad() {
        return enfermedad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCharacter() {
        return character;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Nombre: " + nombre +
        "\nEnfermedad: " + enfermedad +
        "\nPrioridad: " + character;
    }
}
