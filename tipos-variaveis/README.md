# DIO-java-basico
respositorio da DIO de java e de basico da linguagem. aprendizado no bootcamp do santander de 2024

<h2> D I O-java-basico-santander </h2>
 
Pata principal e default é a src/:

- `src`: pasta principal 
- `lib`: pasta de dependencias | the folder to maintain dependencies

Os arquivos copilados vão para a pasta `bin/`- no entando como são arquivos `.class` nao será enviados para o repositório

## Qualquer situação me adicione no linkedin:

- linkedin: https://www.linkedin.com/in/leandro-falcao/ 
- instagram: https://www.instagram.com/lebitec/ ...

 <div >   
    <a href="https://www.linkedin.com/in/leandro-falcao/-45875016a" target="_blank">
        <img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"/>
    </a>
    <a href="https://www.instagram.com/lebitec/" target="_blank"> 
        <img src="https://img.shields.io/badge/instagram-%23ff0F.svg?&style=for-the-badge&logo=instagram&logoColor=f00" target="_blank" /> 
   </a>
</div>

<h3> Dados de valores de Variáveis em JAVA tipo primitivos </h3>

| Tipo    | qtd Memoria | Valor Min          | Valor Max   |
|---------|-------------|--------------------|-------------|
| byte    | 1 byte      | -128               | 127
| short   | 2 bytes     | -32.768            | 32.768
| int     | 4 bytes     | -2.147.483.648     | 2.147.483.648
| long    | 8 bytes     | -9.223.372 * 10*12 | 9.223.372 * 10*12
| float   | 4 bytes     | -3,4028E + 38      | 3,4028E + 38
| double  | 8 bytes     | -1,7976E + 308     | -1,7976E + 308

<div>
   <h4> Exemplos em código java</h4>

   <span><code style="color: #5bfc7e;">byte</code> <code style="color: #f0b630;">idade</code> = <code style="color: #4872a1;">123;</code></span>

   <span><code style="color: #5bfc7e;">short</code> <code style="color: #f0b60;">ano</code> = <code style="color: #4872a1;">2024;</code></span>

   <span><code style="color: #5bfc7e;">int</code> <code style="color: #f0b630;">nums</code> = <code style="color: #4872a1;">21070332;</code></span>

   <span><code style="color: #5bfc7e;">long</code> <code style="color: #f0b630;">cp</code> = <code style="color: #4872a1;">3268578456L;</code></span>

   <span><code style="color: #5bfc7e;">float</code> <code style="color: #f0b630;">pi</code> = <code style="color: #4872a1;">3.14F;</code> // Insira F no final se não interpretara como double</span>

   <span><code style="color: #5bfc7e;">double</code> <code style="color: #f0b630;">salario</code> = <code style="color: #4872a1;">1975.53</code></span>

   <span><code style="color: #5bfc7e;">char</code> <code style="color: #f0b630;">sexo</code> = <code style="color: #4872a1;">"F";</code> // um caractere</span>

   <span><code style="color: #5bfc7e;">boolean</code> <code style="color: #f0b630;">doador</code> = <code style="color: #4872a1;">true</code></span>

   <span><code style="color: #5bfc7e;">String</code> <code style="color: #f0b630;">nome</code> = <code style="color: #4872a1;">"Leandro"</code> // String uma classe por isso letra Maiuscula inicial</span>
  
   <span><code style="color: #5bfc7e;">date</code> <code style="color: #f0b630;">dataNascimento</code> = <code style="color: #4872a1;">new Date()</code> // também classe. Precisa do import o java.utils</span>

</div>

<div>
    <h4> Exemplo de código constante </h4>
    <h5>Deve está em caixa alta (MAIUSCULA)</h5>
    <span><code style="color: #f01c05;">final double</code> <code style="color: #bb14fc;">VALOR_PI</code> = <code style="color: #14fc5e;">3.14</code>
    </span>
</div>

<hr>
<hr>
<br>
<hr>

