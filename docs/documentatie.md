# Parlement

Parlement is een programmeer taal afgeleid van [Chef](http://progopedia.com/language/chef/) en [INTERCAL](https://en.wikipedia.org/wiki/INTERCAL). De taal speelt met de ideeën uit de politiek.

## Omschrijving

Ik wil de politiek en alles er om heen er een beetje ingooien. Een baudet zou kunnen zijn dat je iets verwijderd. En Mark Rutte een loop omdat hij overal omheen draait (stereotypes).
Daarnaast moet alles wel beleefd gebeuren (zoals het er niet altijd in de politiek aan toe gaat)
`MARK <array> RUTTE <element> ALSJEBLIEFT` zou een geldig statement kunnen zijn.

Koning Willem Alexander a.k.a. Willie houd wel van de troonrede oplezen. Daarom print hij ook lines naar de console.
WILLIE KUN JE DIT ALSJEBLIEFT OPLEZEN “Hello World!”

## Code voorbeelden

Een aantal voorbeelden met wat wel en niet mag

### Assigments and declarations

```
int a
a = 1
```

```
int a = 1
```

```
int myInt = 0
bool myBool = false
string myString = "Parlement"
```

### If statement

**Accepteerd alleen boolean en int**

##### Do

```
ALS 69 == 1337 DAN
    WILLIE WIL JE DIT OPLEZEN ALSJEBLIEFT "Dit wordt nooit geprint!"
```

##### Don't

```
ALS "Werkt" == "Niet" DAN
    WILLIE WIL JE DIT OPLEZEN ALSJEBLIEFT "Error!"
```

### Print statement

```
WILLIE WIL JE DIT OPLEZEN ALSJEBLIEFT "Hello World!"
```

```
WILLIE WIL JE DIT OPLEZEN ALSJEBLIEFT 1337
```

```
WILLIE WIL JE DIT OPLEZEN ALSJEBLIEFT myVar1
```

```
WILLIE WIL JE DIT OPLEZEN ALSJEBLIEFT 1 + 2 + 3 * 50
```

### Functions/Methods

```
MOTIE myFunction
    // Do whatever
OKE STOP MAAR
```

```
myFunction() // call myFunction method
```

### Loop

Loop accepteerd alleen int

##### Do

```
MARK RUTTE WIL JE DIT 5 KEER HERHALEN
    WILLIE WIL JE DIT OPLZEN ALSJEBLIEFT "Ik ben Willie"
OKE STOP MAAR
```

##### Don't

```
MARK RUTTE WIL JE DIT "Dit werkt niet" KEER HERHALEN
    WILLIE WIL JE DIT OPLZEN ALSJEBLIEFT "x_x"
OKE STOP MAAR
```

## Implementatie issues

### Loop
Bij de loop wou ik in eerste instantie een soort van `while` loop maken. Echter vond ik dit niet echt passen bij mijn taal.
In plaats daar van heb ik een aparte loop gemaakt die ik niet in een andere programmeer taal heb gezien.

Je kan gewoon aangeven hoe vaak iets herhaald moet worden, dit kan via een int of een expressie.

Het werkt door het aantal herhalingen op de stack te zetten. Hierna push ik nog een 1 naar de stack en subtract ik deze.
De loop gaat zo recursive door tot de aantal herhalingen 0 is, waarna de loop exit.

### AND of OR

Ik wou dit eerst heel gecompiliceerd oplossen zoals bij de if statements. Via labels en goto's.
Toen kwam ik perongeluk langs de bitwise operators en schoot me iets ten binnen van C++. Namelijk dat je een soort bitmask over de waardes heen kan gooien.

Aangezien ik twee waardes vergelijk kan ik hiervoor een bitwise AND/OR operator gebruiken. En hierna een ifeq. Deze springt gelijk naar de end operator als de uitgerekende waarde 0 is.

