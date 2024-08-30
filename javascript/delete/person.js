const person = {
    firstName: 'John',
    lastName: 'Test',
    gender: "abc"
}

delete person.gender

console.log(person); // { firstName: 'John', lastName: 'Test' }