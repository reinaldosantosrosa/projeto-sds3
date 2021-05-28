import { Seller } from './Seller' 

export type SaleSum = {

    sellerName: string;
    sum: number;
    
}

export type SalesSuccess  = {
    deals: number;
    visited: number;
    sellerName: string;
}

export type Sale = {

    id: number;
    visited: number;
    deals: number;
    amount: number;
    date: Date;
    seller: Seller;
}

export type SalePage = {
    content?: Sale[];
    last: boolean;
    totalPages: number;
    totalElements: number;
    size?: number;
    number: number;
    first: boolean;
    numberOfElements?: number;
    empty?: boolean;
}