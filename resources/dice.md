---
title: Troubleshooting DICE
layout: page
---

### Getting audio to work on DICE

**Automate this!** This command does the below: `pacmd set-card-profile alsa_card.pci-0000_00_1f.3 output:analog-stereo`.

Sometimes audio doesn't always work on DICE. Here's a tutorial to get it working:

1. Plug in audio to regular audio jack (not speaker+mic jack)
   
   The output device must be plugged in!
1. Open sound settings (Settings -> Sound)
   
   The settings pane can be opened up by running `gnome-control-center` from the command line.
1. At the bottom of the pane, change input mode to "duplex". If "duplex" is unavailable, try one of the options.
1. At the top of the pane, make sure the volume is full, and the volume is not muted.
1. Audio should now be working for you.

### Black screen on login (WM crashing on login)

WM = window manager

1. Use `Ctrl+Alt+F2` to access the terminal
2. Login on the terminal
3. Check if it says something like "quota exceeded". If so, you now know why your WM is not loading.
4. Delete miniconda or anaconda or anything else that may be eating your storage space.
   -  You can delete the contents of `~/.cache/tracker`, which can grow pretty big.
5. Use `freespace` to confirm you have free storage space.
6. Use `Ctrl+D` to log out of the terminal.
7. Use `Ctrl+Alt+F1` to return to the login panel.
8. Try logging in now.
