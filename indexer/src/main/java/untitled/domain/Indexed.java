package untitled.domain;

import untitled.domain.*;
import untitled.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Indexed extends AbstractEvent {

    private Long id;

    public Indexed(Index aggregate){
        super(aggregate);
    }
    public Indexed(){
        super();
    }
}
