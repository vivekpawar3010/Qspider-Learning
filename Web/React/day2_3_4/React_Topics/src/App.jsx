// import ControledComponetApps from "./components/controledComponets/ControledComponetApps";
import UnControlledApp from "./components/uncontrolledforms/UnControlledApp";

// const dotGridStyle = {
//   width: "100%",
//   minHeight: "600px",
//   position: "relative",
//   borderRadius: "20px",
//   backgroundColor: "#0f0c1d",
//   backgroundImage:
//     "radial-gradient(circle, rgba(122, 92, 255, 0.9) 1.5px, transparent 1.5px)",
//   backgroundSize: "22px 22px",
//   backgroundPosition: "center",
//   overflow: "hidden",
//   boxShadow: "inset 0 0 30px rgba(120, 88, 255, 0.2)",
// };

let App = () => {
  return (
    <div
      
    >
      <div>
        {/* <ControledComponetApps /> */}
        <UnControlledApp />
      </div>
    </div>
  );
};

export default App;

