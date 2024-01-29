enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val formacao: String, val nivel: Nivel, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} matriculado com sucesso, na formação $formacao")
        println("total de usuários inscritos: ${inscritos.size}")
    }
}

fun main() {
   
    val usuario1 = Usuario("Amanda")
    val usuario2 = Usuario("Bruno")
    val usuario3 = Usuario("Joao")
    
    val conteudo1 = ConteudoEducacional("Intro ao Kotlin", 120)
    val conteudo2 = ConteudoEducacional("Kotlin avançado", 150)
    
    val formacao = Formacao("Kotlin", Nivel.INTERMEDIARIO, listOf(conteudo1, conteudo2))
    
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
    formacao.matricular(usuario3)
    
                    
}