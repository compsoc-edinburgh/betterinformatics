---
layout: page
title: Data & Analysis notes
---


# Part I: Structured Data


## Entities and Relationships

ER model - only a description. Graphical notation only. 

We start with a rectangle. Attributes go to circle.

![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494637300502_image.png)




- Superkey = A set of attributes is a superkey for an entity if those attributes, taken together, always **uniquely identify** every entity instance. Might have attributes that are not needed for identification.
- Key = A set of attributes is a key if it is a minimal set of identifying attributes — **removing any one attribute would make it no longer uniquely identifying**.
- Super key  = for any instance always unique
- Key = minimal set of identifying each entity
- Candidate Key = we might have more options which keys to use - candidate represents this choice
- Primary key = a candidate key we actually choose.
  - Key is a set of attributes. Key made of more than one attribute is called **composite key**.
  - We underline all the keys used to compose the primary key

More on keys here:
http://stackoverflow.com/questions/6951052/differences-between-key-superkey-minimal-superkey-candidate-key-and-primary-k




![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494637648336_image.png)


Relationship:

![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494672800726_image.png)


ER diagrams are just this bullshit. 

# Relational Model

Some types of relationships:

- Many to one
https://wofford-ecs.org/DataAndVisualization/ermodel/images/fig15.jpg
![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494688898872_image.png)

- One to many
- Many to many



https://wofford-ecs.org/DataAndVisualization/ermodel/images/fig14.jpg


**Key constraint** = if a relationship must occur only once. Arrowhead

![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494677865731_image.png)




## Total participation:


https://wofford-ecs.org/DataAndVisualization/ermodel/images/fig17.jpg


This means that a student **has** to be member of lab team but does not need to be a leader. Basically its a **not null** for foreign key. We indicate this with double line.



![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494678449270_image.png)


We can also use numbers to indicate the type of relationship - in pic above we see that lab has to have a one leader only. The team has a double line constraint cause leader is required. 



## Weak entities
![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494679922465_image.png)


Weak entity has not enough information to have any candidate key. But for example room can’t exist without a building (**total participation**) and so we can identify room by building name and room number.


## Inheritance


![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494681055167_image.png)



## Relational model
![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494681200814_image.png)


Arity: Number of fields in schema
Cadinality: number of rows in schema

DDL:  Data definition Language - part of SQL - used to declare tables


    CREATE TABLE Student (
      uun VARCHAR(8),
      name VARCHAR(20),
      PRIMARY KEY(uun) 
    )

Foreign keys:


    CREATE TABLE Takes (
      uun VARCHAR(8),
      code varchar(20),
      mark INTEGER,
      PRIMARY KEY (uun, code), -- notice how we are able to composed key
      FOREIGN KEY (uun) REFERENCES Student,
      FOREIGN KEY (code) REFERENCES Course
    )


# From ER Diagrams to Relational Models



![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494688902183_image.png)

## Key constraints: 


![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494689280890_image.png)


Essentially the easiest way to do participation constraint is to use **NOT NULL.** 

![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494689448010_image.png)

## Weak entities
![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494689765839_image.png)

## Inheritance:
![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494690014855_image.png)


This is kind of straightforward. 

# Relational algebra
----------
![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494695509669_image.png)



- **Selection** - pick data based on logical predicate
- **Projection** - pick by column names
- **Renaming** - sometimes we need to rename columns after join… 
- **Union** - combines two “tables” that have same schema, useful after applying renaming, selection and projection I guess
- **Difference:** A-B will result in lines that are in A but not in B
- **Intersection -** Rows that appear in both tables
- **Cross product** - combination of every row in table A with every row in table B
- **Joins** -  Combination of selection and cross product


## Example of projection and selection:
![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494699121898_image.png)


Projection usually decreases arrity but cardinality remains same. 
Selection decreases cardinality but arrity remains the same


![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494699426994_image.png)

## Cross product:
![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494699897556_image.png)

## Joins
![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494701743967_image.png)


Lets see on our fav example:


![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494701931218_image.png)

![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494701993579_image.png)

![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494701977718_image.png)


