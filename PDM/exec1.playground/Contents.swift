import UIKit
//exec 1
func ePar(valor: Int) -> Bool {
 if (valor % 2 == 0) {
 return true;
 }
 return false;
}

// exec2

func floatToSring(valor: Float) -> String{
    return String(valor)
}
print ("To string \(floatToSring(valor:3.3))")

// exec 3
print("O resultado \(5*5)")

print("Is number even ? \(ePar(valor:3))")


// exec 4

func sqare(valor: Int) -> Decimal{
    
    let valor1 = pow(Decimal(valor), 2)
    
    return valor1
    
}

print ("O quadrado e \(sqare(valor:3))")

//exec 5
func sub(valor: Float, valor2: Float) -> Int{
    return Int(valor-valor2)

}
print ("A subtração e \(sub(valor:3.0, valor2: 2.0))")


// EX06

var frutas = ["Banana", "Laranja", "Ananás"]

frutas.append("Pessego")
frutas.append(contentsOf: ["Uva", "Maça"])
frutas.insert("Melancia", at: 1)
frutas.remove(at: 5)

for fruta in frutas {
    print(fruta)
}

print(frutas.count)

// EX07

let frase = "Beta is Latin for does not work"

print(frase.split(separator: " ").count)
let array = frase.split(separator: " ")

// print(array.contains(where: <#T##(String.SubSequence) throws -> Bool#>))




