enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }


class Usuario(val nome: String, val email: String, var senha: String, val nivelAluno: Nivel)

data class Curso(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val nivelDificuldade: Nivel, var curso: List<Conteudo>) {

  val inscritos = mutableListOf<Usuario>()

  fun matricular(usuario: Usuario) {
    inscritos.add(usuario)
  }
}

fun main() {

  val usuario1 = Usuario("João",   "joaoxxiii@gmail.com", "!@#456",    Nivel.AVANCADO)
  val usuario2 = Usuario("José",   "maria321@gmail.com",  "qweasd123", Nivel.DIFICIL)
  val usuario3 = Usuario("Marcos", "marcos@gmail.com",    "1qazxwsd",  Nivel.BASICO)

  val curso1 = Conteudo("Introdução à programação")
  val curso2 = Conteudo("Programaçao Orientada a Objeto I")
  val curso3 = Conteudo("Programaçao Orientada a Objeto II")

  val formacao1 = Formacao("$curso1", Nivel.BASICO, listOf(curso1, curso2, curso3))

  formacao1.matricular(usuario1)
  formacao1.matricular(usuario2)
  formacao1.matricular(usuario3)
  println("inscritos no ${formacao1.nome}:")

  }
}
