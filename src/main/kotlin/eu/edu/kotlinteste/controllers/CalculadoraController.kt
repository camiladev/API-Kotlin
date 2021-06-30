package eu.edu.kotlinteste.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
/*
@RestController -> É uma anotação do Spring que faz com que a classe seja
reconhecida e funcione como uma Controller, que cuida de rotas e fluxos

@RequestMapping("/calculadora") -> Define a rota para que o usuário
acesse pelo browser
http://localhost:8080/calculadora

@RequestMapping e no @GetMapping ajuda o seu código a entender qual
é o caminho mapeado que a sua API deverá seguir, para ser direcionada
 para seu objetivo.

As APIs possuem verbos para que possamos definir melhor qual é o seu
comportamento. Em nosso exemplo, estamos utilizando o "Get", pois
queremos apenas receber o resultado de volta. Existem outros verbos
que aprenderemos melhor mais para frente.

Acessar a api no browser:
http://localhost:8080/calculadora/somar?valor1=15&valor2=20
 */
@RestController
@RequestMapping("/calculadora")
class CalculadoraController {

    // Forma 1 de escrever a função
    @GetMapping("/somar")
    fun somar(valor1: Int, valor2: Int):Int{
        return valor1 + valor2
    }

    // Forma 2 de escrver a função simplificada
    @GetMapping("/multiplicar")
    fun somarValores(valor1: Int,valor2: Int) = valor1 * valor2



}