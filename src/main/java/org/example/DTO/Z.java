package org.example.DTO;

import java.util.Optional;
import lombok.Getter;

@Getter
public class Z {
    String value;

    public Z(String value) {
        this.value = value;
    }

    public  Z(){
        this.value= null;
    }
}
