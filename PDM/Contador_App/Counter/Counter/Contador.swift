//
//  Contador.swift
//  Counter
//
//  Created by Rui Costa on 02/11/2021.
//

import UIKit

class Contador: NSObject {

        var numero : Int = 0
        
        func moreCount() {
            if(numero<20){
                self.numero+=1
            }
            
            }
        
        func lessCount() {
            if(numero>0){
                self.numero-=1
            }
            
            
            
            }
        
        func resetCount() {
            self.numero=0
            
        }
        
        func getCount() -> Int{
            return self.numero;
        }
    
}
