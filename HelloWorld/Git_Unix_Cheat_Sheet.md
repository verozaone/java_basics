# Git and Unix Cheat Sheet

## Git Cheat Sheet

### Basic Commands
```bash
git init [directory]                 # Initialize a new Git repository.
# directory: (Optional) Specifies the directory for the new repository.

git clone <repository_url> [directory] # Clone a repository from a remote URL.
# repository_url: The URL of the remote repository.
# directory: (Optional) Specifies the directory to clone into.

git status                          # Show the status of the working directory.
  -s, --short                       # Display the output in short format.
  -b, --branch                      # Show the branch and tracking info.

git add <file(s)>                   # Add file(s) to the staging area.
  .                                  # Add all files in the current directory.
  -p, --patch                       # Interactively choose changes to add.
  -u, --update                      # Add only updated files, not new ones.

git commit -m "<message>"            # Commit staged changes with a message.
  -m "<message>"                    # Specifies the commit message.
  -a, --all                         # Automatically stage changes from tracked files for the commit.
  --amend                           # Amend the previous commit.
```

### Branching and Merging

```bash
git branch                          # List branches.
  -r                                # List remote branches.
  -a                                # List all (local and remote) branches.
  -v, --verbose                     # Show last commit info for each branch.

git branch <new_branch_name>         # Create a new branch.

git checkout <branch_name>           # Switch to a branch.
  -b <new_branch_name>              # Create and switch to a new branch.
  --track <remote_branch>           # Create a tracking branch.

git merge <branch_to_merge_in>      # Merge a branch into the current branch.
  --no-ff                           # Create a merge commit even if it could be a fast-forward.
  -s <strategy>                     # Specify a merge strategy (e.g., recursive, ours, theirs).

git branch -d <branch_name>         # Delete a branch.
  -D                               # Force delete a branch (even with unmerged changes).
```

### Remote Repositories

```bash
git remote add <remote_name> <remote_url> # Add a remote repository.
# <remote_name>: A short name for the remote (e.g., origin).
# <remote_url>: The URL of the remote repository.

git remote -v                       # List remote repositories.

git fetch <remote_name>             # Download objects and refs from a remote repository.
  --all                             # Fetch from all remotes.
  -p, --prune                       # Delete stale tracking branches.

git pull <remote_name> <branch_name> # Fetch from and merge with a remote branch.
  --rebase                          # Rebase local commits onto fetched commits.

git push <remote_name> <branch_name> # Push local commits to a remote branch.
  -u, --set-upstream                # Set up a tracking branch.
  --all                             # Push all branches.
  --tags                            # Push tags as well.
  --force                           # Force push (use with caution!).
  ```

### Undoing Changes

```bash
git reset <commit>                  # Reset the current branch to a specific commit.
  --soft                             # Keep changes in the working directory.
  --mixed                            # (Default) Reset the staging area, but keep changes in the working directory.
  --hard                             # Discard all changes in the working directory and staging area.

git revert <commit>                 # Create a new commit that undoes the changes from a previous commit.
  --no-commit                       # Don't create a new commit, just update the working directory and index.

git checkout -- <file>              # Discard changes to a file in the working directory.
```

### Logging and Diffing

```bash
git log                             # Show commit history.
  -p                                # Show the changes introduced in each commit.
  --stat                            # Show file changes and statistics for each commit.
  --oneline                         # Show commits in a compact, single-line format.
  --graph                           # Show a graph of the commit history.
  --author=<pattern>                # Filter by author.
  --grep=<pattern>                  # Filter by commit message.
  -<n>                              # Limit the number of commits shown (e.g., -5).

git diff [commit1] [commit2] [-- <path>] # Show differences between commits, working directory, or staging area.
  --cached, --staged                # Show differences between staged changes and the last commit.
  -- <path>                         # Limit the diff to the specified path.
```

### Stashing

```bash
git stash                           # Temporarily save uncommitted changes.
git stash list                      # List stashed changes.
git stash pop                       # Apply the last stashed changes and remove them from the stash.
git stash apply                     # Apply the last stashed changes, but leave them in the stash.
git stash drop <stash_id>           # Remove a specific stash from the list.
```

## Unix Cheat Sheet

### Navigation

