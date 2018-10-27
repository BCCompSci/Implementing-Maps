# CSCI 1102 Computer Science 2

### Fall 2018

------

## Lecture Notes

### Week 8: Exam Review; Maps

#### Topics:

1. **Tuesday**: Exam Review; Definition of Maps
2. **Thursday**: Simple Implementations of Maps with Unordered Keys

---

## 1. Exam Review; Definition of Maps

**Partial Maps** (aka **Partial Functions**)

Maps are probably the most common abstract data types in most software applications.

Let $A$ and $B$ be sets and let $R$ be a binary relation on $A$, $B$. $R$ is a partial map from $A$ to $B$ if and only if

$$\forall a\in A. b, b'\in B.\mathrm{if\ }(a, b)\in R \mathrm{\ and\ } (a, b') \in R \mathrm{\ then\ } b = b'.$$

##### Example

Let $A =  \{1, 2, 3\}$ and B = {Bob, Alice}.

- R1 = A x B = {(1, Bob), (1, Alice), (2, Bob), (2, Alice), (3, Bob), (3, Alice)}
- R2 = {}
- R3 = {(1, Bob), (3, Alice)}                  // e.g., DomDef(R3) = {1, 3}
- R4 = {(1, Alice), (2, Alice), (3, Alice)}

R1 is not a partial map but all of R2, R3 and R4 are partial maps.

**Notation**:

- We usually use $f$, $g$, $h$, ... for partial maps;
- We use Euler's notation $f(a)$ to denote the unique $b \in B$ such that $(a, b)\in f$ or the special "undefined" symbol $\bot$ if there is no such $b$.

**Total Map**

Let $f$ be a partial map from A to B. Then $f$ is a *total map* from A to B iff DomDef(f) = A. In the examples above, only R4 is a total map from A to B.

**Implementing Maps**

  Finite partial maps (from A --> B, or A -o-> B) can be implemented with a data structure such as hash table, e.g., Java's HashMap.

- The set of "keys" in A must be identifiable (see equivalence below);

- When a map doesn't have a mapping for a given key, something has to be done.
  - return `null`;
  - throw an exception;
  - return a value of `option` type.

- Other efficient data structures can be used to represent the map if A is totally ordered.
