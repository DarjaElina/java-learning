## Exceptions

Exception handling allows us to separate code into two parts:
1) Code that runs when everything works as expected
2) Code that runs when an exception happens

### Classes Hierarchy
**Object<br>**
⬆ <br>
Throwable<br>
⬆ <br>
Exception & Error<br>

**Exception<br>**
⬆ <br>
RuntimeException and other children<br>
⬆ <br>
More children

**Error<br>**
⬆ <br>
Children <br>
⬆ <br>
More Children


> There is an important difference between:
> - Exception (and its subclasses)
> - RuntimeException (and its subclasses)