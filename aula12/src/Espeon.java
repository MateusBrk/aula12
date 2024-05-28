public class Espeon extends Eevee {
    @Override
    public String ataque(){
        return "Psybeam";
    }
    @Override
    public String defesa(){
        return "Tail Whip";
    }
    @Override
    public String especial(){
        return "Psychic";
    }

    // Construtor
    public Espeon(String tipo, Integer altura, Integer hp, double peso){
        super(tipo, altura, hp, peso);
}
}
