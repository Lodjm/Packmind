type NotEmptyString<T extends string> = T extends '' ? never : T;

function getNumberCharOfName<T extends string>(myName: NotEmptyString<T>) {
    if (myName.length === 0) {
        throw new Error("Name can't be empty");
    }

    //...
}

getNumberCharOfName('') // Generate an error because empty string is never type