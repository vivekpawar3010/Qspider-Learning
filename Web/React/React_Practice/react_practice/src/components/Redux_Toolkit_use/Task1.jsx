import React from 'react';
import { createSlice } from '@reduxjs/toolkit';

const counterSlice = createSlice({
  name: 'counter',
  initialState: 0,
  reducers: {
    inc: (state) => state + 1,
    dec: (state) => state - 1,
    reset: () => 0,
  },
});

export const { inc, dec, reset } = counterSlice.actions;
export default counterSlice.reducer;
