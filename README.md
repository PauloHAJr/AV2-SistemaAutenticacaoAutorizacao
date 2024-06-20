# AV2 - Sistema de Autenticação e Autorização

## Descrição 
Esta é uma API que utiliza Json Web Token (JWT) que é um padrão para autenticação e troca de informações definido pela RFC7519. Nele é possível armazenar de forma segura e compacta objetos JSON. Este token é um código Base64 e pode ser assinado usando um segredo ou par de chaves privadas/públicas. Os tokens de API também contêm o escopo de acesso concedido a um usuário específico.

## EndPoints
POST/login: localhost:8080/login

GET/username/{token}: localhost:8080/username/{token}

GET/admin: localhost:8080/admin/users

GET/gerente: localhost:8080/manager/products

GET/vendedor: localhost:8080/seller/orders

GET/cliente: localhost:8080/costumer/products

## Diagrama
![Captura de Tela (19)](https://github.com/PauloHAJr/AV2-SistemaAutenticacaoAutorizacao/assets/102565635/0b91de88-edec-48ec-9e31-e15cc4b76a5c)

## Insomnia
![Captura de Tela (17)](https://github.com/PauloHAJr/AV2-SistemaAutenticacaoAutorizacao/assets/102565635/eabb3b5f-e73a-42f4-b181-6bf8d77dd30f)
![Captura de Tela (16)](https://github.com/PauloHAJr/AV2-SistemaAutenticacaoAutorizacao/assets/102565635/11db0e91-cfd0-4626-9760-3bcd31372385)
![Captura de Tela (15)](https://github.com/PauloHAJr/AV2-SistemaAutenticacaoAutorizacao/assets/102565635/e0d66bf4-5eeb-44ad-82f4-c8a97aeb4e36)
![Captura de Tela (14)](https://github.com/PauloHAJr/AV2-SistemaAutenticacaoAutorizacao/assets/102565635/b9a2cb43-a31c-405c-a283-15ba1c0431b6)
![Captura de Tela (13)](https://github.com/PauloHAJr/AV2-SistemaAutenticacaoAutorizacao/assets/102565635/2eeb1075-cda1-43eb-ae7e-18fe4b214ac7)
![Captura de Tela (12)](https://github.com/PauloHAJr/AV2-SistemaAutenticacaoAutorizacao/assets/102565635/0ba42aaa-4351-42a8-b038-a6a6e50e7e52)
