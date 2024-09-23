// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String, val email: String)

data class ConteudoEducacional(val nome: String, val duracao: Int, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        // TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
    }
    
    fun exibirConteudos() {
        println("Conteúdos de $nome:")
        for (conteudo in conteudos) {
            println("------------------------------------------------------------")
            println("Nome: ${conteudo.nome}\nDuração: ${conteudo.duracao}\nNível: ${conteudo.nivel}")
        }
    }
    
    fun exibirInscritos() {
        println("Matrículaos de $nome")
        for (inscrito in inscritos) {
            println("------------------------------------------------------------")
            println("Nome: ${inscrito.nome}\nEmail: ${inscrito.email}")
        }
    }
}

fun main() {
    // TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    // TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    
    val usuario1 = Usuario("Ruan", "ruan@teste.com")
    val usuario2 = Usuario("Muriel", "muriel@teste.com")
    
    val conteudoEducacional1 = ConteudoEducacional("Conhecendo o Kotlin e Sua Documentação Oficial", 60, Nivel.BASICO)
    val conteudoEducacional2 = ConteudoEducacional("Visão Geral do Mercado de Desenvolvimento Mobile", 60, Nivel.BASICO)
    val conteudoEducacional3 = ConteudoEducacional("Princípios de Interface de Usuário e Layouts Android", 120, Nivel.INTERMEDIARIO)
    val conteudoEducacional4 = ConteudoEducacional("Visão Geral Sobre o Android Jetpack", 120, Nivel.AVANCADO)
    
    val formacao = Formacao("Formação Android Developer", listOf(conteudoEducacional1, conteudoEducacional2, conteudoEducacional3, conteudoEducacional4))
    
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
    
    formacao.exibirConteudos()
    println()
    formacao.exibirInscritos()
}
