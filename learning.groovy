public
private
protected

DEFAULT_EDAD = 100

class Primo extends Persona {
   private number primoedad;

   public Primo() {

   } 

   public void correr() {
       console.log('estoy corriendo primo')
   }
}

class Hijo extends Persona {
    private number hijoedad;
    private string nombre;

    public Hijo () {

    }

    public string getNombre() {
        this.direccioncasa
        return this.nombre;
    }

    public void correr() {
        console.log('estoy corriendo hijo')
    }
}

class Persona {
    // Atributos
    private number edad = DEFAULT_EDAD;
    private string apellido;
    private string contraseña;
    private Hijo[] hijos;
    protected string direccioncasa;

    // Constructor
    public Persona () {
    }

    // Métodos
    public void setApellido (string miapellido) {
        this.apellido = miapellido;
    }

    public number getEdad() {
        return this.edad;
    }

    public number getApellido() {
        return this.apellido;
    }

    public number calculateDaysOfLife () {
        return this.edad * 365;
    }

    public number happyBirthday() {
        this.edad += 1;
        return this.getEdad()
    }

    public string getChildrenNames () {
        string nombres = ""
        for (Hijo child : this.hijos) {
            string nombrehijo = child.getNombre()
            nombres += "," + nombrehijo
        }
    }

    public void caminar() {
        console.log('estoy caminando')
    }

    public abstract void correr (); // abstract: defino solamente la operación,
                                    //           no implemento el método
}

Mar = Persona ()

seteo = Mar.setApellido("Sbrocca")
seteo -> basura
Mar.obtenerEdad() -> 23
Mar.obtenerApellido()
Mar.happyBirthday()
Mar.obtenerEdad() -> 24

Mathi = Persona(22)
Mathi.edad = 22

// ---

class Program {
    mifunc(mistr) { // mistr: parámetro
        console.log(mistr)
    } 
}

miprograma = Program()
miprograma.mifunc('hola mundo') // 'hola mundo': argumento


// ---

function mifunc (mistr) {
    console.log(mistr)
}
