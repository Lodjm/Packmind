function verifyTokenValidy(token) {
    return fetch(`https://api.example.com/token-is-valid?token=${token}`, {
        method: 'GET',
        headers: {
            'Content-Type': 'application/json'
        },
    })
}

function getUserInfoById(userId) {
    return fetch(`https://api.example.com/user-info?userId=${userId}`, {
        method: 'GET',
        headers: {
            'Content-Type': 'application/json'
        },
    }) 
}


async function main() {
    return verifyTokenValidy('MY_TOKEN')
    .then((isTokenResponse) => {
        return isTokenResponse.json().then(isTokenValid => {
            if(!isTokenValid) {
                return {}
            }

            return getUserInfoById('1235')
                .then(userResponse => {
                    return userResponse.json().then(() => userResponse)
                })
                .catch(() => { 
                    throw new Error("A server error occurred when the server tried to retrieve the user's information") 
                })
        })
    })
    .catch(() => { 
        throw new Error('A server error occurs when the server tries to check the token validation.')
     })
}