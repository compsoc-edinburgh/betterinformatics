# Better Informatics

## Add files to one of these folders: [start](https://github.com/compsoc-edinburgh/betterinformatics/tree/master/_sections/start) - [inf1](https://github.com/compsoc-edinburgh/betterinformatics/tree/master/_sections/inf1) - [inf2](https://github.com/compsoc-edinburgh/betterinformatics/tree/master/_sections/inf2) - [inf3](https://github.com/compsoc-edinburgh/betterinformatics/tree/master/_sections/inf3) - [inf4](https://github.com/compsoc-edinburgh/betterinformatics/tree/master/_sections/inf4) - [masters](https://github.com/compsoc-edinburgh/betterinformatics/tree/master/_sections/masters)

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

There are two main sources of Information on Better Informatics which are integral:

- GitHub: contains the knowledgebase and links
  - It means that the timeless content is backed up somewhere on a familiar, easy to use platform (GitHub)
  - The content is not vendor lock-in. It's just a Git repo!
  - Full history is maintained and there's a standard Git interface to the content.
  - It's renderable (using Jekyll) to [betterinformatics.com](https://betterinformatics.com)
- File Collection: contains past papers solutions & other useful documents
  - A web service hosted on Tardis infrastructure, dedicated to study collaboration and sharing documents
  - Displays snippets from this GitHub repo as embedded knowledgebase articles
  - Available at [files.betterinformatics.com](https://files.betterinformatics.com)
  - Feature requests and contributions to the service itself is accepted on [our repo](https://git.tardisproject.uk/betterinformatics/edinburgh-community-solutions)

We have a third source, which is being phased out and gradually migrated to File Collection where suitable:

- Google Shared Drive: contains past paper solutions & other useful documents
  - You need to be added to a separate whitelist using your Gmail address to access this.
  - For reasons of the migration to File Collection and how you can help out, see the FAQ in File Collection.

Other services we have at Better Informatics include:

- [The Marauders App](https://github.com/compsoc-edinburgh/mapp): an effort to create an interactive map of all university lab machines
  - Currently offline, seeking contributors to try to revive it again
- [The Course List Generator](https://github.com/compsoc-edinburgh/bi-app/tree/master/courses.yaml): a script to generate courses.yaml
  - Runs every day on this repo's CI, generating an API of currently-running Informatics courses [available here](https://betterinformatics.com/courses.json)
  - Feel free to hack on this API and make interesting projects! 
- [Virtual Welcome Pack](https://github.com/compsoc-edinburgh/bi-welcome): interactive new-student guide
  - Runs at welcome.betterinformatics.com
  - Originally a student's undergraduate project, but is now open to contributions
- Any project ideas? Feel free to build it and maybe incorporate it into Better Informatics!

<sup><sub>Previously (pre-2020) the Better Informatics Jekyll page was hosted on Tardis, and offered some server-side code for automatic addition to Google Drive etc. After Tardis was temporarily shut down while it migrated to a new infrastructure, the Jekyll page has been hosted on GitHub Pages infrastructure with no moving parts (so you might see some code/text that mentions the previous infra -- feel free to update it!).</sub></sup>

DNS records are managed in [our dedicated repository](https://github.com/compsoc-edinburgh/betterinformatics-dns).

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
