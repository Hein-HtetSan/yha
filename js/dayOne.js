let a = 4;
let b = 5;

console.log("a++ : " + a++); // postfix
console.log("++a : " + ++a); // prefix

console.log("a-- : " + a--); // postfix
console.log("--a : " + --a); // prefix

b += 3;
console.log("b+=3 : " + b + " // b = 5");

b -= 3;
console.log("b-=3 : " + b + " // b = 8");

b *= 3;
console.log("b*=3 : " + b + " // b = 5");

b /= 3;
console.log("b/=3 : " + b + " // b = 15");

b %= 3;
console.log("b%=3 : " + b + " // b = 5");

b **= 3;
console.log("b**=3 : " + b + " // b = 2");

let name = "Hein Htet San";

if(name !== "Hein Htet San"){    
    console.log("they are not same at either datatype or name!");
}else{
    console.log("they are same at datatype and name!");
}

let mark = 80;
if(mark == 100){
    console.log("passed with the ever greatest destination");
}else if(mark >= 80){
    console.log("passed with destination");
}else if(mark >= 60){
    console.log("passed with average");
}else if(mark >= 40){
    console.log("passed");
}else{
    console.log("failed");
}

let y = 20;
if(y >= 20){
    console.log("greater than 20");
}else if(y <= 20){
    console.log("less than 20")
}else{
    console.log("neither greater nor less than 20");
}

let my_hobby = "coding with coffee";
let fav_movie = "Across the spider-verse";


let count = 4;
let place = "Heldan";
let fruit = "apple";
if(count > 1){
    fruit += "s";
    console.log(`I bought ${count} ${fruit} from ${place} yesterday!`);
}else{
    console.log(`I bought ${count} ${fruit} from ${place} yesterday!`);
}


// logical operators
let user_name = "khant htet";
let password = 12345;

// if(user_name === "khant htet" && password === 12345){
//     console.log("login successfully");
// }else{
//     console.log("username or password is incorrect");
// }


// ternary operator
let username = (user_name === "khant htet") ? "Hein Htet San" : "Khant Htet";
let result = (mark > 40) ? "passed" : "failed";
console.log(username + "\n" + result);

if(!user_name === "hein htet san" && !password === 54321){
    console.log("login successfully");
}else{
    console.log("username or password is incorrect");
}

let c = 33;
c = null;
 console.log(c);