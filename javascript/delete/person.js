const person = {
    firstName: 'John',
    lastName: 'Test',
    gender: "abc"
}

const {gender, ...newPerson} = person

console.log(newPerson) // { firstName: 'John', lastName: 'Test'  }