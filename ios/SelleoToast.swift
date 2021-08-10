//
//  SelleoToast.swift
//  NativeTests
//
//  Created by Bartosz Boruta on 10/08/2021.
//

import Foundation

@objc(SelleoToast)
class SelleoToast: NSObject {

  @objc
  func showToast(_ message: String, delay: Double = 1) {
    NSLog("Test1")
    print("Hello Swift1", delay)
    
    DispatchQueue.main.async{
      Toast.showToast(message, delay: delay)
    }
  }
}
