package org.example.DTO;

import java.util.Optional;
import lombok.Getter;

@Getter
public class Y {
    Z z ;

    public Y(Z z){
        this.z = z;
    }
}
