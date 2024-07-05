package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...
    
    public String whileLoop() {
        String result = "";
        // create a `counter`
        int counter = 0;
        // while `counter` is less than length of array
        while (counter < personArray.length) {
            // begin loop

            // use `counter` to identify the `current Person` in the array
            Person currentPerson = personArray[counter];
            // get `string Representation` of `currentPerson`
    String strRepresentation = currentPerson.toString();
            // append `stringRepresentation` to `result` variable
    result += strRepresentation;
            counter++;
            // end loop
        }
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment
for(int i = 0; i < personArray.length; i++){
        // use the above clauses to declare for-loop signature
            // begin loop
        Person currentPerson = personArray[i];
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
    String strRepresentation = currentPerson.toString();
                // append `stringRepresentation` to `result` variable
    result += strRepresentation;

            // end loop


    } return result;
}


    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name
        int increment = 0;
        for (Person person : personArray) {
    Person currentPerson = personArray[increment];
            // use `counter` to identify the `current Person` in the array

            // get `string Representation` of `currentPerson`
            String strRepresentation = currentPerson.toString();

            // append `stringRepresentation` to `result` variable
            result += strRepresentation;

        increment++;
        }return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
