package HerenciaMultiple;

/**
 *
 * @author angel
 */
public class profesor implements persona, materia {

    private String claveSP;
    private String asignatura;
    private String curp;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String nombres;
    private String fechaNacimiento;
    private char genero;
    private String clave;
    private String nombre;
    private String semestre;
    private String creditos;
    private char especialidad;

    public profesor(String claveSP, String asignatura) {
        this.claveSP = claveSP;
        this.asignatura = asignatura;
        this.curp = curp;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.nombres = nombres;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.clave = clave;
        this.nombre = nombre;
        this.semestre = semestre;
        this.creditos = creditos;
        this.especialidad = especialidad;
    }

    public String getClaveSP() {
        return claveSP;
    }

    public void setClaveSP(String claveSP) {
        this.claveSP = claveSP;
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
