# Git Commands: Restore, Revert, and Reset

Let’s break down the different commands—`git restore`, `git revert`, and `git reset`—and how they help us undo changes in Git. Each command has a unique purpose and use case for handling mistakes or revising commits in different ways.

## 1. `git restore`

The `git restore` command is used primarily to work with changes in the working directory or staging area. It doesn’t alter commit history but can help discard or revert changes in files before committing.

### Use Cases of `git restore`

- **Unstage a file**: Remove files from the staging area without deleting the changes from the working directory.
- **Discard uncommitted changes**: Revert changes in files back to the last committed state in the working directory.

### Example Usage of `git restore`

Suppose you modified `file1.txt` and `file2.txt` but decide you want to undo these modifications.

1. **Reverting changes in the working directory:**

    ```sh
    git restore file1.txt
    ```

   This command restores `file1.txt` to its last committed state, discarding any local modifications.

2. **Unstage changes (if files are already added to staging):**

    ```sh
    git add file2.txt
    git restore --staged file2.txt
    ```

   This removes `file2.txt` from the staging area but keeps the changes in the working directory.

## 2. `git revert`

The `git revert` command is used to undo a commit by creating a new commit that “reverses” the changes of a previous commit. Unlike `git reset`, it does not rewrite history; instead, it’s a safe way to undo changes without affecting the commit history. This makes it ideal for undoing changes on a shared branch (like `main` or `master`).

### Use Cases of `git revert`

- **Undo specific commits**: Create a new commit that undoes the changes of a specified commit.
- **Maintain history**: Because it doesn’t rewrite history, it’s safe to use in collaborative settings where other team members are working on the same branch.

### Example Usage of `git revert`

Suppose you want to undo the changes introduced in a specific commit, identified by the commit hash `abc123`.

1. **Revert a specific commit:**

    ```sh
    git revert abc123
    ```

   This creates a new commit that reverses the changes of `abc123`. After running this command, you’ll be prompted to enter a commit message for the revert commit.

2. **Revert multiple commits:**

   To revert a range of commits, you can use:

    ```sh
    git revert abc123..def456
    ```

   This command will revert each commit in the specified range one by one, in reverse order, creating separate revert commits for each.

## 3. `git reset`

The `git reset` command is powerful and has three modes—`--soft`, `--mixed`, and `--hard`—that provide different levels of undoing changes. Unlike `git revert`, `git reset` can rewrite history, making it suitable for local branches but risky for shared branches.

### Use Cases of `git reset`

- **Unstage changes**: Remove files from the staging area without touching the working directory.
- **Remove commits**: Completely undo commits by moving the branch pointer backward.

### Example Usage of `git reset`

#### Reset Modes:

- `--soft`: Moves the branch pointer but keeps all changes in the staging area.
- `--mixed`: Moves the branch pointer and keeps changes in the working directory but removes them from the staging area (this is the default).
- `--hard`: Moves the branch pointer and discards changes in both the working directory and the staging area.

1. **Undo the last commit but keep changes staged:**

    ```sh
    git reset --soft HEAD~1
    ```

   This will remove the last commit (`HEAD~1`), but the changes will remain in the staging area, ready for a new commit.

2. **Unstage changes (similar to `git restore --staged`):**

    ```sh
    git reset --mixed HEAD
    ```

   This unstages all changes, keeping them in the working directory without altering the code.

3. **Discard all changes completely:**

    ```sh
    git reset --hard HEAD~1
    ```

   This moves the branch pointer back by one commit and discards all changes in the working directory and staging area, effectively removing all trace of the last commit.

## A Practical Example: Combining These Commands

Suppose you’ve made three commits and realize the last commit was a mistake. Here’s how you might fix it:

- **If you want to keep the changes and simply unstage them:**

    ```sh
    git reset --soft HEAD~1
    ```

- **If you want to keep the changes in the working directory only:**

    ```sh
    git reset --mixed HEAD~1
    ```

- **If you want to discard everything and start fresh:**

    ```sh
    git reset --hard HEAD~1
    ```

## Summary Table

| Command | Purpose | Alters Commit History | Example Command |
|---------|---------|------------------------|-----------------|
| `git restore` | Discard uncommitted changes in files | No | `git restore file1.txt` |
| `git revert <commit>` | Undo a specific commit by creating a new commit | No | `git revert abc123` |
| `git reset --soft <ref>` | Move the branch pointer, keep changes staged | Yes | `git reset --soft HEAD~1` |
| `git reset --mixed <ref>` | Move the branch pointer, keep changes in working directory | Yes | `git reset --mixed HEAD~1` |
| `git reset --hard <ref>` | Move the branch pointer, discard all changes in staging and directory | Yes | `git reset --hard HEAD~1` |

Choosing the right command depends on your needs, whether you want to alter history (`reset`), keep history intact (`revert`), or simply modify files in the working directory (`restore`).