package pharmacy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class PharmacyMain {
    public static void main(String[] args) {
        Component pineceline = new Component("Pineceline", "10mg", 100);
        Component salt = new Component("Salt", "20gr", 10);
        Component sugar = new Component("Sugar", "87gr", 80);

        IterablePharmacy pharmacy1 = new IterablePharmacy(1);
        IterablePharmacy pharmacy2 = new IterablePharmacy(2);
        IterablePharmacy pharmacy3 = new IterablePharmacy(3);
        pharmacy1.addComponents(salt, pineceline);
        pharmacy2.addComponents(sugar, pineceline);
        pharmacy3.addComponents(sugar, pineceline);

        // for (Component c: pharmacy2) {
        //     System.out.println(c);
        // }

        // List<Component> list = new ArrayList<>();
        // list.add(salt);
        // list.add(pineceline);
        // list.add(sugar);
        // Collections.sort(list);
        // System.out.println(list);

        Set<IterablePharmacy> list = new HashSet<>();
        list.add(pharmacy3);
        list.add(pharmacy1);
        list.add(pharmacy2);
        System.out.println(list.size());

        List<IterablePharmacy> list2 = new ArrayList<>();
        list2.add(pharmacy3);
        list2.add(pharmacy1);
        list2.add(pharmacy2);
        Collections.sort(list2);
        System.out.println(list2);

    }
}
