const btn = document.getElementById("toggle")
let nav = document.querySelector(".nav-items")
const dropbtn = document.querySelector(".drop-btn")
let dropbox = document.querySelector('.drop-box')
let dropsm = document.querySelector('.drop-container-sm')
let box1 = document.querySelector('.box1')
let box2 = document.querySelector('.box2')
let navWrapper = document.querySelector(".nav-wrapper")

dropbtn.addEventListener("mouseenter", () => {
    dropbox.classList.toggle('active');
})

dropbox.addEventListener("mouseleave", () => {
    dropbox.classList.toggle('active');
})



dropsm.addEventListener('click', () => {
    box1.classList.toggle('active');
    box2.classList.toggle('active');
});




btn.addEventListener('click', () => {
    navWrapper.classList.toggle("active");
})