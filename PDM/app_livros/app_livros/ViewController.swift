//
//  ViewController.swift
//  app_livros
//
//  Created by Rui Costa on 26/10/2021.
//

import UIKit

class ViewController: UIViewController {
    
    @IBOutlet weak var nameLabel: UILabel!
    
    

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }

    @IBAction func click(_ sender: AnyObject) {
        nameLabel.text="My name is Diogo!"
    }
    
}

