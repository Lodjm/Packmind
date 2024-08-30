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
    const isTokenValidResponse = await verifyTokenValidy('MY_TOKEN');
    
    if(!isTokenValidResponse.ok) {
        throw new Error('A server error occurs when the server tries to check the token validation.')
    }

    const isTokenValid = await isTokenValidResponse.json();

    if(!isTokenValid) {
        return {};
    }

    const userInfoResponse = await getUserInfoById('1235');

    if(!userInfoResponse.ok) {
        throw new Error("A server error occurred when the server tried to retrieve the user's information");
    }

    return userInfoResponse.json();
}
