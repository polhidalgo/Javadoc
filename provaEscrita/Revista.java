package provaEscrita;

/**
 * 
 * @author Pol
 * @version 1.0 11/03/2025
 */
public class Revista extends Fitxa {
    private short any;
    private short nro;

    /**
     * Crea una nova instància de Revista amb la referència, títol, any i número especificats.
     *
     * @param Ref que ve del super constructor de Fitxa.
     * @param Tit que ve del super constructor de Fitxa.
     * @param Any l'any de publicació.
     * @param Nro el número de la revista.
     */
    public Revista(String Ref, String Tit, int Any, int Nro) {
        super(Ref, Tit);
        nro = 0;
        if (Nro > 0)
            nro = (short) Nro;
        any = 0;
        if (Any > 0)
            any = (short) Any;
    }

    /**
     * Crea una nova instància de Revista copiant una altra revista.
     *
     * @param f  wl objecte/instancia a copiar.
     */
    public Revista(Revista f) {
        this(f.referencia, f.titol, f.any, f.nro);
    }

    /**
     * Estableix un nou any per la revista.
     *
     * @param nouAny el nou any.
     */
    public void setAny(int nouAny) {
        any = (short) nouAny;
    }

    /**
     * Estableix un nou número per la revista.
     *
     * @param nouNro el nou número.
     */
    public void setNro(int nouNro) {
        nro = (short) nouNro;
    }

    /**
     * Retorna l'any de publicació de la revista.
     *
     * @return l'any.
     */
    public int getAny() {
        return any;
    }

    /**
     * Retorna el número de la revista.
     *
     * @return el número.
     */
    public int getNro() {
        return nro;
    }

    /**
     * Mostra per consola la informació completa de la revista.
     */
    @Override
    public void visualitzar() {
        super.visualitzar();
        System.out.println("Any............:" + any);
        System.out.println("Número Revista.:" + nro);
    }
}
