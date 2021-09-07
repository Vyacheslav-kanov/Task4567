package Task5;

import java.util.*;

public class RemoverDuplicate<T> {

    public <T>Collection<T> removeDuplicates(Collection<T> collection){
        Set<T> set = new HashSet<>(collection);
        return new ArrayList<T>(set);
    }
}
