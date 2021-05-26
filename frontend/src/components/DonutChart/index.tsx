import axios from 'axios';
import { useEffect, useState } from 'react';
import Chart from 'react-apexcharts';
import { SaleSum } from 'src/types/Sale';
import { BASE_URL } from 'src/utils/requests';

type ChartData = {
    labels: string[],
    series:number[]
}

const DonutChart = () => {

    const [ charData, setChartData] = useState<ChartData>({labels: [],series: []});

    useEffect (() => {
        axios.get(`${BASE_URL}vendas/amount-by-seller`)
        .then( response => {
            const data = response.data as SaleSum[];
            const myLabels = data.map(x => x.sellerName);
            const myseries = data.map(x => x.sum);

            setChartData({labels: myLabels,series: myseries});

        }
        );
    },[] )



/*     const mockData = {
        series: [477138, 499928, 444867, 220426, 473088],
        labels: ['Anakin', 'Barry Allen', 'Kal-El', 'Logan', 'Padmé']
    }
     */

    const options = {
        legend: {
            show: true
        }
    }

    return (
        <>
             <Chart options = {{...options, labels: charData.labels}} series={charData.series}
                    type="donut"
                    height="240"
             />
             </>
           );
    }
    
    export default DonutChart;