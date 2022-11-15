// Máscara para CPF
const cpf = document.querySelector('#txtCpf')

cpf.addEventListener('keypress', () => {
    let cpflength = cpf.value.length
    console.log(cpflength)

    if (cpflength === 3 || cpflength === 7) {
        cpf.value += '.'
    } else if (cpflength === 11) {
        cpf.value += '-'
    }
})

// Máscara para Data de Nascimento

const dataNasc = document.querySelector ('#txtDataNascimento')

dataNasc.addEventListener('keypress' , () => {
    let dataNasclength = dataNasc.value.length
    console.log(dataNasclength)

    if (dataNasclength === 2 || dataNasclength === 5) {
        dataNasc.value += '/'
    }
})