Now we apply the Selection Student.mn = Takes.mn:

![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494702041211_image.png)


And we get a fucking joined tables… Hooorah!


## Types of Joins:
![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494704879956_image.png)


Equijoin / inner join = join based on two equal fields. Most common. 
Natural join = requires equality of all fields that have the same name.


# Tuple Relational Calculus

Very similar to list comprehension and basically any kind of set theory. 

The biggest difference seems to be that we are not allowed to use the left hand side of the expression:


    { S.age | S ∈ Student ∧ S.age > 19 }

is **not allowed.**

Queries have a general form: **{ T | P(T) }**



## Examples
- { S | S ∈ Student ∧ S.age > 19 }
  - This will return all rows with the same schema
  - Haskell: [ s | s <− students , age s > 19 ]
  - Python: [s for s in students if s.age > 19 ]
- { T | ∃S . S ∈ Student ∧ S.age > 19 ∧ **T.name = S.name ∧ T.age = S.age** }
  - This is here only to select the columns, what they are essentially saying is that implicitly all of columns of T are empty, so they define one only those with values equal to S in the columns name and age. 
- { R | ∃S ∈ Student . ∃T ∈ Takes . ∃C ∈ Course . C.title = "Geology 1" ∧ C.code = T.code ∧ T.matric = S.matric ∧ S.name = R.name }
  - again they are using R to get only the names of the student.
![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494722955940_image.png)

  - Students taking Geology 1
- Courses taken by students called “Ada”
  - { R | ∃S ∈ Student, T ∈ Takes, C ∈ Course . S.name = "Ada" ∧ S.matric = T.matric ∧ T.code = C.code ∧ C.title = R.title }
![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494771679108_image.png)

- Students taking Informatics 1 **or** Geology 1
  - { R | ∃S ∈ Student, T ∈ Takes, C ∈ Course . (C.title = "Informatics 1" ∨ C.title = "Geology 1") ∧ C.code = T.code ∧ T.matric = S.matric ∧ S.name = R.name }
- Students taking both Informatics 1 **and** Geology 1
  - { R | ∃S ∈ Student, T1, T2 ∈ Takes, C1, C2 ∈ Course . **C1.title = "Informatics 1" ∧ C2.title = "Geology 1"** ∧ C1.code = T1.code ∧ T1.matric = S.matric ∧ C2.code = T2.code ∧ T2.matric = S.matric ∧ S.name = R.name }
    - We have to separate c1 and c2.
- Students taking **no courses**
  - { R | ∃S ∈ Student . S.name = R.name ∧ ∀T ∈ Takes . **T.matric != S.matric** }



----------
# SQL

Declarative: states what should be done, not how to do it
DDL (Data Definition Language): create new tables
DML (Data Manipulation Language): operate on these tables (insert, query, …)

![](/resources/inf1-da_images/s_A92027D9AFF2395A5E713761409476E0FDCEEB2CA26B6C0002389E91357B81F8_1494708665955_image.png)


**Insertion**

    INSERT
      INTO Student(uun, name, age, email)
      VALUES ('s1696969', 'John', 19, 'doe@sms.ed.ac.uk')

**Update**

    UPDATE Student
      SET name = 'Jenny'
      WHERE uun = 's1696969'

**Delete**

    DELETE
      FROM Student
      WHERE name = 'Jenny'


## SQL Queries

**ACID Transactions**
Atomicity: all-or-nothing → either works or fails and leaves the database unchanged
Consistency: transaction on a valid state of db always gives a valid result state
Isolation: concurrent transactions have the same effect as sequential ones
Durability: once a transaction is committed, it will not be rolled back


    SELECT *
      FROM Student AS S
      WHERE age > 19 AND name = 'Jenny'

In Tuple Relational Calculus

    {S | S ∈ Student ∧ S.age > 19 ∧ S.name = 'Jenny'}

Select distinct entities (without duplicates)

    SELECT DISTINCT age
      FROM Student

*DISTINCT binds to SELECT, not to the fields selected; multiple → SELECT DISTINCT age, name*

