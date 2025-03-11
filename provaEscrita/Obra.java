package provaEscrita;

/**
 * @author Pol
 * @version 1.0 11/03/2025
 */
public class Obra extends Fitxa {
    protected String autor;
    protected short nrePags;

    /**
     * Crea una nova instància de Revista amb la referència, títol, any i número especificats.
     *
     * @param Ref que ve del super constructor de Fitxa.
     * @param Tit que ve del super constructor de Fitxa.
     * @param Any l'any de publicació.
     * @param Nro el número de la revista.
     */
    public Obra(String Ref, String Tit, String Aut, int NrePags) {
        super(Ref, Tit);
        autor = Aut;
        if (NrePags > 0 && NrePags <= Short.MAX_VALUE)
            nrePags = (short) NrePags;
        else
            nrePags = 0;
    }

    /**
     * Crea una nova instància d'Obra copiant una altra obra.
     *
     * @param f la instancia/objecte a copiar.
     */
    public Obra(Obra f) {
        this(f.referencia, f.titol, f.autor, f.nrePags);
    }

    /**
     * Estableix un nou autor per l'obra.
     *
     * @param NouAutor el nou autor.
     */
    public void setAutor(String NouAutor) {
        autor = NouAutor;
    }

    /**
     * Estableix un nou nombre de pàgines per l'obra.
     *
     * @param NouNrePags el nou nombre de pàgines.
     */
    public void setNumPags(int NouNrePags) {
        nrePags = (short) NouNrePags;
    }

    /**
     * Retorna l'autor de l'obra.
     *
     * @return l'autor.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Retorna el nombre de pàgines de l'obra.
     *
     * @return el nombre de pàgines.
     */
    public int getNrePags() {
        return nrePags;
    }

    /**
     * Mostra per consola la informació completa de l'obra.
     */
    public void visualitzar() {
        super.visualitzar();
        System.out.println("Autor..........:" + autor);
        System.out.println("Nombre Pàgines.:" + nrePags);
    }
}
