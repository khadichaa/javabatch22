
# `.gitignore` File

## What is `.gitignore`?

 * A `.gitignore` file is used in *Git* to specify which files and 
   directories should be ignored by Git when tracking changes.
 * Files listed in this files are not added to the staging area,
   committed, or pushed to the repository.
 * Commonly used to exclude sensetive data, system files, 
   or unnecessary files that do not need version control.


# HOw does `.gitignore` work?

1. **Location**: Place the `.gitignore` files in the root of your repository.
2. **Behaviour**:
    * When you run `git add`, Git check the `.gitignore` file to determine which file to exclude.
    * Ignored files are not tracked in the repository
   
3. **Effect**
    * `.gitignore` applies only to files **that are not already tracked**. If a file is already 
      tracked and later added to `.gitignore`, you must remove it from Git's tracking using:
   ```bash
   git sm --cached filename
   # To untrack the file
   ```

## What to put in `.gitignore`?
### Common examples

1. **System/ environment files**
   * OS - Specific files (e.g., .DS_Store, Thumbs.db)
   * IDE files (e.g., .idea, .vscode ect.)
   * Environment configuration files

2. **Build/Output Files**
   * Compiled code (e.g., .class, .pyc)
   * Build directories (e.g., dist/, build/)
3. **Logs & Temporary Files**
4. **Files that contains sensetive data**


## Patternt Rules in `.gitignore` file
1. **Files Ending With Certain Extensions:**
   * Use `*` to represent any file name.
   ```.gitignore
   * .log # ignores all .log files.
   *.class # 
   ```














