// Máscara para CPF
const cpf = document.querySelector('#txt_Cpf')

cpf.addEventListener('keypress', () => {
    let cpflength = cpf.value.length
    console.log(cpflength)

    if (cpflength === 3 || cpflength === 7) {
        cpf.value += '.'
    } else if (cpflength === 11) {
        cpf.value += '-'
    }
})

// Mostrar Senha
const passwordInput = document.getElementById('txt_Senha')
const mostrarSenha = document.getElementById('watch')

function mostrarClick() {
    let inputTypeUsPassword = passwordInput.type == 'password'

    if (inputTypeUsPassword) {
        showPassword()
    } else {
        hidePassword()
    }

    function showPassword() {
        passwordInput.setAttribute('type', 'text')
    }

    function hidePassword() {
        passwordInput.setAttribute('type', 'password')
    }

}





