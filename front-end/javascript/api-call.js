// https://api.github.com/users/ramanujds

// AJAX



async function fetchGithubUser(username){
    const url = "https://api.github.com/users/";
    let response = await fetch(url+username);

    let data = await response.json();
    
    console.log(data)

}   

