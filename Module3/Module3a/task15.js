// A program that create a books array
const books = [
    {
      title: "The test advocate",
      description: "talks on quality",
      numberOfPages: 10,
      authour: "Olamide Oluwole",
      reading: true
    },
    {
      title: "The daughter's love",
      description: "talks about how a daughter loves",
      numberOfPages: 15,
      authour: "Jojo Oluwole",
      reading: true
    },
    {
      title: "The God factor",
      description: "talks about God at the center",
      numberOfPages: 18,
      authour: "Gigi  Oluwole",
      reading: true
    },
    {
      title: "The Money Man",
      description: "talks about how to be driven by money",
      numberOfPages: 5,
      authour: "Tiara Oluwole",
      reading: false
    }
];
//Log all books information using a FOR loop where reading status is true
for (let i = 0; i < books.length; i++) {
    if (books[i].reading === true) {
        console.log("Title is " + books[i].title);
        console.log("This book " + books[i].description);
        console.log("Number of Pages is " + books[i].numberOfPages);
        console.log("Author is " + books[i].authour);
        console.log("------------------------------------")
        
    }
}