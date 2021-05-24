import { Link } from "react-router-dom";
import NavBar from "src/components/navbar";


const Home = () => {
    return (
        <>
            <div className="container">

                <NavBar />
                <div className="jumbotron">
                    <h1 className="display-4">DSVendas</h1>
                    <p className="lead">Analise o desempenho das suas vendas</p>
                    <hr></hr>
                    <p>Esta aplicação consiste em exiber um dashboard</p>

                    <Link className="btn btn-primary btn-lg" to ="/dashboard">Dashboard</Link>
                </div>
            </div>
            <footer/>
        </>
    );
}

export default Home;
