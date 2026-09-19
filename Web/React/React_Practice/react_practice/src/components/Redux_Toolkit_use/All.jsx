import React from 'react'

const All = () => {
  return (
    <div>
      
    {/* 
    
## Q1. Basic Counter ⭐

Create a Redux Toolkit counter application.

### Requirements

Create:

```text
counterSlice
```

Initial state:

```js
{
    count: 0
}
```

Create these reducers:

```text
increment
decrement
reset
```

UI:

```text
Count: 0

[ Increment ]
[ Decrement ]
[ Reset ]
```

Use:

```js
createSlice()
configureStore()
useSelector()
useDispatch()
```

---

## Q2. Counter with Payload ⭐

Modify the counter so that the user can specify how much to increase/decrease.

Initial state:

```js
{
    count: 0
}
```

Example:

```js
dispatch(incrementBy(5))
```

should produce:

```text
Count: 5
```

Then:

```js
dispatch(incrementBy(10))
```

should produce:

```text
Count: 15
```

Create:

```text
incrementBy
decrementBy
reset
```

Use `action.payload`.

---

# Q3. Todo List ⭐⭐

Create a Todo application using Redux Toolkit.

Initial state:

```js
{
    todos: []
}
```

Each todo should look like:

```js
{
    id: 1,
    text: "Learn Redux",
    completed: false
}
```

Create reducers:

```text
addTodo
deleteTodo
toggleTodo
```

Example UI:

```text
☐ Learn React
☑ Learn Redux
☐ Practice JavaScript

[ Add Todo ]
```

Use `prepare` or generate an ID inside the reducer.

---

# Q4. Shopping Cart ⭐⭐

Create a shopping cart using Redux Toolkit.

Initial state:

```js
{
    items: []
}
```

Product:

```js
{
    id: 1,
    name: "Laptop",
    price: 50000,
    quantity: 1
}
```

Create reducers:

```text
addToCart
removeFromCart
increaseQuantity
decreaseQuantity
clearCart
```

Display:

```text
Laptop
₹50,000
Quantity: 2

Mouse
₹1,000
Quantity: 1

Total: ₹101,000
```

**Important:** If the same product is added twice, increase its quantity instead of creating a duplicate item.

---

# Q5. User Authentication State ⭐⭐

Create an authentication slice.

Initial state:

```js
{
    user: null,
    isLoggedIn: false
}
```

Create reducers:

```text
login
logout
```

Login payload:

```js
{
    id: 1,
    name: "Vivek",
    role: "Developer"
}
```

After login:

```text
Welcome Vivek
Role: Developer

[ Logout ]
```

After logout:

```text
Please Login

[ Login ]
```

Use:

```js
useSelector()
useDispatch()
```

---

# Q6. Theme Switcher ⭐⭐

Create a theme slice.

Initial state:

```js
{
    theme: "light"
}
```

Create:

```text
toggleTheme
setTheme
```

The UI should display:

```text
Current Theme: Light

[ Toggle Theme ]
```

Clicking the button should switch:

```text
light → dark
dark → light
```

### Extra challenge

Use the Redux state to dynamically change the class of the main container:

```jsx
<div className={theme}>
```

---

# Q7. Product Filter & Search ⭐⭐⭐

Create a product slice.

Initial state:

```js
{
    products: [],
    searchTerm: "",
    category: "all"
}
```

Products:

```js
[
    {
        id: 1,
        name: "Laptop",
        category: "electronics",
        price: 50000
    },
    {
        id: 2,
        name: "Shoes",
        category: "fashion",
        price: 3000
    }
]
```

Create reducers:

```text
setSearchTerm
setCategory
```

Your UI should have:

```text
Search: [ Laptop        ]

Category:
[ All ] [ Electronics ] [ Fashion ]
```

The displayed products should update based on:

```text
searchTerm
+
category
```

### Challenge

Keep the original `products` array unchanged and calculate the filtered products separately.

---

# Q8. API Loading State ⭐⭐⭐

Create a Redux Toolkit slice to manage API state.

Initial state:

```js
{
    data: [],
    loading: false,
    error: null
}
```

Create:

```text
fetchUsers
```

using:

```js
createAsyncThunk()
```

The API should return users.

Your UI must show:

### Before request

```text
[ Load Users ]
```

### During request

```text
Loading...
```

### Success

```text
Users:

1. John
2. Sarah
3. David
```

### Error

```text
Error: Something went wrong
```

Handle:

```text
pending
fulfilled
rejected
```

using `extraReducers`.

This is an **important Redux Toolkit interview topic**.

---

# Q9. Cart + Derived Data ⭐⭐⭐

Create a shopping cart using Redux Toolkit.

State:

```js
{
    items: []
}
```

Each item:

```js
{
    id: 1,
    name: "Laptop",
    price: 50000,
    quantity: 2
}
```

Create:

```text
addToCart
removeFromCart
increaseQuantity
decreaseQuantity
```

Then display:

```text
Total Products: 3
Total Price: ₹101,000
```

### Important challenge

Do **not** store:

```js
{
    items: [],
    totalPrice: 101000,
    totalProducts: 3
}
```

Instead, calculate the totals from `items`.

You can use a selector:

```js
const selectTotalPrice = ...
```

and:

```js
const selectTotalProducts = ...
```

This will give you practice with **Redux selectors and derived state**.

---

# Q10. Mini Redux Toolkit Application ⭐⭐⭐⭐

Build a small **Task Management application** using Redux Toolkit.

Application structure:

```text
Task App
│
├── Navbar
│   └── Task Count
│
├── Add Task
│
├── Task List
│   ├── Task
│   ├── Task
│   └── Task
│
└── Filters
```

Redux state:

```js
{
    tasks: [],
    filter: "all"
}
```

Task:

```js
{
    id: 1,
    title: "Learn Redux Toolkit",
    completed: false
}
```

Create reducers:

```text
addTask
deleteTask
toggleTask
setFilter
clearCompleted
```

Filters:

```text
All
Active
Completed
```

Example:

```text
Tasks: 5
Completed: 2
Active: 3

Filter:
[ All ] [ Active ] [ Completed ]

☐ Learn React
☑ Learn Redux
☐ Practice JavaScript

[ Add Task ]
[ Clear Completed ]
```

### Extra requirements

Create selectors:

```text
selectAllTasks
selectCompletedTasks
selectActiveTasks
selectTaskCount
```

Use:

```js
useSelector()
useDispatch()
```

and keep your components separate:

```text
store/
    store.js

features/
    tasks/
        taskSlice.js

components/
    TaskForm.jsx
    TaskList.jsx
    TaskItem.jsx
    TaskFilter.jsx
```

---

# Recommended Order

| #  | Topic                     | Level |
| -- | ------------------------- | ----- |
| 1  | Basic Counter             | ⭐     |
| 2  | Payload                   | ⭐     |
| 3  | Todo                      | ⭐⭐    |
| 4  | Shopping Cart             | ⭐⭐    |
| 5  | Authentication            | ⭐⭐    |
| 6  | Theme                     | ⭐⭐    |
| 7  | Search & Filter           | ⭐⭐⭐   |
| 8  | `createAsyncThunk`        | ⭐⭐⭐   |
| 9  | Selectors / Derived State | ⭐⭐⭐   |
| 10 | Mini Task App             | ⭐⭐⭐⭐  |


    */}
    </div>
  )
}

export default All
