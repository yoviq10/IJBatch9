package com.class25.CastingDemo;

import com.class25.Overriding.FatherOverriding;
import com.class25.Overriding.Ozoda;

public class Casting {

    FatherOverriding father=new Ozoda("ozoda");

    Ozoda ozoda=(Ozoda) father;

    double var1=10.0;
    int var2=(int) var1; //down casting but forcing it with () parenthesis


}
