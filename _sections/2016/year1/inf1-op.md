---
title: Object Oriented Programming
year: 1
semester: 2
cohort: 2016
links:
  - name: course
    url: http://www.inf.ed.ac.uk/teaching/courses/inf1/op/
  - name: labs
    url: http://www.inf.ed.ac.uk/teaching/courses/inf1/op/2017/labs/index.html
  - name: piazza
    url: https://piazza.com/ed.ac.uk/spring2017/inf1op/
---
-   **Allocations**: [tutorials], [labs]
-   **Labs**
    - There is nothing to submit. Attendance is not recorded.
    - You only need to fill out the online form at the end of the week to record your progress.
-   **[Tutorials](http://www.inf.ed.ac.uk/teaching/courses/inf1/op/tutorials.html)** (read this document!)
    - These start on week 2.
    - There are exactly [two tutorials] taking place in every time slot. You do not need to stick to the same room each week.
      - 1.B09 for the Fundamental tutorial
      - 1.B10 for the Advanced tutorial
    - _[Which tutorial should I go to?](http://www.inf.ed.ac.uk/teaching/courses/inf1/op/tutorial-list.html)_
-   **What's the deal with IntelliJ?**
    - Unfortunately, the exam is optimised for Eclipse. Apparently IntelliJ does dodgy things in the exam, making things scary.
    - It is recommended that you use Eclipse just for this course, and once you're done, move to the blissful IntelliJ.
    - If you insist on using IntelliJ, follow these steps for the first run:
      - Open the command line, and run `idea-ce`. This allows you to start the IDE.
      - On first run, it will ask you to choose some preferences.
      - Eventually, on the last screen or so, it will complain about permission issues, or needing an admin password.
      - At this point, go back to the command line, and press ctrl-c to force the IDE closed.
      - From now on, all future runs of `idea-ce` will work fine without needing to follow these instructions.
    - **Gotchas**: you can't use the "Open project" feature in IntelliJ (because of reasons). To open a project, run the `idea-ce` command with a path to the project file provided to it: `idea-ce path/to/idea/project/file/here`.
-   **Exam**
    - The exam is 2 hours. It used to be 3 hours in previous years. They will not pressure you for time, don't worry.
    - There is a mock exam in week 11.
    - All code must compile for ANY credit at all. If you miss a single semicolon, you get 0 marks. Trip-check if it compiles and is the right file before submitting!
    - Your code must also pass the very basic tests (JUnit tests, these will be provided in the exam for you to check) to get any credit at all.
-   There is no required book, but the recommended book **The Java Tutorial: A Short Course on the Basics, Addison-Wesley** is (as mentioned under the Books header of the course page) [accessible online]. It is also in the library (on paper & online).

   [tutorials]: https://portal.theon.inf.ed.ac.uk/reports/upt/open/TP072_Tutorial_Groups/inf1-op.shtml
   [labs]: https://portal.theon.inf.ed.ac.uk/reports/upt/open/TP082_Laboratory_Groups/inf1-op.shtml
   [two tutorials]: http://www.inf.ed.ac.uk/teaching/courses/inf1/op/tutorial-list.html
   [accessible online]: https://docs.oracle.com/javase/tutorial/
