import { createRoot } from 'react-dom/client';
import App from './App.jsx';
import { configureStore, createSlice } from '@reduxjs/toolkit';
import { Provider } from 'react-redux';


let counterSlice = createSlice({
    name: 'counter',
    initialState: 0,
    reducers: {
        increment: (state, action) => {
            console.log(state);
            console.log(action);
            return state + 1;
        },
        decrement: (state, action) => {
            console.log(state);
            console.log(action);
            return state - 1;
        },
        reset: (state, action) => {
            console.log(state);
            console.log(action);
            return 0;
        },
    }
})

// create second slice
let SecondSliceMath = createSlice({
    name: 'second',
    initialState: 0,
    reducers: {
        square: (state, action) => {
            console.log(state);
            console.log(action);
            return state * state;
        },
        cube: (state, action) => {
            console.log(state);
            console.log(action);
            return state * state * state;
        },
        divide2: (state, action) => {
            console.log(state);
            console.log(action);
            return state / 2;
        },
        multiply2: (state, action) => {
            console.log(state);
            console.log(action);
            return state * 2;
        },

    }
});

let store = configureStore({
    reducer: {
        counter: counterSlice.reducer,
        second: SecondSliceMath.reducer,
    }
})

console.log("store", store); 
console.log(counterSlice.actions);
console.log(SecondSliceMath.actions);
export let actions1 = {
    counterSlice.actions
}
export let actioin2 = {
    SecondSliceMath.actions
};

createRoot(document.getElementById('root')).render(
    <Provider store={store}>
        <App />
    </Provider>
);
