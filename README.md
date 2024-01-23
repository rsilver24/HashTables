Challenge One: Which is a better hash function?:
  1) x % n where n is a large number with several factors
  2) x % n where n is a large prime number

A function x % n where n is a large prime number is superior to a large number with several factors. The reason for this is that a HashTable's function is to create a non-repeatable, or at least
an INCREDIBLY UNLIKELY repeatable hash number. Modding a number with several factors is an issue, as there are quite a large number of likely values to be returned. Modding by a number with
many factors has a lot of likely 'whole-divisible values' (2 and 3 for example) while with a prime number modded values will vary far more and actually be different from one another. These values
could only be repeated when the cycle is complete through n 'cycles', and thus is more consistent.

- - - - - - - - - -

Challenge Two: Is char values summed % 599 a good hash function for strings? Why or why not?

Not at all. Although 599 initially may seem like a large number, modding by this value means that there could only be 599 unique values before there will be a repeated one. Hashtables need to be
capable of storing a high amount of both variability and substance, meaning that only having 599 possibilities is not enough. Even if just 10 values were being inputed before each loop wipe, given
enough tries, there WILL be a repeated value, and thus this would be a ineffective hashfunction. Additionally, if the key of the hashtable stores as strings, there are just far far far far more
possibilities than just 599 given the variability of a single string in length and content.

- - - - - - - - - -

Challenge Three: Take a look at Java's HashMap class and how it produces hashed values, then describe how it works.
(You may have to look at other classes to find the actual mathematical function! Follow the trail of breadcrumbs...)

From tutorialspoint.com, the hashCode() method is described as using this procedure: s[0]*31^(n - 1) + s[1]*31^(n - 2) + ... + s[n - 1]. In other words, it takes the numerical representation
of the number of iteration's character of the string and multiplies it by 31^(length of string - number of iteration), then repeats over and over again. This way a completely unique hashcode
will be calculated for every single possible string. I am currently not sure if this is very efficient, and I will have to do some further research when I actually get to coding itself.
