// This program counts vowels in a string

function vowelsCount(statement) {
    // Use a regular expression to match vowels (both uppercase and lowercase)
    const regexForVowels = /[aeiouAEIOU]/g;
    
    // Use the match method to find all matches of vowels in the string
    const vowelMatches = statement.match(regexForVowels);
  
    // Gets the length of matched vowels
    return vowelMatches.length;
  }
  
  const inputString = "Coding challenge is amazing";
  console.log("The count of vowels in the statement *"+inputString + "* is " +vowelsCount(inputString));