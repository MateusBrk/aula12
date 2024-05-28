public class Pokedex {
    public static void main(String[] args) throws Exception {
        
            Eevee e = new Eevee("Normal", 30, 55, 6.5f);
            System.out.println("Eu sou: Eevee");
            e.imprimir();

            Jolteon j = new Jolteon("Relâmpago", 80, 65, 24.5f);
            System.out.println("Eu sou: Jolteon");
            j.imprimir();

            Vaporeon v = new Vaporeon("Água", 100, 130, 29.0f);
            System.out.println("Eu sou: Vaporeon");
            v.imprimir();

            Flareon f = new Flareon("Fogo", 90, 65, 25.0f);
            System.out.println("Eu sou: Flareon");
            f.imprimir();

            Espeon p = new Espeon("Psíquico", 90, 65, 26.5f);
            System.out.println("Eu sou: Espeon");
            p.imprimir();

            Umbreon u = new Umbreon("Noturno", 100, 95, 27.0f);
            System.out.println("Eu sou: Umbreon");
            u.imprimir();

            Leafeon l = new Leafeon("Grama", 100, 65, 25.5f);
            System.out.println("Eu sou: Leafeon");
            l.imprimir();

            Glaceon g = new Glaceon("Gelo", 80, 65, 25.9f);
            System.out.println("Eu sou: Glaceon");
            g.imprimir();

            Sylveon s = new Sylveon("Fada", 100, 95, 23.5f);
            System.out.println("Eu sou: Sylveon");
            s.imprimir();


        
    }
    
}
