---
title: Install You A Haskell
layout: page
---

This guide walks you through getting your development environment set up for INF1-FP on your computer.

## DICE (School of Informatics' computers)

... todo ...

## Windows

... todo ...

## macOS INSTRUCTIONS INCOMPLETE

1. **[Get Homebrew](https://brew.sh/)** — this is a package manager that allows you to install and uninstall software on your computer.

   Do not continue until you have Homebrew installed.
2. **Install Haskell Platform**

   Open up **Terminal.app** and type the following command: `brew cask install haskell-platform`, and press Enter.
   
   This command will install Haskell Platform (the Haskell environment) for you on your computer. It will prompt you
   for your administrator password, so do not walk away just yet.
3. **Install Visual Studio Code**

   In the terminal, type the following command: `brew cask install visual-studio-code`, and press Enter.
   
   This is the code editor we recommend you to use. You should now have "Visual Studio Code.app" in your Applications folder.
4. **Set up the _Haskero_ extension**

   Haskero is the extension we will use to improve Haskell support in Visual Studio Code.
   
   Haskero has some prerequisities, so first run these commands in a terminal:
   1. `stack config set system-ghc --global true`
   2. `stack build intero`

   Now install the extension by clicking install on the [extension page](https://marketplace.visualstudio.com/items?itemName=Vans.haskero). If that doesn't work, try this:
   1. Open up Visual Studio Code either by selecting it in the Applications folder, or by typing `code` in the terminal.
   2. Click the "squares" icon in the sidebar. This should open up the "Extensions" pane.
   3. Type "Haskero" in the search field, and press Enter.
   4. Click "Install" on the search result. Click "Yes" if it asks to install dependencies.
   5. Click the "Reload" button to reload the current window (this will start the Haskero extension)
 5. **Set up the _Phoityne_ extension**
 
    This extension allows you to run your Haskell code right within the editor.
 
    1. This extension also has a prerequisite. Run this command: `stack install phoityne-vscode`.
    1. ... _todo_: add `~/.local/bin` to path ...
    1. Click Install on the [extension page](https://marketplace.visualstudio.com/items?itemName=phoityne.phoityne-vscode).


## Further reading
 
 - [Haskero webpage](https://marketplace.visualstudio.com/items?itemName=Vans.haskero)

