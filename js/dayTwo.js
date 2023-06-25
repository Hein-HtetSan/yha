
let print = (e) => {
    console.log(e);
}

let printr = (e) => {
    for(let i=0; i<e.length; i++){
        console.log(e[i]);
    }
}

let printo = (e) => {
    // for(let i=0; i<e.size; i++){
    //     console.log(e);
    // }   
    console.log(e);
}

const student = {
    name: "Khant Htet",
    age: 19,
    gender: "male",
    hobby: "dancing with problems"
}

const Car = {
    brand: "Crown",
    color: "white",
    year: 2023,
    modal_id: 1,
    price: 10000
}

// array data type
let fruits = ["apple", "orange", "mango", "banana", 30, "pineapple"];

let sports = [
    "Soccer",
    "Tennis",
    "Badmintan",
    "Table Tennis",
    "Vollyball"
]


const person = {
    name: "Khant Htet",
    age : 19,
    hobby: ["coding", "listening to music", "reading", "video Game"]
}

// console.log("My hobby is " + person.hobby[0]);


let phone = [
    {name: "iphone", ram: 4, storage: 64},
    {name: "xiaomi", ram: 8, storage: 128},
    {name: "samsung", ram: 6, storage: 256}
]

let fru = ["watermelon", "coconut", "cherry", "blueberry"]

// console.log(phone[1].name);
// console.log(phone[2].name);
// console.log(phone.length);

fruits.pop();
fruits.pop();
// console.log(fruits.toString());

fruits.push("Pineapple");
// console.log(fruits)

fruits.shift();
// console.log(fruits);

fruits.unshift("apple");
// console.log(fruits);

// console.log(fruits.concat(fru));



// delete fruits[2];
// console.log(fruits);


let username = "khant htet";
let password = 22270;
if(username === "khant htet" && password === 22270){
    console.log("login successfully");
}else{
    console.log("username or password is worong!");
}

const temperature = document.querySelector(".temp");

let degreeValue = 20;

if(degreeValue < 10){
    temperature.innerHTML = "<small>the weather is freezing</small>";
}else if(degreeValue < 20){
    temperature.innerHTML = "weather is cold";
}else if(degreeValue < 30){
    temperature.innerHTML = "weather is normal";
}else{
    temperature.innerHTML = "weather is hot";
}


let day = 3;
let dayname;
switch(day){
    case 1: dayname = "Sunday"; break;
    case 2: dayname = "Monday"; break;
    case 3: dayname = "Tuesday"; break;
    case 4: dayname = "Wednesday"; break;
    case 5: dayname = "Thursday"; break;
    case 6: dayname = "Friday"; break;
    default : dayname = "unknown";
}

console.log(dayname);

for(let i=0; i<10; i++){
    console.log("output : " + i);
}

let start = 1;
while(start<=10){
    console.log(start);
    start++;
}
let i=0;
do{
    console.log("do while loop runs code for one time");
    i++;
}while(i < 5);