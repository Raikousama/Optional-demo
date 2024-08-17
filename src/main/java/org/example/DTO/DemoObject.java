package org.example.DTO;
import java.util.Optional;
import lombok.Getter;

@Getter
public class DemoObject {
    X x;

    public DemoObject(X x) {
        this.x  = x;
    }


}
