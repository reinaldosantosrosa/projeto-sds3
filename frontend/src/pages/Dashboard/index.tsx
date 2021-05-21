import React from "react";
import BarChat from "src/components/BarChat";
import DataTable from "src/components/DataTable";
import DonutChart from "src/components/DonutChart";
import Footer from "src/components/footer";
import NavBar from "src/components/navbar";


const Dashboard = () => {
    return (
        <>
            <NavBar />

            <div className="text-primary py-3">
                <h1> Dashboards de Vendas </h1>
                <div className="row px-3">
                    <div className="col-sm-6">
                        <h5 className="text-center text-secondary">Taxa de sucesso</h5>
                        <BarChat />
                    </div>
                    <div className="col-sm-6">
                        <h5 className="text-center text-secondary">Taxa de sucesso</h5>
                        <DonutChart />
                    </div>


                </div>

                <div className="py-3">
                    <h5 className="text-primary">Todas as vendas</h5>
                </div>

                <DataTable />
            </div>

            <Footer />

        </>
    );
}

export default Dashboard;
