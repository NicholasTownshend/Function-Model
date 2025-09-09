# Grammar
```
<word>          ::=<letter> | <letter> <word>

<letter>        ::="a" | "b" | "c" | ... | "z" | "A" | "B" | ... | "Z"


<number>        ::=<digit_nonzero> <digit>* [ "." <digit>+ ]

<digit>         ::="0" | "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9"

<digit_nonzero> ::="1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9"


<node>          ::=<word> | <number> | <sum>

<sum>           ::=<node> "+" <node>
```

- A `<number>` any positive real number with a limit number of digits. It must not have any leading or trailing zeroes, that is why it's BNF is more obfuscated.
- A `<word>` is simply any combination of lower or upper case letters of the English alphabet.
