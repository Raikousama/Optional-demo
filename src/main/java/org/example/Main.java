package org.example;

import java.util.Optional;
import org.example.DTO.DemoObject;
import org.example.DTO.X;
import org.example.DTO.Y;
import org.example.DTO.Z;

public class Main {
    public static void main(String[] args) {

        var demoObject = allNonNullDemoObject();
        var print = demoObject.map(DemoObject::getX).map(X::getY).map(Y::getZ).map(Z::getValue)
            .orElse("No Value");
        System.out.println(print);
    }

    public static Optional<DemoObject> allNonNullDemoObject(){
        Z z = new Z("value");
        Y y = new Y(z);
        X x = new X(y);
        return Optional.of(new DemoObject(x));
    }
}