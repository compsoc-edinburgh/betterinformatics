---
year: 3
credits: 20
archived: false
title: IDB -	Introduction to Databases
course-acronym: idb
links:
---

_Previously named Database Systems (DBS)_

- Questions and answers from the DBS textbook - [link](http://pages.cs.wisc.edu/~dbbook/openAccess/thirdEdition/solutions/ans3ed-oddonly.pdf)
- [Normal Form checker (both BCNF and 3NF)](http://raymondcho.net/RelationalDatabaseTools/RelationalDatabaseTools)
- [Revision notes by Ben Shaw](https://github.com/benshaaw/revision/tree/master/DBS)
- [Relational algebra calculator / engine](https://dbis-uibk.github.io/relax/), [example schema definition for tutorial 1](https://gist.github.com/Visgean/8467b0196f9d88be8b2a8da890a7433a)
- Exam tips:
  - Don't forget semicolons, they will knock marks off for this!
  - They want to see efficient solutions!
  - [Derivation using the Armstrong’s axioms](https://i.imgur.com/6naWb9G.png): all steps and axioms in your derivation should be clearly mentioned
    - It's also worth understanding that there could be multiple correct proofs for a given implication so detailed explanations would make it easier for marker 
  - Relational algebra questions: consider how your answer behaves when certain relations are empty (tutorial 1, question 3)
- Relational algebra FAQ:
  - Operations only return unique tuples. That means if you project on a single column, each row will be unique. This is because (definition) _"Relations (tables) are **sets** of records of the same length"_
- easily consumable stuff by b0rk:
  - [sql queries don't start with select](https://jvns.ca/blog/2019/10/03/sql-queries-don-t-start-with-select/)
  - [sql query steps](https://twitter.com/b0rk/status/1184571894722449409?lang=en)
  - [anatomy of an sql query](https://twitter.com/b0rk/status/1189159951631093760?lang=en)
  - [how sql joins work](https://twitter.com/b0rk/status/1177611875535790087?lang=en)
- SQL to XXX FAQ (for those with experience in SQL/NoSQL)
  - Relational algebra:
    - project (pi)
      - <code>select <strong>id, name, city</strong> from customers;</code>
      - RethinkDB (NoSQL) people will know this as [`.pluck`](https://rethinkdb.com/api/javascript/pluck)
    - select (sigma)
      - <code>select * from customers where <strong>name = 'Alice' or name = city</strong></code>
      - RethinkDB (NoSQL) people will know this as [`.filter`](https://rethinkdb.com/api/javascript/filter)
  - Unknowns / `NULL`
    - `Unknown` is represented as `NULL` in SQL,
    - `unknown = unknown` is really `NULL = NULL`,
    - all comparisons where at least one of the arguments is `NULL`, evaluates to unknown (which, again, is `NULL`).

<!--- NEED TO UPDATE THE DOCUMENTS [Unofficial solutions - 2011 & 2012](http://docs.google.com/document/d/1Ir_z-F6uWDXmYVomfJdL1hlsWfgbPW8c0gx6bHmTHxo/edit)
[May 2013](https://docs.google.com/document/d/188xL9h_Gs4vBvYiTsBbDMLR66GZBKQqxz9R1Nf0rx1I/edit?usp=sharing)
[August 2013 resit](https://docs.google.com/document/d/1rzK29pfwig18WOvdQmh131nR2Hhqtj5tFI5Qu1hMgaI/edit?usp=sharing)
[May 2014](https://docs.google.com/document/d/1H_kUYAsc1XaDT6BSHiUk69SWi-ydGWjCTPgh1YzwzNA/edit?usp=sharing)
[August 2014 resit](https://docs.google.com/document/d/1dlCLqABcEtYYxMtrtlj7QPXJdjXMDsw_dmfXqTP3fiI/edit?usp=sharing)  --->
