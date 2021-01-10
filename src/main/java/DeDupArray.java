import models.Person;

import java.util.*;
import java.util.stream.Collectors;

public class DeDupArray {


    public static List<Person> deDupStream(Person[] arr){
        List<Person> list = Arrays.asList(arr.clone());
        Collections.sort(list);

        List<Person> output = list.stream().distinct().collect(Collectors.toList());
        return output;
    }

    public static List<Person> deDupManual(Person[] arr){
        List<Person> list = Arrays.asList(arr.clone());
        Collections.sort(list);

        List<Person> output = new ArrayList<>();

        output.add(list.get(0));
        for (int i = 0; i < list.size(); i++) {
           if (!output.get(output.size() -1).equals(list.get(i))){
               output.add(list.get(i));
           }
        }

        return output;

    }

    public static Person[] deDupOldManual(Person[] arr){

        // create an output array that's the same size as the input array
        // since we're using basic array it needs to be same size but of course will
        // be smaller
        Person[] output = new Person[arr.length];

        // populate the first element of the output array to get started
        output[0] = arr[0];

        // track the index of the output that isn't null
        int j = 1;

        // now loop over the input array
        for (int i = 0; i < arr.length; i++) {
            // check the last item in output is not eq to current item in iteration
            if (!output[j -1].equals(arr[i])){
                // add it to the array if they're not eq
                // and increment the non-null output index
                output[j++] = arr[i];
            }
        }

        return Arrays.copyOf(output, j);
    }

    public static Person[] deDupWithSet(Person[] arr){
        Arrays.sort(arr);
        Set<Person> people = new HashSet<>();
        people.addAll(Arrays.asList(arr));

        return people.toArray(new Person[people.size()]);

    }
}
