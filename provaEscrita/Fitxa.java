package provaEscrita;

/**
 * @author Pol
 * @version 1.0 11/03/2025
 */
public class Fitxa {
    protected String referencia;
    protected String titol;

    /**
     * Crea una nova instancia de Fitxa.
     *
     * @param Ref la referència de la fitxa.
     * @param Tit el títol de la fitxa.
     */
    public Fitxa(String Ref, String Tit) {
        referencia = Ref;
        titol = Tit;
    }

    /**
     * Crea una nova instancia de Fitxa copian una altra fitxa.
     *
     * @param f la fitxa a copiar.
     */
    public Fitxa(Fitxa f) {
        this(f.referencia, f.titol);
    }

    /**
     * Comprova si aquest objecte és igual a un altre.
     * Retorna true si els objectes són el mateix o si l'altre objecte és una instància de Fitxa.
     *
     * @param obj l'objecte amb el qual comparar.
     * @return true si són iguals, false en cas contrari.
     */
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if (obj instanceof Fitxa) return true;
        return false;
    }

    /**
     * Estableix una nova referència per la fitxa.
     *
     * @param NovaRef la nova referència.
     */
    public void setReferencia(String NovaRef) {
        referencia = NovaRef;
    }

    /**
     * Estableix un nou títol per la fitxa.
     *
     * @param NouTit el nou títol.
     */
    public void setTitol(String NouTit) {
        titol = NouTit;
    }

    /**
     * Retorna la referència de la fitxa.
     *
     * @return la referència.
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * Retorna el títol de la fitxa.
     *
     * @return el títol.
     */
    public String getTitol() {
        return titol;
    }

    /**
     * Mostra per consola la informació de la fitxa.
     */
    public void visualitzar() {
        System.out.println("Referència.....:" + referencia);
        System.out.println("Títol..........:" + titol);
    }

    /**
     * Retorna una representació en forma de cadena de la fitxa.
     *
     * @return una cadena amb la referència i el títol.
     */
    public String toString() {
        return referencia + " - " + titol;
    }
}
