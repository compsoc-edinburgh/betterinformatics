# Better Informatics

# [start](https://github.com/compsoc-edinburgh/betterinformatics/tree/master/_sections/start) - [inf1](https://github.com/compsoc-edinburgh/betterinformatics/tree/master/_sections/inf1) - [inf2](https://github.com/compsoc-edinburgh/betterinformatics/tree/master/_sections/inf2) - [inf3](https://github.com/compsoc-edinburgh/betterinformatics/tree/master/_sections/inf3) - [inf4](https://github.com/compsoc-edinburgh/betterinformatics/tree/master/_sections/inf4) - [masters](https://github.com/compsoc-edinburgh/betterinformatics/tree/master/_sections/masters)

## Guidelines for contributing

- In order to contribute you will need GitHub account.
- If you would like to make a major change, or a change to the overall visual design, [submit an issue](https://github.com/compsoc-edinburgh/betterinformatics/issues/new) with your idea proposal first.
- Most of the content right now is in the `_sections` directory, so [click here](https://github.com/compsoc-edinburgh/betterinformatics/tree/master/_sections) to view the list of sections to edit.
- Pull requests are accepted, but we encourage you to create an issue to add your GitHub username to the whitelist. Then you can edit this repository yourself (you don't have to send a PR!) **We trust you!**

## Philosophy

1. **_Trust by default._ No pull requests, no "approvals", just contribute!**
  - Why? To reduce the barrier to entry and to make it so that you can feel like adding whatever you want to add.
2. **_Maintain history._**
  - Why? Over time we accumulate a lot of knowledge and resources. We shouldn't lose it.
  - History also tends to repeat itself (inf1a split into two courses, and merged back into one course)
  - Avoid deleting courses, just archive them. Sometimes these courses will come back!
3. **_Share ownership._**
  - Don't put things in your personal workspace, you won't be around forever!
4. **_Every little helps._**
  - Found a page that explained something really well? Add it here, and others will benefit too!

## Systems

There are two main sources of Information on Better Informatics:

- GitHub: contains the content
  - It means that the timeless content is backed up somewhere on a familiar, easy to use platform (GitHub)
  - The content is not vendor lock-in. It's just a Git repo!
  - Full history is maintained and there's a standard Git interface to the content.
  - It's renderable (using Jekyll) to betterinformatics.com
- Google Shared Drive: contains past paper solutions & other useful documents
  - Google Docs is pretty fantastic for collaborative work, so it's an obvious solution that will never die.
  - The reason we use a shared drive is because previously a regular Drive (non-shared) was used, and this was a mess of permissions. File authors don't stay at uni forever, and when they graduate, they would stay as file owners. It's important that existing students can administrate or manage all the files.
  - Using a Shared Drive means that access management is centralised & all the current students own the file, rather than just the people that created them.

There are other stuff involved, but these two systems are integral to the running of Better Informatics. Even if Tardis goes down, the website can fail over to GitHub Pages and all the content is readable. New people can't be added to Google Drive when the backend goes down, and links might break (this could be worked around!), but people can still access files directly in Google Drive.

## Design Philosophy

Change can be good, but it's really important not to alienate users. Students are lazy and if it's hard to find something, they might not bother to find it, especially if they don't know it exists.

An attempt is made to generally stick to the website design originally created in 2012.

## How do you merge courses?

Sometimes two courses become one course. There's two things you can do.

**Example 1: still keep the cards separate**

In _2018/19_, when **Informatics 1: Functional Programming (INF1-FP)** and **Informatics 1: Computation and Logic (INF1-CL)** merged to become **Informatics 1: Introduction to Computation**, we just kept them as separate sections in Better Informatics.

We did this because even though administratively (system-wise) the course was one course; the lecturers remained distinct, with separate lectures, labs and tutorials.

This is OK, because even newer students that never saw INF1-FP and INF1-CL still refer to each half of the course as FP and CL.

**Example 2: actually merge the cards**

In _2019/20_, when **Computer Architecture (CAR)** and **Computer Design (CD)** merged to become **Computer Architecture and Design (CARD)**, we chose to merge them into one section.

This is because these two courses were truly merged together to form a new course. (Well, at least qaisjp hopes this is the case.)

It's worth noting that in this case the lecturers from both courses are now running **CARD**, which is similar to how the lecturers shared the course in Example 1 (INF1A).

Unfortunately, the course content is hidden on Learn to those not taking the course. So qaisjp can't actually check if they are distinct.

Usually actually merging the cards together is the best option. The code doesn't get confused, and neither do users.

To actually merge two files into one, it's worth referring to this Git article: [Stupid git tricks: Combining two files into one while preserving line history]. This way history is maintained!

[Stupid git tricks: Combining two files into one while preserving line history]: https://devblogs.microsoft.com/oldnewthing/20190514-00/?p=102493
