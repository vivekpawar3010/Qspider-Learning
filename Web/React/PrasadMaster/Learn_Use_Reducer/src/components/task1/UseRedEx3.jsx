import { useReducer } from "react";

const initialState = {
  id: Date.now(),
  quote: "",
  author: "",
  quotes: []
};

const UseRedEx3 = () => {
  let reducer = (state, action) => {
    switch (action.type) {
      case "createQuote":
        return { ...state, [action.payload.name]: action.payload.value }
      case "addQuote":
        return {
          ...state,
          quotes: [...state.quotes, action.payload.quoteData],
          id: action.payload.nextId,
          quote: "",
          author: ""
        }
      case "deleteQuote":
        return { ...state, quotes: action.payload }
      case "updateQuote":
        return { ...state, quote: action.payload.quote, author: action.payload.author, id: action.payload.id }
      default:
        return state;
    }
  }

  let [state, dispatch] = useReducer(reducer, initialState)
  console.log(state);

  let handleChange = (e) => {
    dispatch({ type: "createQuote", payload: e.target })
  }

  let handleSubmit = (e) => {
    e.preventDefault()
    dispatch({
      type: "addQuote",
      payload: {
        quoteData: { id: state.id, quote: state.quote, author: state.author },
        nextId: Date.now()
      }
    })
  }

  let handleDelete = (quote) => {
    let filteredQuotes = state.quotes.filter(q => q.id != quote.id)
    dispatch({ type: "deleteQuote", payload: filteredQuotes })
  }

  let handleUpdate = (quote) => {
    dispatch({ type: "updateQuote", payload: quote })
    handleDelete(quote)
  }

  return (
    <div>

      <div style={{ display: "flex", justifyContent: "center", margin: "30px" }}>
        <form action="" style={{ display: "flex", justifyContent: "center", flexDirection: "column" }}>
          <input type="text" placeholder='Quote' name='quote' value={state.quote} onChange={handleChange} /><br />
          <input type="text" placeholder='Author' name='author' value={state.author} onChange={handleChange} /><br />
          <button onClick={handleSubmit}>Submit</button>
        </form>
      </div>

      <table border="1">
        <thead>
          <tr>
            <th>Id</th>
            <th>Quote</th>
            <th>Author</th>
            <th>Edit</th>
            <th>Delete</th>
          </tr>
        </thead>
        <tbody>
          {
            state.quotes.length == 0 ? "Data not found" : state.quotes.map(quote => {
              return (
                <tr key={quote.id}>
                  <td>{quote.id}</td>
                  <td>{quote.quote}</td>
                  <td>{quote.author}</td>
                  <td><button onClick={() => { handleUpdate(quote) }}>CLICK</button></td>
                  <td><button onClick={() => { handleDelete(quote) }}>CLICK</button></td>
                </tr>
              )
            })
          }
        </tbody>
      </table>
    </div>
  )
}

export default UseRedEx3