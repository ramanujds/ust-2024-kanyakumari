export interface Game{
    name:string;
    status:Status;
    totalPlayers:number
}

export enum Status{
    Available,NotAvailable
}