import java.lang.Exception

class Ataque(nombre_atk: String, tipo_atk: Tipo, fuerza_atk: Int) {
    var nombre = nombre_atk
    var tipo: Tipo
    var fuerza = fuerza_atk
        set(value) {
            if (value < 0) {
                throw Exception("La fuerza no puede ser menor que 0")
            }
            field = value
        }

    init {
        nombre = nombre_atk
        tipo = tipo_atk
        fuerza = fuerza_atk
    }

    override fun toString(): String {
        return "Ataque(nombre='$nombre', tipo='$tipo', fuerza=$fuerza)"
    }


}