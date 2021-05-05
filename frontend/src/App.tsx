import DataTable from "./components/DataTable";
import Footer from "./components/footer";
import NavBar from "./components/navbar";


function App() {
  return (
    <>
      <NavBar/>

      <div className="text-primary">
        <h1> Ola Mundo </h1>

        <DataTable/>
      </div>

      <Footer/>

    </>
  );
}

export default App;
