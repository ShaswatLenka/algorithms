package Graph;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Node<T> {
    private @Getter @Setter T value;
}
