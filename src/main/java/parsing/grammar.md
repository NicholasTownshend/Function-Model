# Grammar
```
<word>::=[a..zA..z]

<number>::=[1..9](0..9)(.)(0..9[1..9])

<term>::=<word> | <number>
```

- A `<number>` any positive real number with a limit number of digits. It must not have any leading or trailing zeroes, that is why it's BNF is more obfuscated.
- A `<word>` is simply any combination of lower or upper case letters of the English alphabet.
