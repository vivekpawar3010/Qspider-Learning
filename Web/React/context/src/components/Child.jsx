import React from 'react'

const Child = () => {
  return (
    <div>
      <h1>This is Child component</h1>
      <button 
      
      >Button from Child</button>
    </div>
  )
}

export default React.memo(Child)
