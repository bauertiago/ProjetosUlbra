var n1 = 5;
var n2 = 7;
var n3 = 8.5;

var result = (n1 + n2 + n3) /3;
console.log("a média é " + result);

//media da ulbra e ver se está aprovado. 

var ap1 = 1.5;
var ap2 = 2.0;
var as = 5;

function alunoAprovado(ap1, ap2, as){
    let media = ap1 + ap2 + as;
    //if binário
    if(media >= 7)
        return "o aluno está aprovado"
    else
        return "reprovado";
}

function alunoAprovado2(ap1, ap2, as){
    //if ternário?
    // (condicao) ? true : false
    return ((ap1 + ap2 + as) >=7) ? "aprovadooooo" : "reprovado";
}

//Informe 3 números e mostre qual é o maior.

function numeroMaior(n1,n2,n3){
    if(n1>n2 && n1>n3)
        console.log(n1 + ' é maior');
    else if(n2>n1 && n2>n3)
        console.log(n2 + ' é maior');
    else if(n3>n1 && n3>n2)
        console.log(n3 + ' é maior');
    else
        console.log("hum... algo de errado não está certo");
    
} 

// impimir a tabuada de um número.

//informou o número 5

// 5 * 0 = 0;
// 5 * 1 = 5;
// 5 * 2 = 10;
// 5 * 10 = 50;
//teste de mesa.
//minhaTabuadaDo(5)
//i     numero      condicao    result
//   0     5            0<=10       0
//   1     5            1<=10         5
//   2     5           2<=10          10
//   10    5           10<=10         50
//   11     5          11<=10          

function minhaTaboadaDo(numero){
    for(let i=0;i<=10;i++){
        console.log(numero + "*" + i + "=" + (i*numero))
        //console.log(`${numero} * ${i} = ${numero * i}`);
    }
}