# Readme For Ch. 2 of the book

Chapter 2 is the place where the authors of the book
set important conventions. We will adopt some, modify
others, and throw some out to arrive at a sensible,
maintainable coding style

# Coding Style from the book

* Indent with at least 2 spaces and most 4 spaces.
  Indentation indicates block structure; e.g.

```
   if <*condition1*> then
     <*code*>
      if <*condition2*> then
```
  Here we have nested if-statements not sequential ifs.

  * if your language requires parentheses for blocks of
    code, then have the left/open parenthesis on the
    same line as the structure that controls it; e.g
``` 
    for i=0 to A.length {
       <*code*>
    }
```
* Variable names should be meaningful and short, probably at least 3
  characters long. E.g, if we're processing a text and have a var
  called 'Txt', the length variable can be indicated as: Txtlen=Txt.length;
  **Avoid single character names for important variables**

* Avoid "magic numbers" in your code. E.g., in the naiveStringMatcher,
  the first character of the pattern, *Pattern*, is used to initiate
  the algorithm, as in the following snippet:

```
   \\bad code practice
   x=Pattern[0]
   for i = 0 to Txtlen
     if x == Txt[i]
```
   in the naiveStringMatcher, the outer loop must iterate through
   the whole text upto Txtlen-Patlen to check if the first character
   of the pattern and text match. Thus the 0 in Pattern[0] is a magic
   number
```
   \\good code practice
   firstpchar=Pattern[0]
   for i=0 to Txtlen
     if firstpchar == Txt[i]
```
   * **Important exception:** the single-character variable name rule
     does not apply to 'i' in the context of iteration
