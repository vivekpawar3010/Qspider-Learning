import React, { useReducer } from 'react'

const ToggleBtn = () => {
    let reducer = (state, action) => {
        return action.payload;
    };

    let initialState = false;
    let [state, dispatch] = useReducer(reducer, initialState);

    let handleClick = () => {
        dispatch({ type: 'TOGGLE', payload: !state });
    }
    return (
    <div>
      <button onClick={handleClick}>
        {state ? 'ON' : 'OFF'}
      </button>

      <div style={{ marginTop: '20px', textAlign: 'justify', display: state ? 'block' : 'none' }}>
        Lorem ipsum dolor sit, amet consectetur adipisicing elit. Esse ratione non quasi aperiam suscipit magnam consectetur laborum doloremque nobis fuga provident incidunt exercitationem iste molestiae amet dolorum, eos nihil debitis.
        Vero non, libero, eum facere porro maiores maxime, officiis illo deleniti qui provident fugiat numquam corrupti voluptatem saepe blanditiis eaque eligendi. Dolorum sapiente nam, similique in qui adipisci provident doloribus!
        Neque voluptatem numquam labore ex inventore harum repellat, nemo a qui reprehenderit vero itaque atque porro illum laboriosam impedit illo in quas cum fugiat. Officia qui ratione corrupti hic perspiciatis.
        Modi ullam, temporibus eum beatae nisi fuga, nemo corrupti harum doloremque neque ex? Et nobis atque aut, ratione tempora autem, deleniti distinctio facilis laudantium dolores fugit vel, eaque numquam error.
        Molestiae nostrum illum assumenda ipsum error eius sed rem? Velit consectetur illum voluptas numquam quos quibusdam impedit dolor voluptatem soluta minus officiis commodi ratione, perferendis sunt, omnis veritatis? Recusandae, nulla.
        Error asperiores perferendis enim nesciunt, illo fuga minima ad repellendus fugiat recusandae reiciendis ipsam nemo, tempora blanditiis debitis dolore! Accusantium ullam reprehenderit ab magni eos, facere voluptatem voluptates consequuntur! Ipsam!
        Sint, a? Hic eius reiciendis, qui est eveniet vel soluta, tempora id iure delectus quis molestias velit ex doloribus quaerat saepe voluptatem illum blanditiis iusto ullam sequi, voluptate architecto rerum?
        Ex repudiandae quidem nisi iusto rem delectus libero obcaecati, animi nobis officiis necessitatibus aperiam nulla commodi! Eos, praesentium error, officia a iusto laborum quaerat ducimus autem fugiat quis sequi adipisci!
        Quas, veniam maxime sequi perferendis reiciendis nemo suscipit laudantium saepe repellat delectus facere illo repudiandae eligendi nesciunt provident voluptatibus mollitia culpa reprehenderit qui? Veniam non nam ut eos sequi excepturi.
        Sapiente fugiat itaque explicabo accusamus quidem tempore placeat necessitatibus, exercitationem illum ab distinctio laudantium ducimus voluptates obcaecati id magni. Nostrum aspernatur laborum repellendus dicta at itaque et obcaecati incidunt suscipit?
      </div>

    </div>
  )
}

export default ToggleBtn
