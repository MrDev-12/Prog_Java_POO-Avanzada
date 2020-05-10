
package dam105t3_pooavanz;


public enum TiposMadera {
    
    ROBLE (40),
    SAPELLY (50),
    NOGAL (60),
    CEREZO (70),
    BAMBU (100);

    private int precio;

    TiposMadera(int prec) {

        precio = prec;

    }

    public int getPrecio() {

        return precio;
        
    }
    
}
