package co.edu.uniquindio.poo.model;

/**
 * Representa un acto dentro de una función del circo.
 */
public class Acto {

    private String codigo;
    private String nombre;
    private int duracionMinutos;
    private TipoActo tipoActo;
    private Artista artista;

    /**
     * Construye un acto con su información básica.
     * @param codigo Código del acto.
     * @param nombre Nombre del acto.
     * @param duracionMinutos Duración en minutos.
     * @param tipoActo Tipo de acto.
     * @param artista Artista principal que realiza el acto.
     */
    public Acto(String codigo, String nombre, int duracionMinutos,
                TipoActo tipoActo, Artista artista) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.duracionMinutos = duracionMinutos;
        this.tipoActo = tipoActo;
        this.artista = artista;
    }

    /**
     * Retorna la información del acto.
     * @return Cadena con la información del acto.
     */
    public String mostrarInformacionActo() {
        return "Código: " + codigo +
                "\nNombre: " + nombre +
                "\nDuración: " + duracionMinutos + " minutos" +
                "\nTipo de acto: " + tipoActo +
                "\nArtista principal: " + artista.getNombre();
    }

    /**
     * Asigna o cambia el artista principal del acto.
     * @param artistaPrincipal Nuevo artista principal.
     */
    public void asignarArtista(Artista artistaPrincipal) {
        this.artista = artistaPrincipal;
    }

    /**
     * Verifica si el acto pertenece a un tipo específico.
     * @param tipoActo Tipo de acto a comparar.
     * @return true si coincide, false en caso contrario.
     */
    public boolean esDelTipo(TipoActo tipoActo) {
        return this.tipoActo == tipoActo;
    }

    /**
     * Obtiene el código del acto.
     * @return Código del acto.
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Obtiene el nombre del acto.
     * @return Nombre del acto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la duración del acto en minutos.
     * @return Duración del acto.
     */
    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    /**
     * Obtiene el tipo del acto.
     * @return Tipo del acto.
     */
    public TipoActo getTipoActo() {
        return tipoActo;
    }

    /**
     * Obtiene el artista principal del acto.
     * @return Artista principal.
     */
    public Artista getArtista() {
        return artista;
    }

}