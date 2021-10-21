import UIKit

func ePar(valor: Int) -> Bool {
 if (valor % 2 == 0) {
 return true;
 }
 return false;
}


print("O resultado \(5*5)")

print("Is number even ? \(ePar(valor:3))")


// exec 4

func sqare(valor: Int) -> Int{
    return valor*valor
}

print ("O quadrado e \(sqare(valor:3))")

//exec 5
func sub(valor: Float, valor2: Float) -> Int{
    return Int(valor-valor2)

}
print ("A subtração e \(sub(valor:3.0, valor2: 2.0))")


//exec 6

var frutas = ["Banana", "Laranja", "Ananas"]
for fruta in frutas {
print("Come \(fruta)!")
}

frutas.append("Maçã", at : 1)


