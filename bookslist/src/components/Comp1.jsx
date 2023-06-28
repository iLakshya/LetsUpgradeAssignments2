import React, { Component } from 'react';
import ReactDOM from 'react-dom';

class Comp1 extends Component {
  state = {
    books: [
      {
        title: "The Hitchhiker's Guide to the Galaxy",
        author: 'Douglas Adams',
        genre: 'Science fiction',
      },
      {
        title: 'To Kill a Mockingbird',
        author: 'Harper Lee',
        genre: 'Literary fiction',
      },
      {
        title: 'The Lord of the Rings',
        author: 'J.R.R. Tolkien',
        genre: 'Fantasy',
      },
    ],
  };

  render() {
    return (
      <ul>
        {this.state.books.map((book) => (
          <li key={book.id}>
            <h3>{book.title}</h3>
            <p>By {book.author}</p>
            <p>Genre: {book.genre}</p>
          </li>
        ))}
      </ul>
    );
  }
}

// export{};
const rootElement = document.getElementById('root');
ReactDOM.render(<bookslist />, rootElement);