package com.solid.violations;

public class PrintDetails {

    //this class is only for showing Liskov-Principle
    void printToolDetails(Tool tool){
        System.out.println("Tool Name: "+tool.toolName+" "+"Tool Price: "+tool.toolPrice+" "+"Tool Mfg Year: "+tool.toolMfgYear);
    }
}
