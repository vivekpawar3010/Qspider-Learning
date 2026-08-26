import { createContext } from 'react'

export let DataContext = createContext();


const ContextContainer = (props) => {
  let x = 100;
  return (
    <DataContext.Provider value={x}>
      <div>
        {props.children}
      </div>
    </DataContext.Provider>
  )
}

export default ContextContainer
