const names = ['Alice', 'Bob', 'Alice', 'Charlie', 'Bob', 'David'];

const uniqueNames =  [...new Set(names)];

console.log(uniqueNames); // ['Alice', 'Bob', 'Charlie', 'David']