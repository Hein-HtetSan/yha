


function moveon(){
    let answer = confirm("Ready to move on to W3Schools.com?");
    if (answer) {
        window.location = "https://www.w3schools.com";
    }
}

setTimeout(moveon, 600)