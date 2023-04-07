function lerDados(){
    let base = parseInt(prompt("Digite o número base:"));
    let expoente = parseInt(prompt("Digite o expoente:"));

    return [base, expoente];
}

function calcular(){
   
    let [base, expoente] = lerDados();  
    
    for(let  i = 0; i <= expoente;i++) {
    let resultado = Math.pow(base, i);
    console.log(base + "^" + i + "=" + resultado);
    alert(base + "^" + i + "=" + resultado);
    }
    
}

calcular();