```bash
pwd                                 # Print the current working directory.
cd <directory>                      # Change directory.
~                                   # Home directory.
..                                  # Parent directory.
-                                   # Previous directory.
ls [options] [directory]            # List files and directories.
  -l                                 # Long listing format.
  -a                                 # Show all files, including hidden ones.
  -h                                 # Human-readable file sizes.
  -t                                 # Sort by modification time.
  -r                                 # Reverse order.
  -R                                 # List subdirectories recursively.
```

### File and Directory Management

```bash
mkdir <directory>                   # Create a directory.
  -p                                 # Create parent directories as needed.

rm <file(s)>                         # Remove files.
  -f                                 # Force removal.
  -i                                 # Interactive removal.

rmdir <directory>                    # Remove an empty directory.
rm -r <directory>                    # Remove a directory and its contents recursively.
  -f                                 # Force removal.
  -i                                 # Interactive removal.

cp <source> <destination>            # Copy files or directories.
  -r                                 # Copy directories recursively.
  -u                                 # Copy only if the source is newer than the destination.
  -p                                 # Preserve file attributes (mode, ownership, timestamps).

mv <source> <destination>            # Move or rename files or directories.
```

### File Viewing and Editing

```bash
cat <file(s)>                        # Concatenate and display file content.
less <file>                           # View file content page by page.
  /pattern                           # Search for a pattern.
  q                                  # Quit.

head <file>                          # Display the beginning of a file.
  -n <number>                        # Specify the number of lines to display.

tail <file>                          # Display the end of a file.
  -n <number>                        # Specify the number of lines to display.
  -f                                 # Follow the file as it grows.

echo <text>                          # Display text.
vi <file> / nano <file> / emacs <file> # Open a file in a text editor.
```

### Permissions

```bash
chmod <mode> <file(s)>               # Change file permissions.
  u                                  # User.
  g                                  # Group.
  o                                  # Others.
  a                                  # All.
  +                                  # Add permission.
  -                                  # Remove permission.
  r                                  # Read.
  w                                  # Write.
  x                                  # Execute.
# e.g., chmod u+x file.sh, chmod 755 file.sh

chown <user>:<group> <file(s)>        # Change file owner and group.
  chown user file.txt
  chown user:group file.txt

chgrp <group> <file(s)>              # Change the group ownership of a file.
```

### Process Management

```bash
ps [options]                         # List running processes.
  aux                                # Display all processes for all users.
  -e                                 # Display all processes.
  -f                                 # Full listing.

top                                  # Display real-time process information.
kill <PID>                           # Terminate a process.
  -9, -SIGKILL                       # Forcefully terminate a process.

bg                                   # Send a process to the background.
fg <job_id>                          # Bring a background process to the foreground.
jobs                                 # List active jobs.
```

### Searching and Filtering

```bash
grep <pattern> <file(s)>              # Search for a pattern in files.
  -i                                 # Ignore case.
  -r                                 # Recursively search directories.
  -n                                 # Show line numbers.
  -v                                 # Invert the match (show non-matching lines).

find <directory> [options] [action]   # Search for files in a directory hierarchy.
  -name <name>                       # Search by file name.
  -type <type>                       # Search by file type (e.g., f for file, d for directory).
  -mtime <n>                         # Search by modification time.
  -exec <command> {} \;              # Execute a command on found files.

sort <file>                           # Sort lines in a file.
  -n                                 # Sort numerically.
  -r                                 # Reverse sort.
  -k <n>                              # Sort by the nth column.

uniq <file>                           # Remove duplicate lines.
  -c                                 # Count the number of occurrences of each line.

wc <file>                             # Count words, lines, and bytes in a file.
  -l                                 # Count lines.
  -w                                 # Count words.
  -c                                 # Count bytes.
```

### Redirection and Piping

```bash
>                                    # Redirect output to a file (overwrite).
>>                                   # Redirect output to a file (append).
<                                    # Redirect input from a file.
|                                    # Pipe output from one command to the input of another.
# e.g., cat file.txt | grep "pattern" | sort | uniq -c
```

### System Information

```bash
uname -a                             # Print system information.
uptime                               # Show system uptime.
whoami                               # Print the current user.
w                                    # Show who is logged on and what they are doing.
df -h                                # Show disk space usage.
du -sh <directory>                   # Show directory disk usage.
free -h                              # Show memory usage.
history                              # Show command history.
```

---