const baseUrl = "http://localhost:8000/api/v1/trainees";

async function getTrainees() {
    const response = await fetch(baseUrl);
    const data = await response.json();
    return data;
}

async function getTraineeById(id) {
    const response = await fetch(`${baseUrl}/${id}`);
    const data = await response.json();
    return data;
}

async function getTraineesByName(name) {
    const response = await fetch(`${baseUrl}?name=${name}`);
    const data = await response.json();
    return data;
}

async function addTrainee(trainee) {
    const response = await fetch(baseUrl, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(trainee)
    });
    const data = await response.json();
    return data;
}

async function deleteTrainee(id) {
    const response = await fetch(`${baseUrl}/${id}`,
        {
            method: 'DELETE'
        });
    const data = await response.json();
    return data;
}

async function updateTrainee(id, trainee) {
    const response = await fetch(`${baseUrl}/${id}`, {
        method: 'PUT',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(trainee)
    });
    const data = await response.json();
    return data;
}