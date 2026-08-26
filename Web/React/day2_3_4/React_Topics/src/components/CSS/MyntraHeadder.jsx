// import React from "react";
import style from "./MyntraHeader.module.css";

let MyntraHeadder = () => {
    return (
        <header id={style.myntraheader}>
            <h1>Myntra Headder Component</h1>
            <section id={style.logo}></section>
            <section id={style.search}></section>
            <section id={style.icons}></section>
        </header>
    );
}

export default MyntraHeadder;