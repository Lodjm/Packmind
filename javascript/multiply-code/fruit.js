const FRUITS = {
    apple: 'Apple',
    banane: 'Banana',
    cherry: 'Cherry',
    orange: 'Orange'
}

function isAppleOrBanana(fruit) {
    if(fruit === 'Apple' || fruit === 'Banana') {
        return true;
    }

    return false;
}