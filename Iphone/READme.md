«interface» ReprodutorMusical
-----------------------------
+ tocar(): void
+ pausar(): void
+ selecionarMusica(musica: String): String

«interface» Telefone
-----------------------------
+ ligar(numero: String): String
+ atender(): void
+ iniciarCorreioVoz(): void

«interface» NavegadorInternet
-----------------------------
+ exibirPagina(url: String): String
+ adicionarNovaAba(): void
+ atualizarPagina(): void

class Iphone
-----------------------------
+ modelo: String
+ versaoSO: String
-----------------------------
+ tocar(): void
+ pausar(): void
+ selecionarMusica(musica: String): String
+ ligar(numero: String): String
+ atender(): void
+ iniciarCorreioVoz(): void
+ exibirPagina(url: String): String
+ adicionarNovaAba(): void
+ atualizarPagina(): void
-----------------------------

Iphone ..|> ReprodutorMusical
Iphone ..|> Telefone
Iphone ..|> NavegadorInternet
