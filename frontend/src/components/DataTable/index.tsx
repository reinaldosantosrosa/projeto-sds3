import axios from "axios";
import { useEffect, useState } from "react";
import { SalePage } from "src/types/Sale";
import { formatLocalDate } from "src/utils/format";
import { BASE_URL } from "src/utils/requests";
import Pagination from "../pagination";

const DataTable = () => {
    
    const [activePage, setActivePage] = useState(0);

    const [page, setPage] = useState<SalePage>({

        last: true,
        totalPages: 0,
        totalElements: 0,
        number: 0,
        first: true,

    });



    useEffect(() => {

        axios.get(`${BASE_URL}vendas?page=${activePage}&size=20&sort=date,desc`)
            .then(response => {

                setPage(response.data);

            });

    }, [activePage]);

    const changePage = (index: number) => {
        setActivePage(index);
    }

    return (
        <>
            <Pagination page={page} onPageChange={changePage}/>

            <div className="table-responsive">
                <table className="table table-striped table-sm">
                    <thead>
                        <tr>
                            <th>Data</th>
                            <th>Vendedor</th>
                            <th>Clientes visitados</th>
                            <th>Negócios fechados</th>
                            <th>Valor</th>
                        </tr>
                    </thead>
                    <tbody>
                        {page.content?.map(item => (
                            <tr key={item.id}>
                                <td>{formatLocalDate(item.date, "dd/MM/yyyy")}</td>
                                <td>{item.seller.name}</td>
                                <td>{item.visited}</td>
                                <td>{item.deals}</td>
                                <td>{item.amount}</td>
                            </tr>

                        ))};

                    </tbody>
                </table>
            </div>
        </>
    );
}

export default DataTable;