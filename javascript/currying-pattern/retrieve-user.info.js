function getUserInfoById(userId, token) {
    if(!token) {
        return token => getUserInfoById(userId, token)
    }

    return fetch(`https://api.example.com/user-info?userId=${userId}&token=${token}`, {
        method: 'GET',
        headers: {
            'Content-Type': 'application/json'
        }
    })
}

console.log(getUserInfoById("1234")); // Return [Function (anonymous)]