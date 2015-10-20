/*
 * Copyright (C) 2014 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.samples.contractr.ios.viewcontrollers;

import org.robovm.apple.foundation.NSMutableArray;
import org.robovm.apple.uikit.UIColor;
import org.robovm.apple.uikit.UIView;
import org.robovm.apple.uikit.UIViewController;
import org.robovm.objc.annotation.CustomClass;
import org.robovm.objc.annotation.IBOutlet;
import org.robovm.samples.contractr.ios.IOSColors;
import org.robovm.samples.contractr.ios.NSLayoutConstraintUtil;
import org.robovm.samples.contractr.ios.iosplot.PCPieChart;
import org.robovm.samples.contractr.ios.iosplot.PCPieComponent;

@CustomClass("ReportsViewController")
public class ReportsViewController extends UIViewController {

    @IBOutlet PCPieChart pieChart;

    @Override
    public void viewDidLoad() {
        super.viewDidLoad();
        
        pieChart.setDiameter(200);
        NSMutableArray<PCPieComponent> components = new NSMutableArray<PCPieComponent>(
                new PCPieComponent("Apple", 100, IOSColors.getClientColor(0)),
                new PCPieComponent("Google", 200, IOSColors.getClientColor(1)),
                new PCPieComponent("Oracle", 200, IOSColors.getClientColor(2))
                );
        pieChart.setComponents(components);
//        pieChart.setTranslatesAutoresizingMaskIntoConstraints(false);
//
//        UIView rootView = getView();
//        rootView.setBackgroundColor(UIColor.white());
//        rootView.addSubview(pieChart);
//
//        rootView.addConstraint(NSLayoutConstraintUtil.centerHorizontally(pieChart, rootView, 1.0, 0));
//        rootView.addConstraint(NSLayoutConstraintUtil.centerVertically(pieChart, rootView, 1.0, 0));
//        rootView.addConstraint(NSLayoutConstraintUtil.equalWidth(pieChart, rootView, 1.0, 0));
//        rootView.addConstraint(NSLayoutConstraintUtil.equalHeight(pieChart, rootView, 1.0, 0));
    }
    
}
