function getUserInfoById(userId, token) {
    return fetch(`https://api.example.com/user-info?userId=${userId}&token=${token}`, {
        method: 'GET',
        headers: {
            'Content-Type': 'application/json'
        }
    })
}

console.log(getUserInfoById("1234")); // Call API with missing token's argument