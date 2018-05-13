---
title: Logic 1
year: 1
semester: 2
ordering: 5
archived: true
links:
  - name: course page
    url: http://brianrabern.net/logic1.html
  - name: homework
    url: http://www.elogic.brianrabern.net/login
  - name: tutorial videos
    url: http://brianrabern.net/elogic/elogic-tutorial.html
---

- These notes assume you have done INF1-CL.
- if P, then Q
  - P is the **antecedent**
  - Q is the **consequent**
- **English to implication**
  - `P -> Q`: If P, Q
  - `P -> Q`: P, only if Q
  - `Q -> P`: P, if Q
  - `Q -> P`: Only if P, Q
- Inference rules:
  - `dn`, double negation: `P` becomes `~~P`
  - `r`, repetition: `P` becomes `P`
  - `mp`, modus ponus: `P -> Q`, `P` becomes `Q`
  - `mt`, modus tollens: `P -> Q`, `~Q` becomes `~P` 
- Kinds of derivations:
  - `dd`, direct derivation (`2,dd` means that rule 2 is the derivation)
    - When a line (which is not a show line) is introduced whose
sentence is the same as the sentence on the (closest previous
uncancelled) show line, one may, as the next step, write “dd”
following the justification for that line, draw a line through
the word “Show”, and draw a box around all the lines below
the show line, including the current line.
  - `cd`, conditional derivation
  - `id`, indirect derivation
- Definitions:
  - An argument is a sequence of sentences, consisting of
premises and a conclusion, where the conclusion is what is
trying to be established, and the premises, taken together,
are alleged to support the conclusion.
