package org.example.DTO;
import java.util.Optional;
import lombok.Getter;

@Getter
public class X {
   private Y y;

   public X (Y y) {
    this.y = y;
   }

}