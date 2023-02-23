import java.lang.IllegalArgumentException

class Tipo(tipo_pokemon: String, tipo2_pokemon: String) {
    var listaTipos = arrayListOf<String>("acero", "agua", "bicho", "dragon", "electrico", "fantasma", "fuego", "hada", "hielo", "lucha", "normal", "planta", "psiquico", "roca", "siniestro", "tierra", "veneno", "volador")

    var tipo = tipo_pokemon
        get() = field
        set(value) {
            if (value !in listaTipos) {
                field = ""
                throw IllegalArgumentException("El tipo no es válido")
            } else {
                 field = value
            }
        }
    var tipo2 = tipo2_pokemon
        get() = field
        set(value) {
            if (value !in listaTipos) {
                field = ""
                throw IllegalArgumentException("El tipo no es válido")
            } else {
                field = value
            }
        }
    init {
        tipo = tipo_pokemon
    }

    fun efectividad(): String {

        if (tipo == "acero") {
            if (tipo2 in arrayOf("hada", "hielo", "roca")) {
                return " $tipo es SUPER efectivo contra $tipo2"
            } else {
                return " $tipo no es SUPER efectivo contra $tipo2"
            }
        }
        if (tipo == "agua") {
            if (tipo2 in arrayOf("fuego", "roca","tierra")) {
                return " $tipo es SUPER efectivo contra $tipo2"
            } else {
                return " $tipo no es SUPER efectivo contra $tipo2"
            }
        }
        if (tipo == "bicho") {
            if (tipo2 in arrayOf("planta", "siniestro","psiquico")) {
                return " $tipo es SUPER efectivo contra $tipo2"
            } else {
                return " $tipo no es SUPER efectivo contra $tipo2"
            }
        }
        if (tipo == "dragon") {
            if (tipo2 in arrayOf("dragon")) {
                return " $tipo es SUPER efectivo contra $tipo2"
            } else {
                return " $tipo no es SUPER efectivo contra $tipo2"
            }
        }
        if (tipo == "electrico") {
            if (tipo2 in arrayOf("agua","volador")) {
                return " $tipo es SUPER efectivo contra $tipo2"
            } else {
                return " $tipo no es SUPER efectivo contra $tipo2"
            }
        }
        if (tipo == "fantasma") {
            if (tipo2 in arrayOf("fantasma","psiquico")) {
                return " $tipo es SUPER efectivo contra $tipo2"
            } else {
                return " $tipo no es SUPER efectivo contra $tipo2"
            }
        }
        if (tipo == "fuego") {
            if (tipo2 in arrayOf("acero","planta","bicho","hielo")) {
                return " $tipo es SUPER efectivo contra $tipo2"
            } else {
                return " $tipo no es SUPER efectivo contra $tipo2"
            }
        }
        if (tipo == "hada") {
            if (tipo2 in arrayOf("dragon","lucha","siniestro")) {
                return " $tipo es SUPER efectivo contra $tipo2"
            } else {
                return " $tipo no es SUPER efectivo contra $tipo2"
            }
        }
        if (tipo == "hielo") {
            if (tipo2 in arrayOf("dragon","planta","tierra","volador")) {
                return " $tipo es SUPER efectivo contra $tipo2"
            } else {
                return " $tipo no es SUPER efectivo contra $tipo2"
            }
        }
        if (tipo == "lucha") {
            if (tipo2 in arrayOf("acero","hielo","normal","roca","siniestro")) {
                return " $tipo es SUPER efectivo contra $tipo2"
            } else {
                return " $tipo no es SUPER efectivo contra $tipo2"
            }
        }
        if (tipo == "normal") {
            if (tipo2 in arrayOf("")) {
                return " $tipo es SUPER efectivo contra $tipo2"
            } else {
                return " $tipo no es SUPER efectivo contra $tipo2"
            }
        }
        if (tipo == "planta") {
            if (tipo2 in arrayOf("agua","roca","tierra")) {
                return " $tipo es SUPER efectivo contra $tipo2"
            } else {
                return " $tipo no es SUPER efectivo contra $tipo2"
            }
        }
        if (tipo == "planta") {
            if (tipo2 in arrayOf("agua","roca","tierra")) {
                return " $tipo es SUPER efectivo contra $tipo2"
            } else {
                return " $tipo no es SUPER efectivo contra $tipo2"
            }
        }
        if (tipo == "psiquico") {
            if (tipo2 in arrayOf("lucha","veneno")) {
                return " $tipo es SUPER efectivo contra $tipo2"
            } else {
                return " $tipo no es SUPER efectivo contra $tipo2"
            }
        }
        if (tipo == "roca") {
            if (tipo2 in arrayOf("bicho","fuego","hielo","volador")) {
                return " $tipo es SUPER efectivo contra $tipo2"
            } else {
                return " $tipo no es SUPER efectivo contra $tipo2"
            }
        }
        if (tipo == "siniestro") {
            if (tipo2 in arrayOf("fantasma","psiquico")) {
                return " $tipo es SUPER efectivo contra $tipo2"
            } else {
                return " $tipo no es SUPER efectivo contra $tipo2"
            }
        }
        if (tipo == "tierra") {
            if (tipo2 in arrayOf("acero","electrico","fuego","roca")) {
                return " $tipo es SUPER efectivo contra $tipo2"
            } else {
                return " $tipo no es SUPER efectivo contra $tipo2"
            }
        }
        if (tipo == "veneno") {
            if (tipo2 in arrayOf("hada","normal")) {
                return " $tipo es SUPER efectivo contra $tipo2"
            } else {
                return " $tipo no es SUPER efectivo contra $tipo2"
            }
        }
        if (tipo == "volador") {
            if (tipo2 in arrayOf("bicho","hielo","normal")) {
                return " $tipo es SUPER efectivo contra $tipo2"
            } else {
                return " $tipo no es SUPER efectivo contra $tipo2"
            }
        }
        return tipo
    }

    override fun toString(): String {
        return tipo.uppercase()

    }

    fun comprobarefectividad(tipo_pokemon: String, tipo2_pokemon: String) {

    }
}







