class Person {
    #id;
    #firstName;
    #lastName;

    constructor(id, firstName, lastName) {
        this.#id = id;
        this.#firstName = firstName;
        this.#lastName = lastName;
    }

    get firstName() {
        return this.#firstName
    }

    get lastName() {
        return this.#lastName
    }

    set firstName(firstName) {
        this.#firstName = firstName
    } 

    set lastName(lastName) {
        this.#lastName = lastName
    }
}

const person = new Person(25, 'John', 'Test');
person.firstName = 'Marc'
person.lastName = 'Doe'

console.log(person.firstName); // Marc
console.log(person.lastName); // Doe