## Joins (You can just use where statement with multiple tables instead)
    SELECT Orders.OrderID
    FROM Orders
    INNER JOIN Customers ON Orders.CustomerID = Customers.CustomerID;


![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494778172306_image.png)

- **(INNER) JOIN**: Returns records that have matching values in both tables
- **LEFT (OUTER) JOIN**: Return all records from the left table, and the matched records from the right table
- **RIGHT (OUTER) JOIN**: Return all records from the right table, and the matched records from the left table
- **FULL (OUTER) JOIN**: Return all records when there is a match in either left or right table

But **join were not really covered in the course content AFAIK. So you should be mostly able to just use where statement as below.**


**Some more complex queries**

    SELECT S.name, S.email
      FROM Student AS S, Takes AS T, Course AS C
      WHERE S.uun = T.uun
        AND T.code = C.code
        AND C.title = 'Data and Analysis'

In Tuple Relational Calculus

    {R | S ∈ Student, T <- Takes, C <- Course.
      R.name = S.name ∧ R.email = S.email
      ∧ S.uun = T.uun ∧ T.code = C.code ∧ C.title = "Data and Analysis"}

Nested queries

    SELECT S.name, S.email
      FROM Student AS S, Takes as T,
        (SELECT code FROM Course WHERE title = 'Data and Analysis') AS C
      WHERE S.uun = T.uun AND T.code = C.code

*SELECT always returns a new table, so a SELECT statement can be used within FROM*

Aggregates (functions)

    SELECT 
        AVG(T.mark) AS "Mean Mark"
        MAX(T.mark) AS "Highest"
      FROM Student S, Takes T, Course C
      Where S.uun = T.uun AND T.code = C.code AND C.title = 'Data and Analysis'  

**List of aggregates:**

- Count
- Sum
- Avg
- Max
- Min


Other shit like UNION, INTERSECT, EXCEPT, comparing (><), …



----------
# Part II: Semi-structured Data
# XML

*Extensive Markup Language*

![](/resources/inf1-da_images/s_A92027D9AFF2395A5E713761409476E0FDCEEB2CA26B6C0002389E91357B81F8_1494710530682_image.png)


**XML graphs:**


![](/resources/inf1-da_images/s_A92027D9AFF2395A5E713761409476E0FDCEEB2CA26B6C0002389E91357B81F8_1494710560996_image.png)

![](/resources/inf1-da_images/s_A92027D9AFF2395A5E713761409476E0FDCEEB2CA26B6C0002389E91357B81F8_1494710733659_image.png)


**Types of nodes**
Root: only one, beginning of the tree, e.g. Factbook
Element: any, really… e.g. State
Text: containing only text, e.g. “New South Wales”
Attribute: tags/attributes of elements, e.g. @code=”+61”


# DTD (Document Type Definition)

Used to set up a *schema* for the data and validate against that schema
Which elements, where, how many, what attributes, …

