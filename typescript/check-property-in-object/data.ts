interface Account {
    id?: string;
    username: string;
    password?: string;
}
function displayIdFromData(data: Account) {
    if(data.hasOwnProperty('id')) {
        console.log(data.id)
    }
}