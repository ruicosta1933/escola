(:
for $p in collection("Precos")//produto
order by number($p//preco) descending
return $p//nome/text()
:)
(:
avg(collection("Precos")//preco)
:)
(:
let $p := collection("Precos")//produto[nome = "lápis"]/preco
let $b := collection("Precos")//produto[nome = "borracha"]/preco
return $p+ 2*$b
:)
(:
collection("Precos")//produto[not(exists(desconto))]/nome/text()
:)



Some uma unidade ao id desta instrução e registe o número obtido. 90
Obtenha o símbolo correspondente a cada um dos números obtidos nas alíneas a)89
, c) e 56
d) e o 51
símbolo do nome do elemento químico da alínea b). 43 k2
Concatene esses símbolos pela ordem inversa com que foram obtidos.




Registe quantos elementos atómicos já tinham sido descobertos até ao ano (exclusive) em que se descobriu o elemento com o número atómico 32

Some uma unidade ao número de elementos que começam por "T" e registe o valor obtido. 11


89
2
56
51

51(Antimony Sb) 
56(Barium Ba)
2(Helio HE) 
89(Actinium Ac)

NI Cu 

