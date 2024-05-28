public class Jolteon extends Eevee 
{
    @Override
    public String ataque(){
        return "Thunder Shock";
    }
    @Override
    public String defesa(){
        return "Charge";
    }
    @Override
    public String especial(){
        return "Thunder";
    }

    // Construtor
    public Jolteon(String tipo, Integer altura, Integer hp, double peso){
        super(tipo, altura, hp, peso);
}
}