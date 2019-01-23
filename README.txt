10/1/19

Day 1: Hello
Day 2: Good Bye
Day 3: Howdy
Manually taking backups of all these versions will be inpractical.

With the help of git changes made to files are tracked. 
This is known as Version Control or Source Control.

First you need to install git for windows: (Git-2.20.1-64-bit) At 11/1/2019
First you need to create your own directory /d/KUNTAN/SwabhavRepository, in which you will save your codes.
Right click & choose "Git Bash Here"
> git init - 
Initializes empty git repository in respective folder i.e .git (hidden) folder

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

17/1/19

Every class in java by default contains "this" variable. It is hidden reference variable pointing to corresponding class's object. 
While resolving method calls on object, "this" reference variable is used.

20/1/19

Object Calisthenics: At least follow 1, 2, 6

1) One level of Indentation per method.
2) Don't use the else keyword.
3) Wrap all primitives and Strings in classes.
4) First class collections.
5) One dot per line.
6) Don't abbreviate.
7) Keep all classes less than 50 lines.
8) No classes with more than two instance variables.
9) No getters or setters (properties).

22/1/19
Comparable vs Comparator :
Comparable : Default Sorting Order, lang package, compareTo() method, String & All Wrapper Class have already implemented
Comparator : Customized Sorting Order, util package, compare() & equals() methods

Class is Entity (data, methods)
Interface exposes behaviour -> Hence, each data element, method is public.
Interfaces are polymorphic
Used to standardize the behaviour of likely classes.
Is is way to provide abstraction.
It is used to provide loosely coupled architecture.
It is used to switch implementation 

Assignment : OAD chapter (Dog Door) 2 assignment, Unit Test, TDD








 
