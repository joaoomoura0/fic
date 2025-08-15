
const mockCourseData = {
    id: 'curso-fullstack',
    title: 'Desenvolvimento Web Full Stack',
    slogan: 'Construa aplicações web completas do zero.',
    image: 'https://placehold.co/900x400/0072c6/ffffff?text=Desenvolvimento+Web+Full+Stack',
    startDate: '01 de Março de 2025',
    endDate: '30 de Agosto de 2025',
    price: 'R$ 2.500,00',
    spots: 25,
    description: 'Este curso abrange todas as etapas do desenvolvimento web, desde o front-end com HTML, CSS e JavaScript, até o back-end com Node.js e bancos de dados. Você aprenderá a criar aplicações robustas, escaláveis e seguras, preparando-se para o mercado de trabalho.',
    teachers: [
        { name: 'Prof. Ana Silva', photo: 'https://placehold.co/40x40/005ca9/ffffff?text=AS' },
        { name: 'Prof. João Santos', photo: 'https://placehold.co/40x40/005ca9/ffffff?text=JS' },
        { name: 'Prof. Carlos Rocha', photo: 'https://placehold.co/40x40/005ca9/ffffff?text=CR' }
    ]
};


function renderCourseDetails() {
    const titleElement = document.getElementById('course-title');
    const sloganElement = document.getElementById('course-slogan');
    const imageElement = document.getElementById('course-image');
    const startDateElement = document.getElementById('course-start-date');
    const endDateElement = document.getElementById('course-end-date');
    const priceElement = document.getElementById('course-price');
    const spotsElement = document.getElementById('course-spots');
    const descriptionElement = document.getElementById('course-description');
    const teacherListElement = document.getElementById('teacher-list');

    titleElement.textContent = mockCourseData.title;
    sloganElement.textContent = mockCourseData.slogan;
    imageElement.src = mockCourseData.image;
    startDateElement.textContent = mockCourseData.startDate;
    endDateElement.textContent = mockCourseData.endDate;
    priceElement.textContent = mockCourseData.price;
    spotsElement.textContent = `${mockCourseData.spots} vagas`;
    descriptionElement.textContent = mockCourseData.description;

    teacherListElement.innerHTML = '';
    mockCourseData.teachers.forEach(teacher => {
        const li = document.createElement('li');
        li.className = 'teacher-item';
        li.innerHTML = `
                    <img src="${teacher.photo}" alt="Foto de ${teacher.name}">
                    <span>${teacher.name}</span>
                `;
        teacherListElement.appendChild(li);
    });
}

window.onload = renderCourseDetails;