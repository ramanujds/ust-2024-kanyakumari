const fetch = require('node-fetch');

jest.mock('node-fetch');
const { Response } = jest.requireActual('node-fetch');

const {
    getTrainees,
    getTraineeById,
    getTraineesByName,
    addTrainee,
    deleteTrainee,
    updateTrainee
} = require('./trainees-api');

describe('Trainees API', () => {
    afterEach(() => {
        jest.clearAllMocks();
    });

    test('getTrainees should fetch all trainees', async () => {
        const mockTrainees = [{ id: 1, name: 'John Doe' }];
        fetch.mockResolvedValue(new Response(JSON.stringify(mockTrainees)));

        const trainees = await getTrainees();
        expect(fetch).toHaveBeenCalledWith('http://localhost:3000/trainees');
        expect(trainees).toEqual(mockTrainees);
    });

    test('getTraineeById should fetch trainee by id', async () => {
        const mockTrainee = { id: 1, name: 'John Doe' };
        fetch.mockResolvedValue(new Response(JSON.stringify(mockTrainee)));

        const trainee = await getTraineeById(1);
        expect(fetch).toHaveBeenCalledWith('http://localhost:3000/trainees/1');
        expect(trainee).toEqual(mockTrainee);
    });

    test('getTraineesByName should fetch trainees by name', async () => {
        const mockTrainees = [{ id: 1, name: 'John Doe' }];
        fetch.mockResolvedValue(new Response(JSON.stringify(mockTrainees)));

        const trainees = await getTraineesByName('John');
        expect(fetch).toHaveBeenCalledWith('http://localhost:3000/trainees?name=John');
        expect(trainees).toEqual(mockTrainees);
    });

    test('addTrainee should add a new trainee', async () => {
        const newTrainee = { name: 'Jane Doe' };
        const mockResponse = { id: 2, ...newTrainee };
        fetch.mockResolvedValue(new Response(JSON.stringify(mockResponse)));

        const addedTrainee = await addTrainee(newTrainee);
        expect(fetch).toHaveBeenCalledWith('http://localhost:3000/trainees', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(newTrainee)
        });
        expect(addedTrainee).toEqual(mockResponse);
    });

    test('deleteTrainee should delete a trainee by id', async () => {
        const mockResponse = { message: 'Trainee deleted' };
        fetch.mockResolvedValue(new Response(JSON.stringify(mockResponse)));

        const response = await deleteTrainee(1);
        expect(fetch).toHaveBeenCalledWith('http://localhost:3000/trainees/1', {
            method: 'DELETE'
        });
        expect(response).toEqual(mockResponse);
    });

    test('updateTrainee should update a trainee by id', async () => {
        const updatedTrainee = { name: 'John Smith' };
        const mockResponse = { id: 1, ...updatedTrainee };
        fetch.mockResolvedValue(new Response(JSON.stringify(mockResponse)));

        const response = await updateTrainee(1, updatedTrainee);
        expect(fetch).toHaveBeenCalledWith('http://localhost:3000/trainees/1', {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(updatedTrainee)
        });
        expect(response).toEqual(mockResponse);
    });
});