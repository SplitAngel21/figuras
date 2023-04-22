package HerenciaMultiple;
/**
 *
 * @author angel
 */
public class main {
    public static void main(String[] args) {
        // Crear instancias de las materias
        materia programacion = new asignatura("001", "Programación", "2023-1", "8", 'I');

        // Crear instancias de los profesores
        profesor profesorProgramacion = new profesor("SP001", "Programación");

        // Crear instancias de los alumnos
        alumno alumno1 = new alumno("A001", "Programación", 8.5f, "CURP1", "ApellidoPaterno1", "ApellidoMaterno1", "Nombres1", "2000-01-01", 'M');
        alumno alumno2 = new alumno("A002", "Estructuras de datos", 9.0f, "CURP2", "ApellidoPaterno2", "ApellidoMaterno2", "Nombres2", "2000-02-02", 'F');
        alumno alumno3 = new alumno("A003", "Programación", 7.0f, "CURP3", "ApellidoPaterno3", "ApellidoMaterno3", "Nombres3", "2000-03-03", 'M');
        alumno alumno4 = new alumno("A004", "Matemáticas", 6.5f, "CURP4", "ApellidoPaterno4", "ApellidoMaterno4", "Nombres4", "2000-04-04", 'F');
        alumno alumno5 = new alumno("A005", "Bases de datos", 8.0f, "CURP5", "ApellidoPaterno5", "ApellidoMaterno5", "Nombres5", "2000-05-05", 'M');
        alumno alumno6 = new alumno("A006", "Estructuras de datos", 9.5f, "CURP6", "ApellidoPaterno6", "ApellidoMaterno6", "Nombres6", "2000-06-06", 'F');
        alumno alumno7 = new alumno("A006", "Estructuras de datos", 9.5f, "CURP6", "ApellidoPaterno6", "ApellidoMaterno6", "Nombres6", "2000-06-06", 'F');

    System.out.println("Alumnos y sus calificaciones:");
    for (alumno alumno : alumnos) {
        System.out.println(alumno.getApellidoPaterno()+" - "alumno.getApellidoMaterno()+" - "alumno.getNombres() " - " + alumno.getMateria().getNombre() + " - Calificación: " + alumno.getCalificacion() + " - Profesor: " + alumno.getProfesor().getAsignatura());
    }
}
        
    