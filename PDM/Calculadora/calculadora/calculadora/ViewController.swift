//
//  ViewController.swift
//  calculadora
//
//  Created by Rui Costa on 09/11/2021.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var price: UITextField!
    
    @IBOutlet weak var people: UITextField!
    
    @IBOutlet weak var slider: UISlider!
    
    @IBOutlet weak var stepper: UIStepper!
    
    @IBOutlet weak var tipLabel: UILabel!
    
    var tipPerc = 0.00
    var tip : tip_count = tip_count()
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }

    
    
    
    @IBAction func Calculate(_ sender: Any) {
        tip.calculate()
    }
    
    @IBAction func slide(_ sender: Any) {
        tipLabel.text = "\(tipPercSlider.value)%"
        tipPerc = Double(tipPercSlider.value)
        calculateTip()
        
        
    }
    
    @IBAction func buttons(_ sender: Any) {
        tip.moreCount()
        
        tip.lessCount()
        
        tip.resetCount()
        
    }
    
}

