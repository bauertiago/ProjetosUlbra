let base = parseFloat(prompt("Digite a base:"))
let expoente = parseFloat(prompt("Digite o expoente:"))

for (let i = 0; i <= expoente; i++){
    console.log(`${base}^${i} = ${base**i}`)
}