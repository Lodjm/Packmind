function calculateSum(a, b) {
    let sum = a + b;
    return sum;
}

function findMax(numbers) {
    let max = numbers[0];
    for (let i = 1; i < numbers.length; i++) {
        if (numbers[i] > max) {
            max = numbers[i];
        }
    }
    return max;
}

let result = calculateSum(5, 10);
console.log('Sum:', result);

let maxNumber = findMax([3, 6, 2, 8, 4]);
console.log('Max number:', maxNumber);