// store.js
import { configureStore } from '@reduxjs/toolkit';
import counterReducer from './Task1';

export const store = configureStore({
  reducer: {
    counter: counterReducer,
  },
});