package pharmacy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class IterablePharmacy implements Iterable<Component>, Comparable<IterablePharmacy> {
    private int index;
    private int id;
    private List<Component> components;


    public IterablePharmacy(int id) {
        this.index = 0;
        this.id = id;
        this.components = new ArrayList<>();
    }

    public void addComponents(Component ... components) {
        if (components.length == 0) System.out.println("Nothing has been added to the list of components.");
        else Collections.addAll(this.components, components);
    }


    @Override
    public String toString() {
        return "IterablePharmacy [id=" + id + "]";
    }

    public List<Component> getComponents() {
        return components;
    }

    // @Override
    // public Iterator<Component> iterator() {
    //     return new ComponentIterator(this);
    // }
    

    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() {

            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Component next() {
                return components.get(index++);
            }
            
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IterablePharmacy that = (IterablePharmacy) o;
        return index == that.index && Objects.equals(components, that.components);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, components);
    }

    @Override
    public int compareTo(IterablePharmacy o) {
        return Integer.compare(this.id, o.id);
    }


}
