import ContextContainer from "./components/ContextContainer";
import Home from "./components/Home";
import Parent from "./components/Parent";
import Profile from "./components/Profile";

let App = () => {
  return (
    <div>
      <h1>Hello, React! App component</h1>
      {/* <ContextContainer>
        <Home></Home>
        <Profile></Profile>
      </ContextContainer> */}
      <Parent></Parent>
    </div>
  )
}

export default App;