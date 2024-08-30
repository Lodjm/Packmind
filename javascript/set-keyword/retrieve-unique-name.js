const names = ['Alice', 'Bob', 'Alice', 'Charlie', 'Bob', 'David'];

function removeDuplicates(names) {
    const uniqueNames = [];
    for (const name of names) {
        if (!uniqueNames.includes(name)) {
            uniqueNames.push(name);
        }
    }
    return uniqueNames;
}

const uniqueNames = removeDuplicates(names);

console.log(uniqueNames); // ['Alice', 'Bob', 'Charlie', 'David']