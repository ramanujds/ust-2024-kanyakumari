interface Trainee{
    id:number;
    name:string;

    show():void;
}


let trainee:Trainee={
    id:1,
    name:'Gaurav',
    show() {
        console.log(this.id)
        console.log(this.name)
    }
}

trainee.show()