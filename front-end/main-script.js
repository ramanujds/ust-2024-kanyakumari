function postTrainee() {
    event.preventDefault();
    let name = document.getElementById('name').value;
    let location = document.getElementById('location').value;
    let joinedDate = document.getElementById('joinedDate').value;

    let data = {
        name: name,
        location: location,
        joinedDate: joinedDate
    }

    addTrainee(data).then(response => {
        alert('Trainee added successfully');
    }).catch(error => {
        console.log(error);
    });
}

function loadTrainees() {
getTrainees().then(response => {
    let trainees = response;
    let traineesCardContainer = document.getElementById('trainees-card-rows');
    traineesCardContainer.innerHTML = '';
    let row = document.createElement('div');
    row.classList.add('row', 'g-3');
    
    trainees.forEach(trainee => {
        let col = document.createElement('div');
        col.classList.add('col-md-4');
        
        let traineeCard = document.createElement('div');
        traineeCard.classList.add('card', 'shadow-sm', 'h-100');
        traineeCard.innerHTML = `
            <div class="card-header bg-primary text-white">
                <h4 class="mb-0">${trainee.name}</h4>
            </div>
            <div class="card-body">
                <p>Location: ${trainee.location}</p>
                <p>Joined Date: ${trainee.joinedDate}</p>
            </div>
        `;
        col.appendChild(traineeCard);
        row.appendChild(col);
    });
    
    traineesCardContainer.appendChild(row);
}).catch(error => {
    console.log(error);
});
}


function showAddTraineeForm() {
    let addTraineeForm = document.getElementById('add-trainee-form');
    let traineesCardSection = document.getElementById('trainees-card-section');
    addTraineeForm.hidden = false;
    traineesCardSection.hidden = true;
}

function showTrainees() {
    let addTraineeForm = document.getElementById('add-trainee-form');
    let traineesCardSection = document.getElementById('trainees-card-section');
    loadTrainees();
    addTraineeForm.hidden = true;
    traineesCardSection.hidden = false;
}

