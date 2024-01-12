APLICAÇÃO UTILIZA LOMBOK

ACESSAR O SWAGGER PELO LINK http://localhost:8080/ekantest/swagger-ui/index.html

USER: admin
PASS: admin


Body para endpoint de cadastro:

{
    "nome":"tester",
    "telefone":"11912345678",
    "dataNascimento":"10/01/2024",
    "documentos":[{
        "tipoDocumento":"1",
        "descricao":"123456789"}
    ]
}
