#### Roman	Numeral	rules:
1. Roman	numerals	consist	of	the	following	letters:	I,	V,	X,	L,	C,	D,	and	M	which	mean	one, five,	ten,	fifty,	hundred,	five	hundred	and	one	thousand	respectively.
2. As	we	are	in	Rome	there	are	no	such	things	as	decimals	or	integers,	we	need	to	do	this
with	the	strings.	An	example	would	be	"XIV"	+	"LX"	=	"LXXIV."
3. Numerals	can	be	concatenated	to	form	a	larger	numeral	("XX"	+	"II"	=	"XXII").
4. If	a	lesser	numeral	is	put	before	a	bigger	it	means	subtraction	of	the	lesser	from	the
bigger	("IV"	means	four,	"CM"	means	ninehundred).
5. If	the	numeral	is	I,	X	or	C	you	can't	have	more	than	three	("II"	+	"II"	=	"IV"	not	“IIII”).
6. If	the	numeral	is	V,	L	or	D	you	can't	have	more	than	one	("D"	+	"D"	=	"M"	not	“DD”).

#### Stories
###### User	Story:	Addition
As	a	Roman	bookkeeper
I	want	to	be	able	to	add	two	numbers	together
So	that	I	can	do	my	work	faster	with	fewer	mathematical	errors.
###### User	Story:	Subtraction
As	a	Roman	bookkeeper
I	want	to	be	able	to	subtract	a	number	from	another
So	that	I	can	do	my	work	faster	and	with	fewer	mathematical	errors.
This	Kata	is	based	on	the	Roman	Numeral	Calculator	Kata	at	http://bit.ly/1VfHqlj


#### Running tests

gradle test