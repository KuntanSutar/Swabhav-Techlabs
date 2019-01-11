Day 1: Hello
Day 2: Good Bye
Day 3: Howdy
Manually taking backups of all these versions will be inpractical.

Process of keeping track of records is known as git/ Version Control/ Source Control.

First you need to create your own directory /d/KUNTAN/SwabhavRepository, in which you will save your codes.
> git init - 
Creates git directory i.e .git (hidden) folder

master is name given to your current working directory i.e /d/KUNTAN/SwabhavRepository 

> git status -
Shows status of git. 
Shows uncommited/untracked file in Red color.

> git log -
Shows list of files in directory.

Then you need to commit changes made in each day to your git.
Each commit is considerd as Snapshot.

Commit Commands:
1) > git add .
2) > git commit -m 'Message to be given at the time of commit'

-m stands for Message

After commiting files color changes to Green.

Each commit will have its own Hashcode as in java.

 
For checking previous code:
> git checkout hashcode (Of the commit which you want to check. If so many hashcodes are starting from same initial digit, 
then you need to type exact 5-6 digit; otherwise initial digit is sufficient)

After checking previous code you can come back to master node by:
> git checkout master

For connecting to "remote" directory cretated on github:
> git remote -v 
-v stands for verbose output

For connecting to "remote" directory:
> git remote add origin url 
Here,
origin stands for nick name given to directory
url is url of your github directory

For adding code files into origin:
> git push origin master
Small pop-up will come up asking for Username & Password of your github account.








 