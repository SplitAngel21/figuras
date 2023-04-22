package HerenciaMultiple;

/**
 *
 * @author angel
 */
public class asignatura implements materia {

    public asignatura(String string, String programación, String string1, String string2, char par) {
    }

    private String clave;
    private String nombre;
    private String semestre;
    private String creditos;
    private char especialidad;

    @Override
    public String getClave() {
        return clave;
    }

    @Override
    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getSemestre() {
        return semestre;
    }

    @Override
    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    @Override
    public String getCreditos() {
        return creditos;
    }

    @Override
    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    @Override
    public char getEspecialidad() {
        return especialidad;
    }

    @Override
    public void setEspecialidad(char especialidad) {
        this.especialidad = especialidad;
    }
}
