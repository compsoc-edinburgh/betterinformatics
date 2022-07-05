---
year: 4
title: Honours Project
course-acronym: proj
pinned: true
learn: false
---

- You can manage citations with [JabRef](https://www.jabref.org) or [Zotero](https://www.zotero.org)
- Use [DBLP](https://dblp.org) to generate .bib citations over Google Scholar
- Write your Intro, Conclusion and Abstract last — your project might change by the time you've written everything else.
    - Abstract: The advertisement for your paper. You want to start with a very general scope and narrow down to specifics very quickly. Don't use jargon. Do flex your results.
    - Introduction: Similar in that you want to be general, but you have more space. You need to talk about the Motivation, Objective, Contribution and Organisation.
    - Conclusion: An overview of the project and your results. You'll want to have "Critical evaluation of own work" in here and also discuss how the project has helped you (the latter isn't in the marking scheme however was advised to include this).
- Ask your supervisor if you can use "I" and what tense to use. My supervisor banned "I" and mandated past tense, YMMV. You probably want to avoid 2nd person (you) and use "one" instead.
- Find some linter or other tool to check the LaTeX you have written before submission. There are a bunch of small things you can do to make things render nicely: for example, \`\`quote'' instead of "quote", `---` instead of —, etc.
- You can use `\autoref{chapter-introduction}` which will expand to `Chapter \ref{chapter-introduction}`
- If you are writing a MInf2 thesis, refer to the first part as "Part One"
- [Outstanding undergraduate projects](https://www.ed.ac.uk/informatics/undergraduate/our-degrees/outstanding-undergraduate-projects) - Recent dissertations which have scored 80% and above.
- [A Template-based Model for Automatic Image Description (2014)](https://drive.google.com/file/d/0B2AAOQQZ_8BxdXpkWlpfczQ0dFU/edit?usp=sharing), [feedback](https://drive.google.com/file/d/0B2AAOQQZ_8BxVk5DX0hNSGU1Qjg/edit?usp=sharing), with Mirella Lapata (83%)
- [<u>WILDEBEAST: A webservice for real time characterisation of infectious disease epidemics, supervised by Andrew Rambaut (80%)</u>](http://rmoola.com/finalWriteup.pdf)

**Binding**

You do not need to get your thesis bound for submission. However you may want a nice printed copy of your thesis as a record of your hard work or it makes a nice gift for your parents. The [University Printing Services](https://www.ed.ac.uk/information-services/research-support/publish-research/scholarly-communications/binding-services) will hardback bind your thesis with gold foil lettering on the spine for £19 + 0.05(# b&w pages) + 0.4(# colour pages). 

Formatting your thesis for binding:
- If you want two sided printing, add `twoside` to your options
- The default top margin is 2cm and the bottom is 4cm, I think it looks nicer with `\geometry{a4paper,left=4cm,top=2.5cm,right=2.5cm,bottom=3cm,twoside}` which is set in infthesis.cls
- Use a linter like https://www.dainiak.com/latexcheck/ to make sure you're doing LaTeX good

If you have done a two-part MInf, it is preferable to have both parts of your MInf in the same book. The best way to do this is to duplicate one of your parts and copy the Introduction to your Conclusion of the other one into it. You will most likely need to fix a bunch of errors with bibliography entries needing to be copied over or adding `\usepackage` statements. Then you can add `\part{Title of Part 1}` and `\part{Title of Part 2}` before each respective part so that the table of contents is formatted properly. You will then need to think of a new title for the project as a whole for the `\title{}` and merge the abstracts and acknowledgement sections. 
 - For two-part MInf, override the submityear with the years that you did the project in infthesis.cls like so `\gdef\@submityear{2020 -- 2022}`