<article>
    <h3> Operadores em JAVA</h3>
    <h4>Exemplos de operadores</h4>
    <!-- operador de atribuição '=' -->
    <p>
        <span> Atribuição '=' exemplos:</span>
        <br> 
        <span> String nome = "Leandro"; </span> 
        <br>
        <span> int num = 123; </span>
        <br>
    </p>
    <hr>
<!-- operador de matematicos de '+', '-','*', '/','%', '**','+', '+' -->
    <p>
        <span> Atr '+' exemplos:</span>
        <br> 
        <span> int somarNum= 2 + 5; // resultado é 7 </span> 
        <br>
        <br>
        <span> Atr '-' exemplo:</span>
        <br> 
        <span> int somarNum= 10 - 4; // resultado é 6 </span>
        <br>
        <span> Atr '*' exemplo:</span>
        <br> 
        <span> double somarNum= 5 * 4; // resultado é 20.0 </span>
        <br>
        <span> Atr '/' exemplo:</span>
        <br> 
        <span> int somarNum= 15 / 3; // resultado é 5 </span>
        <br>
        <br>
        <span> Atr '%' resto de divisao exemplo:</span>
        <br> 
        <span> double somarNum= 10 / 3; // resultado é 1.0 </span>
    </p>
    <hr>
<!-- operador de atribuição '=' -->
    <p>
        <span> Atribuição '=' exemplos:</span>
        <br> 
        <span> String nome = "Leandro"; </span> 
        <br>
        <span> int num = 123; </span>
        <br>
    </p>
    <hr>
    <hr>
   <h4>Exemplos de Unarioss</h4>
    <!-- operador de atribuição '=' -->
    <p>
        <span> Atribuição '+' valor positivo:</span>
        <br>
        <span> **Atribuição '+' pode ser um concatenador de string e etc</span>
        <br> 
        <span> Atribuição '-' valor negativo:</span>
        <br> 
        <span> Atribuição '++' valor incremeta mais um no valor</span>
        <br>
        <span> Atribuição '--' valor decrementa menos um no valor</span>
    </p>
    <hr>
    <hr>
<!-- operador ternario (se true)'?' -->
    <p>
        <span> Operadore Ternarios simbolo (se true) '?' já (se false) ':'  </span>
        <br> 
        <span> 'expressao codicional' ? 'caso true' : 'caso false' </span> 
        <br>
        <span> exemplo: </span><br>
        <span> int a, b; </span><br>
        <span>  a = 5; </span><br>
        <span>  b = 6; </span><br>
        <span> int a, b; </span><br>
    </p>
    <hr>
    <hr>
<!-- operador Relacionais '==' '!=' '>' '>=' '<' '<=' '&&' '||' -->
    <p>
        <span> Operadores Relacionais retorna um valor boobleano(true ou false) os operadores: '==' '!=' '>' '>=' '<' '<=' '&&' '||'</span>
        <br> 
        <span> 'expressao codicional' ? 'caso true' : 'caso false' </span> 
        <br>
        <span>'==' Verifica se variavel ou valoresc é igual ao outro </span><br>
        <span>'===' Verifica se variavel ou valores é estritamente iguais </span><br>
        <span>'!=' Verifica se variaveid/valores se são diferentes </span><br>
        <span>'!==' Verifica se variaveis ou valores são estritamente diferentes </span><br>
        <span>'>' Verifica se variaveis/valores são maior que </span><br>
        <span>'>=' Verifica se variaveis/valores são maior e igual que </span><br>
        <span>'<' Verifica se variaveis/valores são menor que </span><br>
        <span>'<=' Verifica se variaveis/valores são menor e igual que </span><br>
        <span><< Operadores Lógicos >></span><br>
        <span>'&&'  Verifica se variaveis/valores são E. todos tem ser true </span><br>
        <span>'||'  Verifica se variaveis/valores são OU. Um ou outro true</span><br>
        <br>
    </p>

</article>


