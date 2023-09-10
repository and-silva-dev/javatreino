public class Principal {
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro [3];

        p[0] = new Pessoa ("Pedro" , 25 , "M"  ); 
        p[1] = new Pessoa ("Maria" , 26 , "M");
        l[0] = new Livro ("A arte da Guerra" , "Suntzu" ,
                200 , true , p[0] );
        l[1] = new Livro ("15 Regras para a vida" , "Jordan P" ,
                400 , true , p[1]);
        l[2] = new Livro ("Ansiedade" , "Augusto Cury" ,
                350 , true , p[1]);
    
        
        l[0].abrir();
        l[0].folhear(400);
        l[0].avancarPag();
        
        
        System.out.println(l[0].datalhes());
    }
    
}
