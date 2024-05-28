public class Vaporeon extends Eevee {
    @Override
    public String ataque(){
        return "Water Pulse";
    }
    @Override
    public String defesa(){
        return "Protect";
    }
    @Override
    public String especial(){
        return "Surf";
    }

    // Construtor
    public Vaporeon(String tipo, Integer altura, Integer hp, double peso){
        super(tipo, altura, hp, peso);
}
}
