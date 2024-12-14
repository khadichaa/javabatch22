

# Git

- Code tracking tool that is used to share project files and colloborate between
  people who are working on same project.
- Git si a version control, that is used





# How Do We Send Our Code To a Git Repository For The First Time?
1. Create a repository for your code base on `GitHub`.
2. Create an **Personal Authorization Token (PAT)**
   * **How do we create PAT**
     1. Go To Settings in your `GitHub` dashboard
     2. On the setting scroll down and find **Developer Settings**
     3. On the developer settings, find **PAT**
     4. Create one
     5. Once you created it will show your **PAT** to you and you have to copy it somewhere you can find later
     6. The **GitHub** shows your PAT only one time to you
     * **What happenes when you loose PAT**
       - Don't worry about it because, you could just create a new one and use it

    

* **First 2 steps were about GitHub platform now we will start using `Git` technology.**

3. Find your project directory on your local in the terminal.
   * To find the location, just open the intelliJ and go to your project directory 
     right click and copy **PATH**.
   
4. Initialize `git` on the project directory
   * This tells the `git` technology that you are going to use git as a 
     version control on your project.
   * At this steps `.get` directory, which tracks all the changes in your 
     project will be created.
   * Enter the command following on the terminal -> **`git init`**
   
### Note! To find the location of the file/directory just drag and drop directory/file to 
### terminal/powershell and it will show the location
### NOTE! to see where you are on the terminal use `pwd`

5. Add the change files that you would like to share in your repository
   * **How can you see which files have been added previously?**
      - **`git status`**: Allow you to see which changes have been added,
        and which have been changed but not yet added
   * **How do i add a changed file?**
      - **`git add`**: Git add command followed by the name of the file that you
        want ot add, such as `git add filename`
   * **What is you want to add all your changes?**
      - `git add -A`: adds all the changed files.
   * In the step **added** files are still in **local** but in staging area.
   * Staging is still in local, but it is a group of files that is set to goto the remote.

6. Commit the finalized changes
   * Once our changes are finalized, I will commit witht a massage to state that 
     there won't be any changes for this sequence.
   * `git commit -m "Commit message here"`: Git command must be used with
     a message. In the message usually you define what are the changes in the commit.
   * Our code is still in **local**.

7. Push the code for the first time
   * Pushing the code, sends all the commited files to remote repository
   * In order to have a succesful push for the first time:
        1. You must have remote repository defines in your gut directory.
           - `git remote add remoteName remoteUrl`: remoteName: can be anything
             RemoteUrl is the url from your github repository
        2. You must have a main branch: (You create a main branch one time)
           - `git branch -M mainBranchName` : Main branch name could be anything
     * For the **first push** you enter `git push -u remoteName mainBranchName`
      ```bash
     git push -u origin main
     ```

     * After the first push you only need to do `git push`

