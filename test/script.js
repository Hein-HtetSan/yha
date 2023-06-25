const links = document.getElementById("link");
const btn = document.querySelector(".btn");
let link_tag;
let target;
let items = [];


function searching() {
    link_tag = links.value;
}

let find_something = () => {
    
    window.open("http://google.com/search?q="+link_tag);
    
    items.push(link_tag);
    link_tag = " ";
    links.value = " ";
    console.log(items);
}

links.addEventListener("keypress", (e) => {
    if(e.key == "Enter"){
        find_something();
    }
})

btn.addEventListener("click", () => {
    find_something();
})
