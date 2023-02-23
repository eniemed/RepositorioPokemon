import java.lang.Exception

class Pokemon (id: Int, nombre: String, vida: Int, tipo: Tipo){

    var listaAtaques = Array<String>(4, {""})
    var id: Int = 0
        set(value) {
            if (value <= 0) {
                throw Exception("El ID no puede ser menor que 0")
            }
            field = value
        }
    var nombre: String = ""
    var vida: Int
    var tipo: Tipo

    init {
        this.id = id;
        this.nombre = nombre;
        this.vida = vida
        this. tipo = tipo
        }

    fun ddjisa(){

    }
    override fun toString(): String {
        return "Hola mi nombre es $nombre, tengo $vida de vida y soy de tipo $tipo"
    }
    fun recibirAtaque(ataque: Ataque) {
        vida = vida - ataque
    }
}
