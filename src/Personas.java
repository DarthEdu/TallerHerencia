// Nivel 1: Persona
class Persona {
    String nombre;

    Persona(String nombre) {
        this.nombre = nombre;
    }

    void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }
}

// Nivel 2: Estudiante
class Estudiante extends Persona {
    String carrera;

    Estudiante(String nombre, String carrera) {
        super(nombre);
        this.carrera = carrera;
    }

    void mostrarCarrera() {
        System.out.println("Carrera: " + carrera);
    }
}

// Nivel 3: Estudiante de Pregrado
class EstudiantePregrado extends Estudiante {
    String nivel;

    EstudiantePregrado(String nombre, String carrera, String nivel) {
        super(nombre, carrera);
        this.nivel = nivel;
    }

    void mostrarNivel() {
        System.out.println("Nivel de Pregrado: " + nivel);
    }
}

// Nivel 4: Estudiante de Maestría
class EstudianteMaestria extends Estudiante {
    String temaTesis;

    EstudianteMaestria(String nombre, String carrera, String temaTesis) {
        super(nombre, carrera);
        this.temaTesis = temaTesis;
    }

    void mostrarTemaTesis() {
        System.out.println("Tema de Tesis de Maestría: " + temaTesis);
    }
}

// Nivel 5: Estudiante de Doctorado
class EstudianteDoctorado extends EstudianteMaestria {
    String temaDisertacion;

    EstudianteDoctorado(String nombre, String carrera, String temaTesis, String temaDisertacion) {
        super(nombre, carrera, temaTesis);
        this.temaDisertacion = temaDisertacion;
    }

    void mostrarTemaDisertacion() {
        System.out.println("Tema de Disertación de Doctorado: " + temaDisertacion);
    }
}