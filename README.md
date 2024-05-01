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

   <span><code>byte</code> <code>idade</code> = <code>123;</code></span>

   <span><code>short</code> <code>ano</code> = <code>2024;</code></span>

   <span><code>int</code> <code>nums</code> = <code>21070332;</code></span>

   <span><code>long</code> <code>cp</code> = <code>3268578456L;</code></span>

   <span><code>float</code> <code>pi</code> = <code>3.14F;</code> // Insira F no final se não interpretara como double</span>

   <span><code>double</code> <code>salario</code> = <code>1975.53</code></span>

   <span><code>char</code> <code>sexo</code> = <code>"F";</code> // um caractere</span>

   <span><code>boolean</code> <code>doador</code> = <code>true</code></span>

   <span><code>String</code> <code>nome</code> = <code>"Leandro"</code> // String uma classe por isso letra Maiuscula inicial</span>
  
   <span><code>date</code> <code>dataNascimento</code> = <code>new Date()</code> // também classe. Precisa do import o java.utils</span>

</div>

<div>
    <h4> Exemplo de código constante </h4>
    <h5>Deve está em caixa alta (MAIUSCULA)</h5>
    <span><code>final double</code><code>VALOR_PI</code> = <code>3.14</code></span><br>
</div>

<hr>
<hr>
<br>
<hr>
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
    <!-- o metodo é -->
    <p>
        <span>Critérios não Obrigatórios mas boa práticas no JAVA</span>
        <br>
        <ul>
            <li> Deve ser nomeado como Verbo</li>
            <li> Seguir o padrão camelcase, começa com minuscula, e segunda Maiuscula</li>
            <li> lista 3 </li>
        </ul> 
        <br>
        <span> Exemplos:</span><br>
        <div>
            <code> somar(int num1, int num2){  }</code><br> 
            <code> abrirConexao(){  }</code><br> 
            <code> findById(int id){  }</code><br> 
        </div><br>
    </p>

</article>
<hr>
<hr>
<hr>
<article>
    <h3> PALAVRAS RESERVADA em JAVA (52 palavras)</h3>
    <!-- o escopo é -->
    <div>
        <span>No JAVA são 52 palavras resevada, e caracteristicas são todas em minusculas.</span>
        <p>
            <li>Controle de Pacotes</li>
            <span><code>import</code>: Importa pacotes ou classes para dentro do código</span><br>
            <span><code>package</code>: Especifica a que pacotes todas classes de arquivo</span><br>
            <hr>
            <li>Modificadores de Acesso</li>
            <span><code>public</code>: Acesso de qualquer classe</span><br>
            <span><code>private</code>: Acesso apenas dentro da classe</span><br>
            <span><code>protected</code>: Acesso por classes no mesmo pacote e subclasses-HERANÇA</span><br>
            <hr>
             <li>TIPOS PRIMITIVOS</li>
            <span><code>int</code> <code>short</code> <code>long</code> <code>double</code> <code>boolean</code> <code>byte</code> <code>char</code> <code>float</code> <code>void</code> <code>float</code> </span>
            <hr>
            <li>Modificadores de Classes, Variáveis ou métodos</li>
            <span><code>abstract</code>: classe que ñ pode ser instaciada ou método que precisa ser implementado por uma subclasse na abstrata</span><br>
            <span><code>class</code>: Especifica uma classe</span><br>
            <span><code>extends</code>: Indica a superclasse que a subclasse está extendendo</span><br>
            <span><code>final</code>: Impossibilita que uma classe seja extendida, que método ou variaveis seja subscrito ou variavel reinicializada</span><br>
            <span><code>implements</code>: indica as interface de uma classes irá implementar</span><br>
            <span><code>interface</code>: Especifica uma interface</span><br>
            <span><code>native</code>: Indica que é um método está escrita em linguagem dependente de plataforma, linguagem C por exemplo</span><br>
            <span><code>new</code>: Instancia um no objeto, chamando seu construtor</span><br>
            <span><code>static</code>: Faz um método/variavél pertencer a classe ao ines de as instancias</span><br>
            <span><code>strictfp</code>: Usado em frente de um método ou classe para indicar que os numeros de ponto flutuante seguirão as regras de ponto flutuante em todas as expressões </span><br>
            <span><code>synchronized</code>: Indica que um método só pode ser acessado por uma thread de cada vez</span><br>
            <span><code>transient</code>: Impede a serialização de campos</span><br>
            <span><code>volatile</code>: Indica que uma variavel pode ser alterada durante o uso de threads</span><br>
            <hr>
            <li>Controle de Fluxo de dentro de um bloco de código</li>
            <span><code>break</code>: Saida do bloco que ele está</span><br>
            <span><code>case</code>: Executa um bloco de código dependendo do teste do switch</span><br>
            <span><code>continue</code>: pula a execução do código que viria após essa linha e vai para a proxima passagem do loop</span><br>
            <hr>
            <div> E outas palavras reservadas</div>
        </p>
    </div> 
    
</article>
<hr>
<hr>
<hr>