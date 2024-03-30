# Building

## Signing

See https://plugins.jetbrains.com/docs/intellij/plugin-signing.html

``` sh
openssl genpkey\
  -aes-256-cbc\
  -algorithm RSA\
  -out private_encrypted.pem\
  -pkeyopt rsa_keygen_bits:4096

openssl rsa\
  -in private_encrypted.pem\
  -out private.pem

openssl req\
  -key private.pem\
  -new\
  -x509\
  -days 365\
  -out chain.crt

mkdir -p certificate
mv private.pem chain.crt certificate
rm private_encrypted.pem
```
