// This program converts length from Centimeter to Metre

const lengthInCm = 100;

function lengthconverter (lengthInCm){
    let lengthInMetres = lengthInCm/100
    return lengthInMetres;
}
// Display the converted length to the console
console.log("The converted length in metre is "+lengthconverter(lengthInCm))
