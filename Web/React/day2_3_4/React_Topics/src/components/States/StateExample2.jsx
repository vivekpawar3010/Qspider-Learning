import { useState } from "react";


let StateExample2 = () => {
    let [skills, setSkill] = useState(['JavaScript', 'Python', 'Java', 'C++']);
    skills.forEach((skill) => {
        console.log(skill);
    })

    let updateSkill = () => {
        setSkill([...skills, 'React']);
    }

    return (
        <>
            <h1>State Example 2 Component</h1>
            <ol>
                {skills.map((skill, index) => (
                    <li key={index}>{skill}</li>
                ))}
            </ol>
            <button onClick={updateSkill}>Add Skill</button>

        </>
    )



};

export default StateExample2;