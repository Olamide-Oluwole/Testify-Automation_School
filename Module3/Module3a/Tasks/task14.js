// A program that shows a JS book object using object literals
//Add a toggleReadingStatus method to your books objects. 

const books =
{
    title: "The Quality Advocate",
    description: "This book speaks about quality as a culture",
    numberOfPages: 100,
    author: "Olamide Oluwole",
    reading: false,
    toggleReadingStatus: function () {
        if (books.reading === true) {
            this.reading = false;
        }
        else
            this.reading = true;
    }

    
}
books.toggleReadingStatus();
console.log(books.reading)
