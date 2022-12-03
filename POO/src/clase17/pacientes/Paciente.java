package clase17.pacientes;

import java.util.Date;

public class Paciente {

    /*En una clínica tiene un sistema que registra los datos del paciente cuando es internado, estos
    datos son nombre, apellido, DNI, fecha de internación, también posee un fecha de alta que
    inicialmente está en null, posteriormente cuando es dado de alta, se cambia esa fecha con la
    fecha correspondiente.
    */


    // Atributos
    String nombre;
    String apellido;
    int cedula;
    String historiaClinica;
    Date fechaInternacion;
    Date fechaAlta;


    // Constructor
    public Paciente(String nombre, String apellido, String historiaClinica, Date fechaInternacion) throws FechaException {
        this.nombre             = nombre;
        this.apellido           = apellido;
        this.historiaClinica    = historiaClinica;
        Date todayDate = new Date();
        if (fechaInternacion.after(todayDate)) {
            throw new FechaException("Fecha de internación no puede ser anterior a fecha actual");
        } else {
            this.fechaInternacion = fechaInternacion;
        }
    }


    /*Para evitar posibles errores en la carga de datos debemos generar una Excepción
    personalizada que se genera cuando se crea el paciente, si la fecha de internación fuera
    posterior al día de hoy y cuando la fecha de alta es posterior al día de la internación.*/

    // Métodos
    public void darAlta(Date fechaAltaIngresada) throws FechaException
    {
        if (fechaAltaIngresada.before(this.fechaInternacion)) {
            throw new FechaException("Fecha de alta no puede ser anterior a fecha de internación");
        } else {
            this.fechaAlta = fechaAltaIngresada;
        }
    }


    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(String historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public Date getFechaInternacion() {
        return fechaInternacion;
    }

    public void setFechaInternacion(Date fechaInternacion) {
        this.fechaInternacion = fechaInternacion;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
}