DTD has no tree like structure. You just define each element on new list. 
You can use quantifiers  + for one or more, * for none or more, and ? for none or one.


    <!DOCTYPE Factbook [
      <!ELEMENT Factbook (Country+)> <!-- Factbook has one or more Country els. -->
      <!ELEMENT Country (Name, Population, Capital, State*) <!-- Country has these -->
      <!ELEMENT Name (#PCDATA)> <!-- Contains a text node (long text) -->
      <!ATTLIST Country code CDATA #IMPLIED> <!-- optional attribute (short text) -->
      <!ATTLIST Feature type CDATA #REQUIRED> <!-- required attribute (short text) -->
    ]>

  Other

    <?xml version="1.0" encoding="UTF-8"?> <!-- state xml version -->
    <!ELEMENT Country (Name | Population | #PCDATA)> <!-- may have any of these els. -->
    <!ELEMENT Country (ANY)> <!-- may have any element -->
    <!ELEMENT Population (EMPTY)> <!-- no elements allowed -->
    <!ELEMENT Country (Name+, Town*, President?)> <!-- regexp allowed -->
    <!ATTLIST Country code CDATA "+69"> <!-- "+69" is the default value -->
    <!-- then include as: -->
    <!DOCTYPE Factbook SYSTEM "URI">

So first you define the elements and then their attributes.  Use #PCDATA for element data. And CDATA in attributes. 
You can also use regular expressions pretty much everywhere.

General forms

    <!ELEMENT elementName ( regexp )∗ >
    <!ATTLIST elementName attName attType attDefault ... >

**Postel’s law**
An implementation should be conservative in sending behaviour and liberal in receiving behaviour
→ Be conservative in what you do, be liberal in what you accept from others

# XPath

A sub-language of XQuery, used for extracting (primarily) as well as producing
Path expression: set of possible pats from root
Set of nodes: all nodes reached

**General**

    <axis>::<node-test><predicate>*

axis: indication of which way the context node moves (e.g. child, descendant, self, parent, …)
node-test: which node you are looking for (e.g. node(), text(), * [doesn’t match text nodes], name)
predicate: optional, additional conditions to be met

**Some axis abbreviations**
child:: - default axis, can be ommited
@ - attribute::
// - descendant-or-self::node()/, all descendants of a node or the node itself
.. - parent::node(), the node’s parent node
. - self::node(), the node itself

**Predicates**
[locationPath] - select nodes for which there exists a path matching locationPath
[locationPath=value] - (-”-) where final node is equal to value

**Examples**
Getting one node

    /Factbook/Country OR /child::Factbook/child::Country

*must start with a forward slash, “child::” is optional*

All *direct* children of an element (only nodes directly below in the tree)

    /Factbook/Country/*

All specific nodes

    //Name OR /descentant::Name

All children nodes of a specific node (full depth, not just the ones directly below - because of “//”)

    //State//node()

Just text nodes (-”-)

    //State//text()

Attribute nodes of a specific node (the attr. nodes *themselves*, not those to which they belong)

    //Feature/@type

Nodes with a specific attribute tag

    //*[@type]

Nodes with a specific *value* of an attribute tag

    //*[@type="Mountain"]

Get the text of these nodes (-”-)

    //*[@type="Mountain"]/text()

Get all nodes which contain a Feature of type “Mountain” and retrieve the text of their Name node

    //*[Feature/@type="Mountain"]/Name/text()

Names of all countries which contain a feature called “Salmon River”

    //Country[.//Feature/text()="Salmon River"]/Name/text()

*the query in brackets must start with “.”, otherwise it will look for all features from the root*

Parsing based on the value: (Getting  names of all restaurants which serve Italian food")

    //restaurants/restaurant[cuisine="Indian"]/@name

For xml :

    <restaurants>
    <restaurant name="Kalpna">
        <address>2 St Patrick's Square, Edinburgh, EH8 9EZ</address>
        <cuisine>Indian</cuisine>
        <phoneno>0131 667 9890</phoneno>
    </restaurants>



# Corpora
----------

Shitload of text constructed to be representative of some language / some type of style. 
Features:

- Representative sampling
- Machine friendly
- Finite size

Two types:

- Unnotated - this is unstructured data then
- Annotated - considered semistructured

Balancing

- By language type (articles, papers, news papers, email, blogs, spoken speech..)
- Genre (by century, or by type)
- Domain (Crime, travel…)
- Media - physical representation of corpus

Dictionary:

- Annotation - metadata
- Annotation schema - tag sets and guidelines
- Tag set - sets of markup used for metadata
- Absolute frequency = total count
- relative frequency = total count / token count
- Annotation: tag sets, annotation guidelines. Metadata. 
- POS (part-of-speech) tagging: automatic by dictionary lookup, most frequently seen, and POS sequences. 
- Syntactic annotation: phrase markers, syntax trees, also automatic. 
- Concordance: keyword-in-context (kwic) 
- Frequencies: token count N, type count, absolute frequency f(t), relative frequency f(t)/N.
- Unigrams; bigrams; n-grams: one-word, two-word, and n-word sequences within a corpus.

Unigrams

- Bigrams — pairs of adjacent words
- Trigrams — triples of adjacent words
- n-grams — n-tuples of adjacent words.

Collocation - set of words that frequently occur together ie Strong Tea vs Powerful tea


----------
# Part III: Unstructured Data
## Information Retrieval


![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494863663824_image.png)


**Systems Measur****e****ment** 
The standard performance assessment of an IR system is through two measures.

- Precision: What proportion of the documents returned by the system are relevant. 
- Recall: What proportion of all the relevant documents are returned by the system.


![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494864005729_image.png)



![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494864246258_image.png)

## F-score
![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494864370333_image.png)

![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494864437922_image.png)

![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494866327060_image.png)


Inverse document frequency: Why not add some weight for a **word that turns up distinctively more in this document than it does in others**?


# Vector Spaces for Information Retrieval
- Treat documents as vectors in a high-dimensional space, with one dimension for every distinct word
- Match documents to the query by the angle between the vectors.
- Rank documents more highly the more nearly they point in the same direction as the query.

Document Matrix:

- Each column represents a word that appears the document collection; 
- Each row represents a single document in the collection;
- Each matrix entry is the frequency of that word in that document.
- This is a model in that it captures some aspects of the documents in the collection — enough to carry out certain queries or comparisons — but ignores others.
- 
![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494866824885_image.png)



## Angle between vectors
![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494866878393_image.png)

## Comparing relevancy to the vector of the query Q:
- **highest cosine** against Q( = vector of query) **is the best match** (smallest angle)
- the **lowest cosine values are the least suitable** (largest angle).



# Summary Statistics

Book recommendation: Statistics Explained: A Guide for Social Science Students

Some types of data :

- Qualitative: yes/no classification; town of residence; course grade 
- Quantitative: date; population; length; weight

Bell curve:

![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494870139955_image.png)

- mean µ (mu, said “mew”) is the centre around which the data clusters. 
- Standard deviation σ (sigma) is a measure of the spread of the curve. For a normal distribution, it **coincides with the inflection point** where the curve changes from being convex to concave.
- standard deviation of a normal distribution is a statistic that captures the degree of spread of the data around its mean

**Variance:**

![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494871286444_image.png)


Variance measures the spread of data, but it changes as the square of the data.

Variance starts with the difference of each number to the mean. Because we are doing sum we need to square the number so its always positive. And then we divide this shit by N so that its an average value for N.


**Standard deviation**

![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494871348426_image.png)


Stanard deviation is basically the same shit as Variance, the only difference is that we take the square root of the variance. We do this because in Variance we get the average of differences to mean squared. But if we want more related number we have to take into account this act of squaring. 



# Estimating on Sample:

We do sampling cause sometimes its just too big. We pick values at Random. 


Population sample Mean:

![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494872066940_image.png)



Sampling on variance:

![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494872048227_image.png)


**Standard deviation of population:**

![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494872171042_image.png)



## Correlation
- relationship between the values of two different variables: do they vary up and down together
- If there is no relationship, then the variables are said to be independent. 
- If there is a relationship, then the variables are said to be correlated.


## Correlation Does Not Imply Causation:

If we do observe a correlation between variables X and Y, it may due to any of several things. 

- Variation in X causes variation in Y, either directly or indirectly. 
- Variation in Y causes variation in X, either directly or indirectly. 
- Variation in X and Y is caused by some third factor Z. 
- Chance: we just happen to have some values that look similar.


![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494873151294_image.png)


Given that:

![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494873259738_image.png)


Interesting fact correlation coeeficient seems to be very similar to the equation for the angle between two vectors. 

From quora: (https://www.quora.com/Why-are-correlation-and-cosine-so-closely-related)

> The correlation between two random variables is the cosine of the angle between them once you introduce the natural geometry on the appropriate infinite dimensional space.

What correlation says:

![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494873748329_image.png)



## Pearson’s correlation coefficient

Same shit as normal correlation but applied to the sample of the data:

![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494873961353_image.png)


Given 

![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494874025435_image.png)





# Hypothesis Testing and χ²
## Significance


![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494876012140_image.png)

![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494875988645_image.png)





![](/resources/inf1-da_images/s_806400F9AEDA6771C2BF50C09F41AA631B8666AA3E9B5876C8503CE541D9B931_1494876196678_image.png)


