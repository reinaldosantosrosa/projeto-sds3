import BarChat from "./components/BarChat";
import DataTable from "./components/DataTable";
import DonutChart from "./components/DonutChart";
import Footer from "./components/footer";
import NavBar from "./components/navbar";


function App() {
  return (
    <>
      <NavBar/>

      <div className="text-primary py-3">
        <h1> Dashboards de Vendas </h1>
        <div className="row px-3"> 
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Taxa de sucesso</h5>
            <BarChat/>
          </div>
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Taxa de sucesso</h5>
            <DonutChart/>
          </div>
        
        
        </div>

        <div className="py-3">
          <h5 className="text-primary">Todas as vendas</h5>
        </div>

        <DataTable/>
      </div>

      <Footer/>

    </>
  );
}

export default App;
