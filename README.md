# Loveculator-API
Quick, personal project for resume. Made as a joke and as a proof of some of my abilities.

## Instruction

For now there are 3 available API calls:
1. [simple love calculation without key](#simple-love-calculation-without-key) and with path parameters
2. [key generation](#key-generation)
3. [post method love calculation with key in request body](#post-method-love-calculation-with-key-in-request-body)

## simple love calculation without key

```
/calculate/first={first}&second={second}
```
Arguments:
- first - name of first person
- second - name of second person
- 
 As a result we get:
 ```
 {
"names": {
"nameFirst": "first",
"nameSecond": "second"
},
"match": "0,7765"
}
 ```
Apart from getting names back we also get the most inportant value which is [matching potential](#matching-potential)


## key generation

Request:
```
/generateKey
```
Result:
```
[your-api-key]
```
And with that we can send fully complete request body. 

## post method love calculation with key in request body

Call:
```
/calculate
```

Request body:
```
{
    "nameFirst": "first",
    "nameSecond": "second",
    "digits": 5,
    "apiKey": "[your-api-key]"
}
```
Unknown arguments:
- digits - number bigger than 2, difines number of digits after the decimal point, if the number is bigger that 16 it will still display 16 digits

Response:
```
{
    "names": {
        "nameFirst": "first",
        "nameSecond": "second"
    },
    "match": "0,56159",
    "callsLeft:": 992
}
```
Unknown arguments:
- callsLeft - you are asigned with 1000 available calls, if this variable reaches 0 you will have to generate a new API key

## matching potential
The Algorithm. 
