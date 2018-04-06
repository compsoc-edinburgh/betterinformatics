---
layout: page
title: How to safely run your code without crashing your DICE machine
---

This is a quick (DICE-only) guide on how to delegate a crash to another machine _nicely_.
It only works if you can run your code over the command line.

**How does it work?**

- It _almost_ crashes a remote machine instead of your machine.
- It retains the ability to disconnect from the remote machine.
- On disconnect, your processes will be killed.
- Because the memory-intensive process has been killed your remote machine will return back to normal.

**How do I do this?**

Normally you would do something like this: `python my_knn_system.py`.

- Instead, ssh into another machine `ssh gaul` (gaul is the name of the victim).
- Navigate to your code folder, and type `nice python my_knn_system.py` (or whatever your command is, but prefixed with `nice`)
- Instead of crashing, the remote machine will just slow down... a lot.
  - This is because `nice` makes `python` run at a lower priority than other processes.
- `Ctrl+C` (to exit python) will probably not work, but you can instead forcibly terminate your SSH connection.
  - To terminate your SSH connection, press Enter, followed by a tilde (`~`, shift+#), and a single dot (`.`). `~.` in total.
- Because SSH will have a higher priority over Python, SSH will notice you have disconnected, and will then proceed to kill your processes (including Python), resulting in your victim machine returning back to normal!

You can rinse-and-repeat as many times as you like. I'd recommend waiting a couple seconds for the memory on your remote
machine to clear up first, though.

_This is a note left by Qais Patankar. I'm not sure what happens if you choose `student.compute`, and do try to choose an empty machine as your "victim" machine._
