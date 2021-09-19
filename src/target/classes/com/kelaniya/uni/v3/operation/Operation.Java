package com.kelaniya.uni.v4.operation;
// abstarct class of interface class
public interface class Operation {
   //interface class is better for This situation
    //Animal. dog,catb .... Animal -> abstarct when common proparties share with child classes it is aabstract class E.g: Age
    // -> sharabale properties Age preferance
    // -> sharable methods/behevious

    //when method names are shareables we use interface classes
    // implimentation can be deffer
    //sharable -> method names
    // add op-> execute mul->execute

    Double execute(Double[] numbers); //method signuture

}