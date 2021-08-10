//
//  SelleoToast.m
//  NativeTests
//
//  Created by Bartosz Boruta on 10/08/2021.
//

#import <Foundation/Foundation.h>
#import "React/RCTBridgeModule.h"

@interface RCT_EXTERN_MODULE(SelleoToast, NSObject)
  RCT_EXTERN_METHOD(showToast:(NSString *)message delay:(nonnull double *)delay)
@end
