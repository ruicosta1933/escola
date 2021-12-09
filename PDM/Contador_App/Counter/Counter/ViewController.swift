//
//  ViewController.swift
//  Counter
//
//  Created by Rui Costa on 02/11/2021.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var titulo: UILabel!
    @IBOutlet weak var number: UILabel!
    
    var contador : Contador = Contador()
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }

    @IBAction func reset(_ sender: Any) {
        contador.resetCount()
        update()
    }
    @IBAction func plus(_ sender: Any) {
        contador.moreCount()
        update()
    }
    @IBAction func minus(_ sender: Any) {
        contador.lessCount()
        update()
    }
    
    func update() {
       number.text = String(contador.getCount())
    }
    
}

