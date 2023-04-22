package HerenciaMultiple;

/**
 *
 * @author angel
 */
public class alumno implements persona {

    private String noControl;
    private String asignatura;
    private float calificacion;
    private String curp;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String nombres;
    private String fechaNacimiento;
    private  char genero;

    public alumno(String noControl, String asignatura, float calificacion, String curp, String apellidoPaterno, String apellidoMaterno, String nombres, String fechaNacimiento, char genero) {
        this.noControl = noControl;
        this.asignatura = asignatura;
        this.calificacion = calificacion;
        this.curp = curp;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.nombres = nombres;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String getCurp() {
        return curp;
    }

    @Override
    public void setCurp(String curp) {
        this.curp = curp;
    }

    @Override
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    @Override
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    @Override
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    @Override
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    @Override
    public String getNombres() {
        return nombres;
    }

    @Override
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Override
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    @Override
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public char getGenero() {
        return genero;
    }

    @Override
    public void setGenero(char genero) {
        this.genero = genero;
    }
}
