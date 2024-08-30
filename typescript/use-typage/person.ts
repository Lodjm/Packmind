const getObjectKeys = <TObj extends {}>(
    obj: TObj
) =>  Object.keys(obj) as Array<keyof TObj>

let person = {
    name: 'John',
    age: 30
};

const strongTypingResult = getObjectKeys(person); // typeof result: ("name" | "age")[]
