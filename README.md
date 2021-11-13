# 261218-hw-release
Released code for 261218 homework assignments

## Code release structure
The repository contains the following subdirectories:
* [src] directory contains the code being released, including
template for what you should work on.
* [hw?tests] directory contains test cases for appropriate problems.
Use file names to help match a test case with a problem.

There may be additional directories as the course progresses.
Some files may change locations as the course progresses.

## Managing source
The released code has been implemented and tested on
Visual Studio Code and IntelliJ IDEA,
but it is possible to make it work with other IDEs also.

### Visual Studio Code
* Once you clone the Git repository, add this folder as a top-level folder
in your workspace.
* Install the Java Test Runner extension.
* Above the `main` method, there should be the "Run" command that you can
click on.
    * There will be an error message that says,
    "Build failed, do you want to continue?"  Click on Proceed.
    * This should produce some output without errors.
    If you get a `FileNotFoundException`, check that your top-level folder for
    your workspace is this directory and not some other.

### IntelliJ IDEA
* If you are using IntelliJ IDEA as your IDE, creating a new project using
"Project from Existing Sources...", with this directory as the main project
directory, should set everything up for you nicely.
    * To see the documentation for a method, press Ctrl+Q after clicking on
    the method name.
* In most IDEs, there should be an option to select a certain directory
as a _source_ directory.  In this release, it is the [src] directory
that should be selected.
* Then, subdirectories of the [src] directory contain many source files
under many packages.  In Java, a directory represents a package.  If you
set the source directory correctly, the packages should be in the right
places for the Java compiler to look for.

## Dealing with test cases
Sample test cases are located in the [hw?tests] directory at the top level.
If you use IntelliJ IDEA, running the program should look for these files
without much trouble, because the working directory is the main
project directory.  If you use other IDEs, you might need to set
the working directory to point to [hw?tests] when running the code, or change
the path of the file in the released programs to point to the correct location.
Don't worry, our grader will find our own test cases at the right places
regardless of how you change the string indicating the location of the
test case you are trying.

The format of test cases may be underspecified, so look for how the main
programs read them.

##

If you have any questions, please contact the instructor for help on Piazza.
Our goal is to make you feel challenged when solving algorithmic problems,
not when you are trying to get the released code to run.  Therefore, get
the released code runnable as soon as possible, and ask for help when you
feel so.
