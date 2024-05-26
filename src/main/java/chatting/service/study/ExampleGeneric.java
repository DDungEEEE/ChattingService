package chatting.service.study;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExampleGeneric<T, K> {
    public T type;
    public K kind;
}
