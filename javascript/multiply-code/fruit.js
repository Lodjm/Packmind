const FRUITS = {
    apple: 'Apple',
    banana: 'Banana',
    cherry: 'Cherry',
    orange: 'Orange'
}

function isAppleOrBanana(fruit) {
    if(fruit === FRUITS.apple || fruit === FRUITS.banana) {
        return true;
    }

    return false;
}