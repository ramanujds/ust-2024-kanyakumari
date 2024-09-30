export class Task {
    constructor(
        public id: number,
        public name: string,
        public description: string,
        public dueDate: string,
        public completed: boolean
    ) {}
}
