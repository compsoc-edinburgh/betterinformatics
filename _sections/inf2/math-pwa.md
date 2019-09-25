---
year: 2
semester: 2
title: PWA - Probability with Applications
course-acronym: PWA
links:
  - name: piazza
    url: https://piazza.com/ed.ac.uk/spring2018/math08067
---

80% open book exam, 20% across 10 weekly assignments. Pass: 40% in exam and course

- [better tutorial/assignment list](/resources/math-pwa/list.html) with some assignment solutions CORRECTED
- [super handy expectations sheet](https://www3.nd.edu/~rwilliam/stats1/x12.pdf)
- [Summary from the course textbook](https://betterinformatics.com/drive?next=1p2QI-ePPzbxfBcmyX8-jDQfAM4yzWzXv) - The last four pages before the index in the Ninth Edition
- [Slader Textbook Solutions - 9th Edition](http://www.slader.com/textbook/9780321794772-a-first-course-in-probability-9th-edition/)
- [Cheat Sheet](/resources/math-pwa/PwA_Cheat_Sheet.pdf) [(source)](/resources/math-pwa/pwa_cheat_sheet.tex)
- [Another cheat sheet with guides on distributions](/resources/math-pwa/probscheatsheet.pdf)
- [Joint probability distributions](http://homepage.stat.uiowa.edu/~rdecook/stat2020/notes/ch5_pt1.pdf)
- [Conditional Probability Visualisation](http://setosa.io/conditional/)
- [A visual introduction to probability and statistics](https://seeing-theory.brown.edu/index.html#firstPage) (Seeing Theory)
- [Coin Problem](https://mattmccutchen.net/math/coin-problem.pdf) - 3 heads occurring before 2 tails (continuous toss)
- [Course Summary](https://github.com/compsoc-edinburgh/bi-pwa)
- **2017-2018 notes by Edwin Onuonga**
  - _Discrete probability_: Missing combinatorics section. ([html](https://notes.eonu.net/topics/probability-theory/discrete-probability/notes.html), [pdf](https://notes.eonu.net/topics/probability-theory/discrete-probability/notes.pdf))
  - _Continuous probability_: Missing continuous markov chains, poisson processes, birth-death processes etc. ([html](https://notes.eonu.net/topics/probability-theory/continuous-probability/notes.html), [pdf](https://notes.eonu.net/topics/probability-theory/continuous-probability/notes.pdf))
- **Videos**
  - [Binomial probability](https://www.khanacademy.org/math/probability/binomial-probability-a2) (Khan Academy)
  - Intro to [Poisson distribution](https://youtu.be/jmqZG6roVqU) (jbstatistics)
  - Intro to probability (followed by conditional probability) - [playlist](https://www.youtube.com/watch?v=ibINrxJLvlM&list=PLHXZ9OQGMqxersk8fUxiUMSIx0DBqsKZS&index=65&t=0s) (Trefor Bazett) - this video to end of playlist
  - [Bayes Theorem](https://www.youtube.com/watch?v=gTaxZplxFEw&index=2&list=PLX2gX-ftPVXX6DBktUuLiax4aIjypHUVE&t=9s) (Michel van Biezen)
  - Calculus: [Iterated integrals](https://youtu.be/IO080wDQq8U) (KristaKingMath)
- **Calculators**
  - [Individual and cumulative binomial probabilities](http://stattrek.com/online-calculator/binomial.aspx)
- **Past Paper Solutions CORRECTED**

  Avoid putting the answer at the start of entry to prevent spoilers (unless it affects the question)

  - May 2018
    - **1(c)**: the correction calculation is indeed `15/56 - 15/64`, but it comes out to `0.03348...`, not the given `0.003`
    - **2(a)**: the answer is correct, but you might find it more natural to do `P(X=0)` with the binomial distribution, which produces the exact same answer (`0.2084...`)
    - **3(e)**: the third P looks like `P([..] >= 1.95)`. The arrow direction here is wrong. It should be `P([..] <= 1.95)`. The answer is unaffected, it is just the direction of the arrows that are wrong.
    - **6(d)**: don't know if the answer is correct. the claim that "changing the limits from `1, 3` to `1, 2` does not change the result" is a mistake (so both lines are indeed not equal). BUT the requirement to change the limits is STILL NECESSARY
      - the reason the limits change is because we know `XY < 1`, we also know minimum value of Y is 0.5, so `0.5X < 1`, therefore `X < 2`
    - **7(a)**: the stated [`P^2`](https://www.symbolab.com/solver/step-by-step/%5Cbegin%7Bpmatrix%7D0.5%260.5%260%5C%5C%20%20%20%20%20%200.7%260%260.3%5C%5C%20%20%20%20%20%200.2%260%260.8%5Cend%7Bpmatrix%7D%5E%7B2%7D) and [`P^3`](https://www.symbolab.com/solver/step-by-step/%5Cbegin%7Bpmatrix%7D0.5%260.5%260%5C%5C%20%20%20%20%200.7%260%260.3%5C%5C%20%20%20%20%200.2%260%260.8%5Cend%7Bpmatrix%7D%5E%7B3%7D) are incorrect. This affects the *numbers* for the rest of 7(a). 7(b) and 7(c) are not affected by this mistake.
    - **9(c)**: the stated `H(Y)` has correct working out, but doesn't evaluate to `1.436`, it evaluates to `1.561...`
    - **10(a)**: Simple arithmetic error at the end, `1 - (5/6)` is not equal to `1/5`, it is equal to `1/6`. Morons.

<!--
https://math.stackexchange.com/questions/915353/the-probability-of-having-k-successes-before-r-failures-in-a-sequence-of-ind/915359#915359
-->
