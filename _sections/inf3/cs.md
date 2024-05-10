---
year: 3
credits: 20
archived: false
title: CS - Computer Security
course-acronym: cs
links:
---

- [August 2010 answers](http://mess.ninjalith.com/cs/exams/2010_resit)
- [May 2010 answers](https://docs.google.com/document/d/1u0d0ybDWt_V0Of9sZMqxwg1tyuVzsdKAkrx6Wq31FK8/edit?usp=sharing)
- This explains BLP and AB much better than the slides: [i93lbacm(org).pdf](http://profsandhu.com/journals/computer/i93lbacm(org).pdf)
- Some really great explanations of concepts in the course (Crypto, PK, RSA, Diffie-Hellman): [http://www.youtube.com/user/ArtOfTheProblem](http://www.youtube.com/user/ArtOfTheProblem)
- [Stefi's Quizlet (23/24)](https://quizlet.com/behiindthesea/folders/computer-security?i=1ru0hz&x=1xqt)
- [Revision notes by Ben Shaw](https://github.com/benshaaw/revision/tree/master/CS)
- Running 2nd CW locally (on Ubuntu):
  - Copy folder ``/afs/inf.ed.ac.uk/group/teaching/compsec/cw2/``
  - Follow instruction at https://help.ubuntu.com/community/KVM/Installation
  - Modify your ``qemu.env``, the location to QEMU should be something like ``/usr/bin/kvm``
  - Install vinagre: ``sudo apt install vinagre``
- [Iptables essentials](https://www.digitalocean.com/community/tutorials/iptables-essentials-common-firewall-rules-and-commands)
- Wireshark:
    - [The "Packet List" pane in Wireshark](https://www.wireshark.org/docs/wsug_html_chunked/ChUsePacketListPaneSection.html) (see Table 3.15. for what the lines on the side mean)
  - [Convert IP addresses into hostnames](https://osqa-ask.wireshark.org/questions/37680/can-wireshark-automatically-resolve-the-ip-address-into-host-names) (Edit - Preferences - Name Resolution)
- FTP:
  - [A walkthrough through FTP passive mode, by manually reading every single packet](http://betterinformatics.com/drive?next=1ptpzrY3aEGmHKe7j5y6xgSjoAc9TNUpXWx2LHMMOOoM)
  - [List of raw FTP commands](http://www.nsftools.com/tips/RawFTP.htm)
  - [Difference between FTP active and passive mode](https://slacksite.com/other/ftp.html)
    - tip: read it carefully, not just the bullet points. the picture is useful too.
    - tip: for some reason, in active mode, the source _data_ port is not 20 (in the coursework)
  - How to test FTP active mode:
    1. Run `ftp alice`
    2. Type `alice` as username, press enter, type `alice` as password.
    3. Type `get meow.jpg`
    4. meow.jpg should be downloaded & it should say "please consider using passive mode"
- Software Security
  - [return-to-libc.pdf](https://css.csail.mit.edu/6.858/2018/readings/return-to-libc.pdf)
  - [Return-to-libc tutorial](https://www.exploit-db.com/docs/english/28553-linux-classic-return-to-libc-&-return-to-libc-chaining-tutorial.pdf)
  - [buffer overflow attacks](https://youtu.be/1S0aBV-Waeo) (computerphile)
