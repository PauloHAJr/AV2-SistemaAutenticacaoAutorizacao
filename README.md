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
