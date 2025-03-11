import provaEscrita.*;

/**
 * 
 * @author Pol
 * @version 1.0 11/03/2025
 */
public class Biblioteca {
    private Fitxa t[];
    private int q = 0;

    /**
     * Crea una instancia de biblioteca.
     * Si la dimensió donada és negativa, es fixa per defecte a 100.
     *
     * @param dim La capacitat inicial de la biblioteca.
     */
    public Biblioteca(int dim) {
        if (dim < 0) dim = 100;
        t = new Fitxa[dim];
    }

    /**
     * Retorna la capacitat màxima de la biblioteca.
     *
     * @return El nombre màxim d'exemplars que es poden emmagatzemar.
     */
    public int capacitat() {
        return t.length;
    }

    /**
     * Retorna el nombre actual d'exemplars a la biblioteca.
     *
     * @return El nombre d'elements emmagatzemats.
     */
    public int nreElements() {
        return q;
    }

    /**
     * Afegeix un objecte a la biblioteca.
     * <p>
     * Retorna:
     * <ul>
     *   <li><code>-1</code> si l'objecte s'ha afegit correctament.</li>
     *   <li><code>-2</code> si l'objecte és {@code null}.</li>
     *   <li><code>-3</code> si no hi ha espai disponible.</li>
     *   <li>Un valor >= 0 indicant la posició on l'objecte ja existia.</li>
     * </ul>
     *
     * @param obj L'objecte a afegir (de tipus {@code Fitxa}).
     * @return Un codi que indica el resultat de l'operació.
     */
    public int afegir(Fitxa obj) {
        if (obj == null) return -2;
        if (q >= t.length) return -3;
        for (int i = 0; i < q; i++) {
            if (t[i].getReferencia().equals(obj.getReferencia())) {
                return i; 
            }
        }
        t[q++] = obj;
        return -1; 
    }

    /**
     * Cerca la posició d'un objecte en la biblioteca segons la seva referència.
     *
     * @param ref La referència de l'objecte a cercar.
     * @return La posició de l'objecte si es troba, o <code>-1</code> si no existeix.
     */
    public int cercar(String ref) {
        for (int i = 0; i < q; i++) {
            if (t[i].getReferencia().equals(ref)) {
                return i;
            }
        }
        return -1; 
    }

    /**
     * Retorna l'objecte que es troba a la posició especificada.
     *
     * @param i L'índex de l'objecte.
     * @return L'objecte si l'índex és vàlid, o <code>null</code> en cas contrari.
     */
    public Fitxa exemplarAt(int i) {
        if (i >= 0 && i < q) {
            return t[i];
        }
        return null; 
    }

    /**
     * Extreu (elimina) un objecte de la biblioteca segons la seva referència.
     *
     * @param ref La referència de l'objecte a extreure.
     * @return L'objecte extret si s'ha trobat, o <code>null</code> si no existeix.
     */
    public Fitxa extreure(String ref) {
        int pos = cercar(ref);
        if (pos != -1) {
            Fitxa f = t[pos];
            for (int i = pos; i < q - 1; i++) {
                t[i] = t[i + 1];
            }
            t[--q] = null;
            return f;
        }
        return null; 
    }

    /**
     * Visualitza per la consola el contingut de la biblioteca, mostrant la capacitat, el nombre d'exemplars
     * i la informació de cadascun.
     */
    public void visualitzar() {
        System.out.println("Contingut de la biblioteca");
        System.out.println("**************************");
        System.out.println("Capacitat.....: " + capacitat());
        System.out.println("Nre. Exemplars: " + nreElements());
        for (int i = 0; i < q; i++) {
            System.out.println("Exemplar " + (i + 1) + ": " + t[i]);
        }
    }

    /**
     * Compara aquesta biblioteca amb un altre objecte per verificar si són iguals.
     * <p>
     * Són iguals si l'altre objecte és una {@code Biblioteca} que conté el mateix nombre d'elements
     * i cadascun dels elements és igual en la mateixa posició.
     *
     * @param obj L'objecte amb el qual comparar.
     * @return <code>true</code> si les biblioteques són iguals, <code>false</code> en cas contrari.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Biblioteca) {
            Biblioteca b = (Biblioteca) obj;
            if (this.nreElements() != b.nreElements()) return false;
            for (int i = 0; i < q; i++) {
                if (!this.t[i].equals(b.t[i])) return false;
            }
            return true;
        }
        return false;
    }
}
