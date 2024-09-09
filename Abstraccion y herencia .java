//esta clase al ser abstracta solo define metodos abstractos pero no se pueden crear objetos de ella
abstract class Animal {
    // Método abstracto 
    public abstract void sonido();

}

// Clase Perro que hereda de la clase Animal 
class Gato extends Animal {
    // Esta seria implementación del método abstracto
    public void sonido() {
        System.out.println("Mi gato hace:Miau Miau Miau");
    }
}

