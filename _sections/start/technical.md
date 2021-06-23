---
year: start
title: Technical
---

- [Set your initial DICE password](http://pp.inf.ed.ac.uk/)
- [DICE Troubleshooting](/resources/dice) - audio not working? window manager crashing?
- **Web printing interfaces**: [EveryonePrint](http://www.everyoneprint.is.ed.ac.uk), [WebPrint](http://webprint.inf.ed.ac.uk), [ManagePrint](http://www.manageprint.is.ed.ac.uk)
- How to print:
  - Colour: `lpr -o sides=two-sided-long-edge -P cloudc0 FILENAME.pdf`
  - Mono: `lpr -o sides=two-sided-long-edge -P cloudm0 FILENAME.pdf`
- [Remote access to DICE machines](https://gist.github.com/vaidap/41ff0abaa8ab35c771568dd129114f3a)
- [Access DICE files in a web browser](https://ifile.inf.ed.ac.uk/) (iFile)
- [Accessing DICE remotely](http://computing.help.inf.ed.ac.uk/remote-desktop/) (RDP, remote desktop)
- [Virtual DICE (VM)](http://computing.help.inf.ed.ac.uk/vdice) : Supports VirtualBox, VMWare support under development
- [University VPN service](http://www.ed.ac.uk/schools-departments/information-services/services/computing/desktop-personal/vpn/vpn-service-using)
- [DICE contact form](https://www.inf.ed.ac.uk/systems/support/form/) (computing support)
- [Information Services contact form](https://ed.unidesk.ac.uk/tas/public/) (unidesk)
- **GPU on DICE** (for Tensorflow GPU, etc) - read [GPGPU Computing](http://computing.help.inf.ed.ac.uk/gpgpu-computing)
    ```
    export PATH=/opt/cuda-10.0.130/bin:$PATH
    export LD_LIBRARY_PATH=/opt/cuda-10.0.130/lib64:/opt/cuDNN-7.6.0.64_9.2/lib64:$LD_LIBRARY_PATH
    ```
- **Setting up Thunderbird 78+ for Office 365 Mail + Calendar**

  The University no longer officially supports Thunderbird (due to so many technical problems students faced). However, we (betterinformatics) believe quite a large number of Informatics students use Thunderbird, and therefore provide active and up-to-date instructions here. TB78 is a requirement, as the OAuth2 authentication method was introduced with this update.

  First we'll set up the mail account.

  1. Add a new Thunderbird mail account. Enter the name and email (which can be either f.last@sms.ed.ac.uk or sUUN@ed.ac.uk, or any of the other countless aliases we have)
  2. Click "Configure Manually", and enter:
     - Incoming: IMAP, outlook.office365.com, port 993 SSL/TLS, and your sUUN@ed.ac.uk email as the username (overwrite if necessary)
     - Outgoing: SMTP, outlook.office365.com, port 587 STARTLS, and your sUUN@ed.ac.uk email as the username (also overwrite if necessary)
  3. Click "Advanced Config", confirm the warning, and sign in on the Office login popup. If it doesn't appear, don't worry, it'll appear as you progress through the next steps.
  4. Go to TB Account Settings, and under Server Settings for the new account, set the Authentication Method to OAuth2.
  5. In addition, under the Outgoing Server settings (bottom of account list), edit the Office365 server and set the Authentication Method to OAuth2 here too. Make sure the username here is your sUUN@ed.ac.uk (regardless of which format you chose first)
  6. At this point, your mail should start loading. If some folders are not visible, you may have to manually subscribe to them (search Google)

  Now onto setting up Calendar integration, so you can respond to meeting invitations using the TB interface.

  1. Install the "TbSync" add-on, and the "Provider for Exchange ActiveSync" add-on.
  2. From the footer of the mail tab, click on the TbSync status on the far bottom right. Then click "Account Actions" -> "Add new" -> "Exchange ActiveSync".
  3. Choose Office365, and fill the Account name with what you chose in step 1 of the email phase, and fill the Username with sUUN@ed.ac.uk.
  4. Click "Add Account" and sign in on the Office login popup.
  5. Tick "Enable and synchronise this account" to enable, then tick "Calendar" and "Contacts" (optional) and hit "Synchronise Now".
  6. Once they are synchronised, set the sync interval to 15 minutes.
  7. All done :)
