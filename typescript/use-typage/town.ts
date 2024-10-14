
type Town = 'Paris' | 'London' | 'Rome';

function getCountryFromTown(town: Town): string {
    switch(town) {
        case 'Paris':
            return 'France'
        case 'London':
            return 'UK'
        case 'Rome':
            return 'Italy'
        default:
            const townLocation: never = town;
            throw new Error(`${town} is unknown`)
    }

}