<hr>
<hr>
<br>
<hr>

<article>
    <h3> Métodos em JAVA</h3>
    <h4>Exemplos de Métodos</h4>
    <!-- o metodo é -->
    <p>
        <span> Atribuição '=' exemplos:</span>
        <br> 
        <span> String nome = "Leandro"; </span> 
        <br>
        <span> int num = 123; </span>
        <br>
    </p>
    <hr>
<!-- operador de matematicos de '+', '-','*', '/','%', '**','+', '+' -->
    <p>
        <span> Atr '+' exemplos:</span>
        <br> 
        <span> int somarNum= 2 + 5; // resultado é 7 </span> 
        <br>
        <br>
        <span> Atr '-' exemplo:</span>
        <br> 
        <span> int somarNum= 10 - 4; // resultado é 6 </span>
        <br>
        <span> Atr '*' exemplo:</span>
        <br> 
        <span> double somarNum= 5 * 4; // resultado é 20.0 </span>
        <br>
        <span> Atr '/' exemplo:</span>
        <br> 
        <span> int somarNum= 15 / 3; // resultado é 5 </span>
        <br>
        <br>
        <span> Atr '%' resto de divisao exemplo:</span>
        <br> 
        <span> double somarNum= 10 / 3; // resultado é 1.0 </span>
    </p>
    <hr>
<!-- operador de atribuição '=' -->
    <p>
        <span> Atribuição '=' exemplos:</span>
        <br> 
        <span> String nome = "Leandro"; </span> 
        <br>
        <span> int num = 123; </span>
        <br>
    </p>
    <hr>
    <hr>
   <h4>Exemplos de Unarioss</h4>
    <!-- operador de atribuição '=' -->
    <p>
        <span> Atribuição '+' valor positivo:</span>
        <br>
        <span> **Atribuição '+' pode ser um concatenador de string e etc</span>
        <br> 
        <span> Atribuição '-' valor negativo:</span>
        <br> 
        <span> Atribuição '++' valor incremeta mais um no valor</span>
        <br>
        <span> Atribuição '--' valor decrementa menos um no valor</span>
    </p>
    <hr>
    <hr>
<!-- operador ternario (se true)'?' -->
    <p>
        <span> Operadore Ternarios simbolo (se true) '?' já (se false) ':'  </span>
        <br> 
        <span> 'expressao codicional' ? 'caso true' : 'caso false' </span> 
        <br>
        <span> exemplo: </span><br>
        <span> int a, b; </span><br>
        <span>  a = 5; </span><br>
        <span>  b = 6; </span><br>
        <span> int a, b; </span><br>
    </p>
    <hr>
    <hr>
<!-- operador Relacionais '==' '!=' '>' '>=' '<' '<=' '&&' '||' -->
    <p>
        <span> Operadores Relacionais retorna um valor boobleano(true ou false) os operadores: '==' '!=' '>' '>=' '<' '<=' '&&' '||'</span>
        <br> 
        <span> 'expressao codicional' ? 'caso true' : 'caso false' </span> 
        <br>
        <span>'==' Verifica se variavel ou valoresc é igual ao outro </span><br>
        <span>'===' Verifica se variavel ou valores é estritamente iguais </span><br>
        <span>'!=' Verifica se variaveid/valores se são diferentes </span><br>
        <span>'!==' Verifica se variaveis ou valores são estritamente diferentes </span><br>
        <span>'>' Verifica se variaveis/valores são maior que </span><br>
        <span>'>=' Verifica se variaveis/valores são maior e igual que </span><br>
        <span>'<' Verifica se variaveis/valores são menor que </span><br>
        <span>'<=' Verifica se variaveis/valores são menor e igual que </span><br>
        <span><< Operadores Lógicos >></span><br>
        <span>'&&'  Verifica se variaveis/valores são E. todos tem ser true </span><br>
        <span>'||'  Verifica se variaveis/valores são OU. Um ou outro true</span><br>
        <br>
    </p>

</article>
