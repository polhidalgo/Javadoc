package provaEscrita;

/**
 * 
 * @author Pol
 * @version 1.0 11/03/2025
 */
public class Volum extends Obra {
    private short nro;

    /**
     * Crea una nova instancia Volum amb els paràmetres especificats.
     *
     * @param Ref     Ve del super constructor de Obra.
     * @param Tit     Ve del super constructor de Obra.
     * @param Aut     Ve del super constructor de Obra.
     * @param NrePags Ve del super constructor de Obra.
     * @param Nro     El número del volum.
     */
    public Volum(String Ref, String Tit, String Aut, int NrePags, int Nro) {
        super(Ref, Tit, Aut, NrePags);
        nro = (short) Nro;
    }

    /**
     * Crea un nou volum a partir d'un volum existent.
     *
     * @param f El volum del qual es copiaran els atributs.
     */
    public Volum(Volum f) {
        this(f.referencia, f.titol, f.autor, f.nrePags, f.nro);
    }

    /**
     * Crea un volum per defecte sense informació.
     */
    public Volum() {
        super("", "", "", 0);
    }

    /**
     * Estableix un nou número per al volum.
     *
     * @param NouNro El nou número que s'assignarà al volum.
     */
    public void setNro(int NouNro) {
        nro = (short) NouNro;
    }

    /**
     * Retorna el número del volum.
     *
     * @return El número del volum.
     */
    public int getNro() {
        return nro;
    }

    /**
     * Visualitza la informació del volum per la consola.
     * Primer es mostra la informació general de l'obra i, a continuació, el número del volum.
     */
    @Override
    public void visualitzar() {
        super.visualitzar();
        System.out.println("Número Volum...:" + nro);
    }
}
