//
//  tip_count.swift
//  calculadora
//
//  Created by Rui Costa on 09/11/2021.
//

import UIKit

class tip_count: NSObject {
    var numero : Int = 15
    
    func calculate(){
        
    }
    
    func moreCount() {
        if(numero<25){
            self.numero+=1
        }
        
        }
    
    func lessCount() {
        if(numero>15){
            self.numero-=1
        }
    }
    
    func resetCount() {
        self.numero=15
        
    }
    
    func getCount() -> Int{
        return self.numero;
    }
}
